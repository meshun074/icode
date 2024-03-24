package com.fdmgroup.icode.cipher.pigpen;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/cipher/pigpen")
public class PigpenController {
	
	private List<String> images = new ArrayList<>();
	
	@PostMapping("/encrypt")
	public String encryptPhrase(@RequestParam String input, Model model) {
		model.addAttribute("encrypted", PigpenTranslator.encryptPhrase(input));
		return "cipher/pigpen";
	}
	
	@PostMapping("/decrypt")
	public String decryptPhrase(HttpSession session, Model model) {
		List<String> pigPenLetters = images;
		model.addAttribute("decrypted", PigpenTranslator.decriptPhrase(pigPenLetters));
		images.clear();
		return "cipher/pigpen";
	}
	
	@GetMapping("/addToDecrypt/{letter}")
	public String addToPhraseToDecrypt(@PathVariable String letter, Model model) {
		images.add(PigpenLetterProvider.findImage(letter));
		model.addAttribute("toDecrypt", images);
		return "cipher/pigpen";
	}

}
