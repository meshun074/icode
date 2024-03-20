package com.fdmgroup.icode.image.mirror;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fdmgroup.icode.image.upload.model.ImageInfo;


@Controller
@RequestMapping("/mirror")
public class MirrorController {

	private String redirectToImages = "redirect:/image/c/mirror";
	private String baseFolder = "image-filter/mirror";
	private ImageFilter filter;
	
	public MirrorController(@Qualifier("mirror")ImageFilter filter) {
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
	public String goToProcessFilterMirror(ImageInfo image) {
		filter.mirrorFilter(image);
		return redirectToImages;
	}

}
