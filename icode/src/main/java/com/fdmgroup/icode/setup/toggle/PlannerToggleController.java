package com.fdmgroup.icode.setup.toggle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pt")
public class PlannerToggleController {

	private PlannerToggleService toggleService;
	private String landing = "redirect:/planner/landing";
	
	public PlannerToggleController(PlannerToggleService toggleService) {
		super();
		this.toggleService = toggleService;
	}
	
	@GetMapping("main")
	public String setUp() {
		toggleService.setVariables();
		return landing;
	}
	
	@GetMapping("planner1")
	public String togglePlanner1() {
		toggleService.togglePlanner1();
		return landing;
	}
	
	@GetMapping("planner2")
	public String togglePlanner2() {
		toggleService.togglePlanner2();
		return landing;
	}
	
	@GetMapping("planner3")
	public String togglePlanner3() {
		toggleService.togglePlanner3();
		return landing;
	}
	
	@GetMapping("planner4")
	public String togglePlanner4() {
		toggleService.togglePlanner4();
		return landing;
	}
	
	@GetMapping("planner5")
	public String togglePlanner5() {
		toggleService.togglePlanner5();
		return landing;
	}
	
	@GetMapping("planner6")
	public String togglePlanner6() {
		toggleService.togglePlanner6();
		return landing;
	}
	
	
	@GetMapping("planner7")
	public String togglePlanner7() {
		toggleService.togglePlanner7();
		return landing;
	}
	
	@GetMapping("planner8")
	public String togglePlanner8() {
		toggleService.togglePlanner8();
		return landing;
	}
	
	@GetMapping("planner9")
	public String togglePlanner9() {
		toggleService.togglePlanner9();
		return landing;
	}
	
	@GetMapping("planner10")
	public String togglePlanner10() {
		toggleService.togglePlanner10();
		return landing;
	}
	
	@GetMapping("planner11")
	public String togglePlanner11() {
		toggleService.togglePlanner11();
		return landing;
	}
	
	@GetMapping("planner12")
	public String togglePlanner12() {
		toggleService.togglePlanner12();
		return landing;
	}
	
	@GetMapping("planner13")
	public String togglePlanner13() {
		toggleService.togglePlanner13();
		return landing;
	}
	
	@GetMapping("planner14")
	public String togglePlanner14() {
		toggleService.togglePlanner14();
		return landing;
	}
	
	@GetMapping("planner15")
	public String togglePlanner15() {
		toggleService.togglePlanner15();
		return landing;
	}
	
	@GetMapping("planner16")
	public String togglePlanner16() {
		toggleService.togglePlanner16();
		return landing;
	}
	
	@GetMapping("planner17")
	public String togglePlanner17() {
		toggleService.togglePlanner17();
		return landing;
	}
	
	@GetMapping("planner18")
	public String togglePlanner18() {
		toggleService.togglePlanner18();
		return landing;
	}
	
	@GetMapping("planner19")
	public String togglePlanner19() {
		toggleService.togglePlanner19();
		return landing;
	}
	
	@GetMapping("planner20")
	public String togglePlanner20() {
		toggleService.togglePlanner20();
		return landing;
	}
	
	@GetMapping("planner21")
	public String togglePlanner21() {
		toggleService.togglePlanner21();
		return landing;
	}
	
	@GetMapping("planner22")
	public String togglePlanner22() {
		toggleService.togglePlanner22();
		return landing;
	}
	
	@GetMapping("planner23")
	public String togglePlanner23() {
		toggleService.togglePlanner23();
		return landing;
	}
}
