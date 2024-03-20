package com.fdmgroup.icode.image;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/image-filter")
public class ImageFilterController {

	@GetMapping("/landing")
	public String goToLandingPage() {
		return "image-filter/landing";
	}

}
