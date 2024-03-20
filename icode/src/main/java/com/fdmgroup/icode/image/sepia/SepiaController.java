package com.fdmgroup.icode.image.sepia;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fdmgroup.icode.image.upload.model.ImageInfo;

@Controller
@RequestMapping("/sepia")
public class SepiaController {

	private String redirectToImages = "redirect:/image/c/sepia";
	private String baseFolder = "image-filter/sepia";
	private ImageFilter filter;

	public SepiaController(@Qualifier("sepia")ImageFilter filter) {
		super();
		this.filter = filter;
	}

	@GetMapping("/images")
	public String goToHomePage() {
		return baseFolder + "/images";
	}

	@GetMapping("/view")
	public String goToViewImage() {
		return baseFolder + "/view-image";
	}

	@PostMapping("/filter1")
	public String goToProcessFilterSepia(ImageInfo image) {
		filter.sepiaFilter(image);
		return redirectToImages;
	}
}
