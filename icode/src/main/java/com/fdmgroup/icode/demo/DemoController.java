package com.fdmgroup.icode.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/demo") // This is the base mapping
public class DemoController {
	
	@PostMapping("/model")
	public String addTemporaryValueToModel(@RequestParam String testModel, Model model) {
		model.addAttribute("testModel", testModel);
		return "demo/landing";
	}

	@GetMapping("/session")
	public String addSessionValue(@RequestParam("testSession") String test, HttpSession session) {
		session.setAttribute("test", test);
		return "demo/landing";
	}
	
	@GetMapping("/invalidate")
	public String invalidateSession(HttpSession session) {
		session.invalidate();
		return "redirect:/demo";
	}
}
