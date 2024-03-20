package com.fdmgroup.icode.image.mirror;

import java.awt.image.BufferedImage;

import org.springframework.stereotype.Service;

import com.fdmgroup.icode.image.upload.model.ImageInfo;
import com.fdmgroup.icode.image.upload.util.ImageUtils;

@Service("mirror")
public class ImageFilter {
	
	private ImageUtils utils;

	public ImageFilter(ImageUtils utils) {
		super();
		this.utils = utils;
	}

	public void mirrorFilter(ImageInfo imageInfo) {
		BufferedImage bufferedImage = utils.getBufferedImage(imageInfo);
		BufferedImage mirroredImage = utils.getBufferedImage(imageInfo);
		// ******************** CODE BELOW ****************

 
		// ******************** CODE ABOVE ******************
		utils.saveBufferedImage(mirroredImage, imageInfo.getSimpleName(), "mirror");
	}

}
