package com.fdmgroup.icode.cipher.tap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/cipher/tap-code")
public class TapCodeController {
	
	@PostMapping("/encode")
	public String encodeUserInput(@RequestParam String input, Model model) {
		model.addAttribute("encoded", TapCodeTranslator.encodeUserInput(input));
		return "cipher/tap-code";
	}

	@PostMapping("/decode")
	public String decodeUserInput(@RequestParam String input, Model model) {
		model.addAttribute("decoded", TapCodeTranslator.decodeUserInput(input));
		return "cipher/tap-code";
	}
	
	@GetMapping("/sounds")
	public String goToDownloadTapSoundEffect() {
		return "redirect:https://uppbeat.io/sfx/tag/door-knock";
	}
}
