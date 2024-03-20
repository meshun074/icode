package com.fdmgroup.icode.setup.toggle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/st")
public class SortingToggleController {
	
	private SortingToggleService toggleService;
	private String landing = "redirect:/sorting/landing";
	private String groupOnePage = "redirect:/sorting/group1";
	private String groupTwoPage = "redirect:/sorting/group2";
	
	public SortingToggleController(SortingToggleService toggleService) {
		super();
		this.toggleService = toggleService;
	}
	
	@GetMapping("main")
	public String setUp() {
		toggleService.setVariables();
		return landing;
	}

	@GetMapping("sorting1")
	public String toggleSection1() {
		toggleService.toggleSection1();
		return landing;
	}

	@GetMapping("sorting2")
	public String toggleSection2() {
		toggleService.toggleSection2();
		return landing;
	}
	
	@GetMapping("sorting3")
	public String toggleGroupOneSelectionInfo() {
		toggleService.toggleGroupOneSelectionInfo();
		return groupOnePage;
	}
	
	@GetMapping("sorting4")
	public String toggleGroupOneSelectionHint() {
		toggleService.toggleGroupOneSelectionHint();
		return groupOnePage;
	}
	
	@GetMapping("sorting5")
	public String toggleGroupOneBubbleInfo() {
		toggleService.toggleGroupOneBubbleInfo();
		return groupOnePage;
	}
	
	@GetMapping("sorting6")
	public String toggleGroupOneBubbleHint() {
		toggleService.toggleGroupOneBubbleHint();
		return groupOnePage;
	}
	
	@GetMapping("sorting7")
	public String toggleGroupOneQuickInfo() {
		toggleService.toggleGroupOneQuickInfo();
		return groupOnePage;
	}
	
	@GetMapping("sorting8")
	public String toggleGroupOneQuickHint() {
		toggleService.toggleGroupOneQuickHint();
		return groupOnePage;
	}
	
	@GetMapping("sorting9")
	public String toggleGroupTwoSelectionInfo() {
		toggleService.toggleGroupTwoSelectionInfo();
		return groupTwoPage;
	}
	
	@GetMapping("sorting10")
	public String toggleGroupTwoSelectionHint() {
		toggleService.toggleGroupTwoSelectionHint();
		return groupTwoPage;
	}
	
	@GetMapping("sorting11")
	public String toggleGroupTwoInsertionInfo() {
		toggleService.toggleGroupTwoInsertionInfo();
		return groupTwoPage;
	}
	
	@GetMapping("sorting12")
	public String toggleGroupTwoInsertionHint() {
		toggleService.toggleGroupTwoInsertionHint();
		return groupTwoPage;
	}
	
	@GetMapping("sorting13")
	public String toggleGroupTwoMergeInfo() {
		toggleService.toggleGroupTwoMergeInfo();
		return groupTwoPage;
	}
	
	@GetMapping("sorting14")
	public String toggleGroupTwoMergeHint() {
		toggleService.toggleGroupTwoMergeHint();
		return groupTwoPage;
	}
	
}
