package com.fdmgroup.icode.setup.toggle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/it")
public class ImageToggleController {
	
	private ImageToggleService toggleService;
	private String landing = "redirect:/image-filter/landing";

	public ImageToggleController(ImageToggleService togglerService) {
		super();
		this.toggleService = togglerService;
	}
	
	@GetMapping("main")
	public String setUp() {
		toggleService.setVariables();
		return landing;
	}
	
	@GetMapping("image1")
	public String toggleGrayscaleConversion() {
		toggleService.toggleGreyscale();
		return landing;
	}

	@GetMapping("image2")
	public String toggleNegativeConversion() {
		toggleService.toggleNegative();
		return landing;
	}
	
	@GetMapping("image3")
	public String toggleRedGreenConversion() {
		toggleService.toggleRedGreenBlue();
		return landing;
	}
	
	@GetMapping("image4")
	public String toggleSepiaConversion() {
		toggleService.toggleSepia();
		return landing;
	}
	
	@GetMapping("image5")
	public String toggleMirrorConversion() {
		toggleService.toggleMirror();
		return landing;
	}
}
