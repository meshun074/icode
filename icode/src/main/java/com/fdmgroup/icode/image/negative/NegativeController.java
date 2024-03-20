package com.fdmgroup.icode.image.negative;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fdmgroup.icode.image.upload.model.ImageInfo;

@Controller
@RequestMapping("/negative")
public class NegativeController {
	
	private String redirectToImages = "redirect:/image/c/negative";
	private String baseFolder = "image-filter/negative";
	private ImageFilter filter;

	public NegativeController(@Qualifier("negative")ImageFilter filter) {
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
	public String goToProcessFilterNegative(ImageInfo image) {
		filter.negativeFilter(image);
		return redirectToImages;
	}
}
