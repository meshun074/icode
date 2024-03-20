package com.fdmgroup.icode.image.sepia;

import java.awt.image.BufferedImage;

import org.springframework.stereotype.Service;

import com.fdmgroup.icode.image.upload.model.ImageInfo;
import com.fdmgroup.icode.image.upload.util.ImageUtils;

@Service("sepia")
public class ImageFilter {

	private ImageUtils utils;

	public ImageFilter(ImageUtils utils) {
		super();
		this.utils = utils;
	}

	public void sepiaFilter(ImageInfo imageInfo) {
		BufferedImage bufferedImage = utils.getBufferedImage(imageInfo);
		// ******************** CODE BELOW ****************
		
		// ******************** CODE ABOVE ******************
		utils.saveBufferedImage(bufferedImage, imageInfo.getSimpleName(), "sepia");
	}
}
