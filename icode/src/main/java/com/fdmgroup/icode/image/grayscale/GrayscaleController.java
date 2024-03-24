package com.fdmgroup.icode.image.grayscale;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fdmgroup.icode.image.upload.model.ImageInfo;

@Controller
@RequestMapping("/grayscale")
public class GrayscaleController {
	
	private String redirectToImages = "redirect:/image/c/grayscale";
	private String baseFolder = "image-filter/grayscale";
	private ImageFilter filter;	
	
	public GrayscaleController(@Qualifier("grayscale")ImageFilter filter) {
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
	public String goToProcessFilterGrayscale(ImageInfo image) {
		filter.grayscaleFilter(image);
		return redirectToImages;
	}

}
