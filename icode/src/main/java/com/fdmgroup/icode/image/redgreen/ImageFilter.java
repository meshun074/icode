package com.fdmgroup.icode.image.redgreen;

import java.awt.image.BufferedImage;

import org.springframework.stereotype.Service;

import com.fdmgroup.icode.image.upload.model.ImageInfo;
import com.fdmgroup.icode.image.upload.util.ImageUtils;

@Service("red-green")
public class ImageFilter {
	
	private ImageUtils utils;

	public ImageFilter(ImageUtils utils) {
		super();
		this.utils = utils;
	}

	public void redFilter(ImageInfo imageInfo) {
		BufferedImage bufferedImage = utils.getBufferedImage(imageInfo);
		// ******************** CODE BELOW ****************

		// ******************** CODE ABOVE ******************
		utils.saveBufferedImage(bufferedImage, imageInfo.getSimpleName(), "red");
	}
	
	public void greenFilter(ImageInfo imageInfo) {
		BufferedImage bufferedImage = utils.getBufferedImage(imageInfo);
		// ******************** CODE BELOW ****************

		// ******************** CODE ABOVE ******************
		utils.saveBufferedImage(bufferedImage, imageInfo.getSimpleName(), "green");
	}

	public void blueFilter(ImageInfo imageInfo) {
		BufferedImage bufferedImage = utils.getBufferedImage(imageInfo);
		// ******************** CODE BELOW ****************

		// ******************** CODE ABOVE ******************
		utils.saveBufferedImage(bufferedImage, imageInfo.getSimpleName(), "blue");
	}
}
