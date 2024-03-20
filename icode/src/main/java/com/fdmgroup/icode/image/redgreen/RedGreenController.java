package com.fdmgroup.icode.image.redgreen;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fdmgroup.icode.image.upload.model.ImageInfo;

@Controller
@RequestMapping("/red-green")
public class RedGreenController {

	private String redirectToImages = "redirect:/image/c/red-green";
	private String baseFolder = "image-filter/red-green";
	private ImageFilter filter;
	
	public RedGreenController(@Qualifier("red-green")ImageFilter filter) {
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
	public String goToProcessFilterRedGreen(ImageInfo image) {
		filter.redFilter(image);
		return redirectToImages;
	}
	
	@PostMapping("/filter2")
	public String goToProcessFilterGreen(ImageInfo image) {
		filter.greenFilter(image);
		return redirectToImages;
	}
	
	@PostMapping("/filter3")
	public String goToProcessFilterBlue(ImageInfo image) {
		filter.blueFilter(image);
		return redirectToImages;
	}
}
