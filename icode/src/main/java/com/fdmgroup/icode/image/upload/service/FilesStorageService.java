package com.fdmgroup.icode.image.upload.service;

import java.nio.file.Path;
import java.util.stream.Stream;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface FilesStorageService {

	void init();
	void save(MultipartFile file);
	public Resource load(String fileName);
	public void deleteAll();
	public Stream<Path> loadAll();
}
