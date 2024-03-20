package com.fdmgroup.icode.cipher;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fdmgroup.icode.cipher.pigpen.PigpenLetterProvider;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/cipher")
public class CipherController {
	
	@GetMapping("/landing")
	public String goToLandingPage() {
		return "cipher/landing";
	}
	
	@GetMapping("/morse-code")
	public String goToMorseCodePage() {
		return "cipher/morse";
	}
	
	@GetMapping("/keyword")
	public String goToKeyWordPage() {
		return "cipher/keyword";
	}
	
	@GetMapping("/pigpen")
	public String goToPigpenCipherPage(HttpSession session) {
		session.setAttribute("letters", PigpenLetterProvider.getLetters());
		return "cipher/pigpen";
	}

	@GetMapping("/tap-code")
	public String goToTapCodePage() {
		return "cipher/tap-code";
	}
	
	@GetMapping("/grid-code")
	public String goToGridCodePage() {
		return "cipher/grid-code";
	}
	
	@GetMapping("/alphabet")
	public String goToGetAlphabetAudioFiles() {
		return "redirect:https://www.theblog.ca/mp3-audio-files-alphabet#comment-15352";
	}
}
