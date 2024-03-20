package com.fdmgroup.icode.sorting;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fdmgroup.icode.sorting.group1.Group1SorterService;
import com.fdmgroup.icode.sorting.group2.Group2SorterService;

@Controller
@RequestMapping("/sorting")
public class SortingController {
	
	private Group1SorterService groupOneSorter;
	private Group2SorterService groupTwoSorter;
	private String algorithms = "algorithms";
	private String groupOnePage = "sorting/group1";
	private String groupTwoPage = "sorting/group2";
	private String redirectGroupOnePage = "redirect:/sorting/group1";
	private String redirectGroupTwoPage = "redirect:/sorting/group2";

	public SortingController(Group1SorterService groupOneSorter, Group2SorterService groupTwoSorter) {
		super();
		this.groupOneSorter = groupOneSorter;
		this.groupTwoSorter = groupTwoSorter;
	}

	@GetMapping("/landing")
	public String goToLandingPage() {
		groupOneSorter.setAlgorithms();
		groupTwoSorter.setAlgorithms();
		return "sorting/landing";
	}
	
	// Group One
	
	@GetMapping("/group1")
	public String goToGroupOnePage(Model model) {
		model.addAttribute(algorithms, groupOneSorter.getAllAlgorithms());
		return groupOnePage;
	}
	
	@GetMapping("/group1/fastest")
	public String goToFastestSortedGroupOnePage(Model model) {
		model.addAttribute(algorithms, groupOneSorter.getAllFastestToSlowest());
		return groupOnePage;
	}
	
	@GetMapping("/group1/slowest")
	public String goToSlowestSortedGroupOnePage(Model model) {
		model.addAttribute(algorithms, groupOneSorter.getAllSlowestToFastest());
		return groupOnePage;
	}
	
	@GetMapping("/group1/selection")
	public String runGroupOneSelectionSort() {
		groupOneSorter.selectionSort();
		return redirectGroupOnePage;
	}
	
	@GetMapping("/bubble")
	public String runGroupOneBubbleSort() {
		groupOneSorter.bubbleSort();
		return redirectGroupOnePage;
	}
	
	@GetMapping("/quick")
	public String runGroupOneQuickSort() {
		groupOneSorter.quickSort();
		return redirectGroupOnePage;
	}
	
	// Group Two
	@GetMapping("/group2")
	public String goToGroupTwoPage(Model model) {
		model.addAttribute(algorithms, groupTwoSorter.getAllAlgorithms());
		return groupTwoPage;
	}
	
	@GetMapping("/group2/fastest")
	public String goToFastestSortedGroupTwoPage(Model model) {
		model.addAttribute(algorithms, groupTwoSorter.getAllFastestToSlowest());
		return groupTwoPage;
	}
	
	@GetMapping("/group2/slowest")
	public String goToSlowestSortedGroupTwoPage(Model model) {
		model.addAttribute(algorithms, groupTwoSorter.getAllSlowestToFastest());
		return groupTwoPage;
	}
	
	@GetMapping("/group2/selection")
	public String runGroupTwoSelectionSort() {
		groupTwoSorter.selectionSort();
		return redirectGroupTwoPage;
	}
	
	@GetMapping("/insertion")
	public String runGroupTwoInsertionSort() {
		groupTwoSorter.insertionSort();
		return redirectGroupTwoPage;
	}
	
	@GetMapping("/merge")
	public String runGroupTwoMergeSort() {
		groupTwoSorter.mergeSort();
		return redirectGroupTwoPage;
	}
}
