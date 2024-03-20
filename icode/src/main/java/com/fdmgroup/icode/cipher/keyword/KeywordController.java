package com.fdmgroup.icode.cipher.keyword;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/cipher/keyword")
public class KeywordController {
	
	
	@PostMapping("/key")
	public String setKey(@RequestParam String key, HttpSession session) {
		KeywordTranslator.setKey(key);
		session.setAttribute("key", KeywordTranslator.getKey());
		return "cipher/keyword";
	}
	
	@PostMapping("/encrypt")
	public String encriptPhrase(@RequestParam String input, Model model) {
		model.addAttribute("encrypted", KeywordTranslator.encriptPhrase(input));
		return "cipher/keyword";
	}
	
	@PostMapping("/decrypt")
	public String decriptPhrase(@RequestParam String input, Model model) {
		model.addAttribute("decrypted", KeywordTranslator.decriptPhrase(input));
		return "cipher/keyword";
	}

}
