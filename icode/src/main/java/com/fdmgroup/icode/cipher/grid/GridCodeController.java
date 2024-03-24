package com.fdmgroup.icode.cipher.grid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/cipher/grid-code")
public class GridCodeController {
	
	@PostMapping("/encode")
	public String encodeUserInput(@RequestParam String input, Model model) {
		model.addAttribute("encoded", GridCodeTranslator.encodeUserInput(input));
		return "cipher/grid-code";
	}

	@PostMapping("/decode")
	public String decodeUserInput(@RequestParam String input, Model model) {
		model.addAttribute("decoded", GridCodeTranslator.decodeUserInput(input));
		return "cipher/grid-code";
	}

}
