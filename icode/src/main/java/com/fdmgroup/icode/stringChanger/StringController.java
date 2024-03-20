package com.fdmgroup.icode.stringChanger;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/stringChanger")
public class StringController {

	@GetMapping("/")
	public String toWelcomePage() {
		return "string-changer/landing";

	}

	@GetMapping("/changeCase")
	public String toChangeCasePage() {
		return "string-changer/change-case";
	}

	@PostMapping("/changeCase")
	public String toProcessChangeCaseForm(@RequestParam("inputString") String inputString, @RequestParam String action,
			Model model) {

		model.addAttribute("manipulatedString", StringManipulator.toprocessChangeCaseForm(inputString, action));
		model.addAttribute("oldString", inputString);
		return "string-changer/change-case";
	}

	@GetMapping("/arrangeWords")
	public String toArrangePage() {
		return "string-changer/arrange-words";
	}

	@PostMapping("/arrangeWords")
	public String arrangeWords(@RequestParam("inputString") String inputString, @RequestParam String action,
			Model model) {
		model.addAttribute("arrangedString", StringManipulator.arrangeWords(inputString, action));
		model.addAttribute("oldString", inputString);
		return "string-changer/arrange-words";

	}

	@GetMapping("/length")
	public String toLengthPage() {
		return "string-changer/length";
	}

	@PostMapping("/length")
	public String findlength(@RequestParam("inputString") String inputString, @RequestParam String action,
			Model model) {

		model.addAttribute("manipulatedString", StringManipulator.findlength(inputString, action));
		model.addAttribute("oldString", inputString);
		return "string-changer/length";

	}

	@GetMapping("/reverse")
	public String toReversePage() {
		return "string-changer/reverse";
	}

	@PostMapping("/reverse")
	public String reverseString(@RequestParam("inputString") String inputString, @RequestParam String action,
			Model model) {

		model.addAttribute("manipulatedString", StringManipulator.reverseString(inputString, action));
		model.addAttribute("originalString", inputString);
		return "string-changer/reverse";

	}

	@GetMapping("/countVowel")
	public String toCountVowelPage() {
		return "string-changer/count-vowel";
	}

	@PostMapping("/countVowel")
	public String toCountVowelPage(@RequestParam("inputString") String inputString, @RequestParam String action,
			Model model) {
		model.addAttribute("manipulatedString", StringManipulator.tocountVowel(inputString, action));
		model.addAttribute("originalString", inputString);
		return "string-changer/count-vowel";

	}

}
