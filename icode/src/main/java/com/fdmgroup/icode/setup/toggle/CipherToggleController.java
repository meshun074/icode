package com.fdmgroup.icode.setup.toggle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ct")
public class CipherToggleController {
	
	private CipherToggleService toggleService;
	private String landing = "redirect:/cipher/landing";

	public CipherToggleController(CipherToggleService toggleService) {
		super();
		this.toggleService = toggleService;
	}
	
	@GetMapping("/main")
	public String setUp() {
		toggleService.setVariables();
		return landing;
	}
	
	@GetMapping("/morse-code")
	public String toggleMorseCodeSection() {
		toggleService.toggleMorseCode();
		return landing;
	}
	
	@GetMapping("/keyword")
	public String toggleKeywordSection() {
		toggleService.toggleKeyword();
		return landing;
	}
	
	@GetMapping("/pigpen")
	public String togglePigpenSection() {
		toggleService.togglePigpen();
		return landing;
	}
	
	@GetMapping("/tap-code")
	public String toggleTapCodeSection() {
		toggleService.toggleTapCode();
		return landing;
	}
	
	@GetMapping("/grid-code")
	public String toggleGridCodeSection() {
		toggleService.toggleGridCode();
		return landing;
	}
}
