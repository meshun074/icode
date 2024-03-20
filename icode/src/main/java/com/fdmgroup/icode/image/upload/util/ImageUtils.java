package com.fdmgroup.icode.image.upload.util;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

import org.springframework.stereotype.Service;
import org.springframework.util.StreamUtils;
import org.springframework.web.multipart.MultipartFile;

import com.fdmgroup.icode.image.upload.model.ImageInfo;
import com.fdmgroup.icode.image.upload.service.FilesStorageService;

@Service
public class ImageUtils {

	private FilesStorageService storageService;

	public ImageUtils(FilesStorageService storageService) {
		super();
		this.storageService = storageService;
	}
	
	public BufferedImage getBufferedImage(ImageInfo imageInfo) {
		 // Reading the image in the form of file
        // from the directory
        File image;
		try {
			image= storageService.load(imageInfo.getName()).getFile();
		} catch (IOException e) {
			throw new RuntimeException("ImageFilter could create file from image name");
		}
 
        // Convert file into image form by
        // creating object of BufferedImage class
        BufferedImage bufferedImage = null;
		try {
			bufferedImage = ImageIO.read(image);
		} catch (IOException e) {
			throw new RuntimeException("ImageFilter could not read image");
		}
		return bufferedImage;
	}
	
	public void saveBufferedImage(BufferedImage bufferedImage, String name, String filter) {
		// Create a MultipartFile object and saving
        String newName = name+"-" + filter + ".jpg";
        try {
			MultipartFile multipartFile = bufferedImageToMultipartFile(bufferedImage, newName);
			storageService.save(multipartFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public MultipartFile bufferedImageToMultipartFile(BufferedImage image, String fileName) throws IOException {
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		ImageIO.write(image, "jpg", outputStream);

		// Convert ByteArrayOutputStream to byte array
		byte[] bytes = outputStream.toByteArray();

		// Create a MultipartFile
		MultipartFile multipartFile = new MultipartFile() {

			@Override
			public String getName() {
				return "file";
			}

			@Override
			public String getOriginalFilename() {
				return fileName;
			}

			@Override
			public String getContentType() {
				return "image/jpeg"; // Change according to your image type
			}

			@Override
			public boolean isEmpty() {
				return bytes.length == 0;
			}

			@Override
			public long getSize() {
				return bytes.length;
			}

			@Override
			public byte[] getBytes() throws IOException {
				return bytes;
			}

			@Override
			public InputStream getInputStream() throws IOException {
				return new ByteArrayInputStream(bytes);
			}

			@Override
			public void transferTo(File dest) throws IOException, IllegalStateException {
				StreamUtils.copy(bytes, new FileOutputStream(dest));
			}

		};
		return multipartFile;
	}

}
