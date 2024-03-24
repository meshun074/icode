package com.fdmgroup.icode.image.upload.service;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.FileSystemUtils;
import org.springframework.web.multipart.MultipartFile;

import com.fdmgroup.icode.image.upload.util.UniqueImageId;

@Service
public class FilesStorageServiceImpl implements FilesStorageService {

	@Value("${storage.directory}")
	private String storageDirectory;
	private Path root;

	@Override
	public void init() {
		root = Paths.get(storageDirectory);
		if (!Files.isDirectory(root)) {
			try {
				Files.createDirectories(root);
			} catch (IOException e) {
				throw new RuntimeException("Could not initialize folder for upload to: " 
			+ storageDirectory + "!");
			}
		}

	}

	@Override
	public void save(MultipartFile file) {
		try {
			Files.copy(file.getInputStream(), this.root.resolve(file.getOriginalFilename()));
		} catch (Exception e) {
			if (e instanceof FileAlreadyExistsException) {
				// Extract the original file extension
		        String originalFilename = file.getOriginalFilename();
		        String simpleName = originalFilename.substring(0,originalFilename.lastIndexOf("."));
		        String fileExtension = originalFilename.substring(originalFilename.lastIndexOf("."));

		        // Generate a unique file name to avoid overwriting existing files
		        String uniqueFileName =  simpleName + UniqueImageId.getNextNumber()+ fileExtension;
		        try {
					Files.copy(file.getInputStream(), this.root.resolve(uniqueFileName));
				} catch (IOException e1) {
					throw new RuntimeException(e.getMessage());
				}
			}else {
				throw new RuntimeException(e.getMessage());
			}
			
		}
	}

	@Override
	public Resource load(String fileName) {
		try {
			Path file = root.resolve(fileName);
			Resource resource = new UrlResource(file.toUri());

			if (resource.exists() || resource.isReadable()) {
				return resource;
			} else {
				throw new RuntimeException("Could not read the file!");
			}
		} catch (MalformedURLException e) {
			throw new RuntimeException("Error: " + e.getMessage());
		}
	}

	@Override
	public void deleteAll() {
		FileSystemUtils.deleteRecursively(root.toFile());
	}

	@Override
	public Stream<Path> loadAll() {
		try {
			return Files.walk(this.root, 1)
					.filter(path -> !path.equals(this.root)).map(this.root::relativize);
		} catch (IOException e) {
			throw new RuntimeException("Could not load the files!");
		}
	}

}
