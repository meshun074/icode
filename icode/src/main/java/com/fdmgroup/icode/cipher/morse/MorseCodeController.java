package com.fdmgroup.icode.cipher.morse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/cipher/morse-code")
public class MorseCodeController {
	
	@PostMapping("/en-to-morse")
	public String englishToMorseCode(@RequestParam String input, Model model) {
		model.addAttribute("morseOutput", MorseCodeTranslator.englishToMorseCode(input));
		return "cipher/morse";
	}
	
	@PostMapping("/morse-to-en")
	public String morseCodeToEnglish(@RequestParam String input, Model model) {
		model.addAttribute("englishOutput", MorseCodeTranslator.morseCodeToEnglish(input));
		return "cipher/morse";
	}
	
	@GetMapping("/sounds")
	public String goToFreeSoundsWebsite() {
		return "redirect:https://commons.wikimedia.org/wiki/Category:Audio_files_of_Morse_code_-_alphabet";
	}

}
