package com.fdmgroup.icode.setup.toggle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SortingToggleService {
	
	
	private Toggler toggler;
	private String sorting1 = "sorting1";
	private String sorting2 = "sorting2";
	private String sorting3 = "sorting3";
	private String sorting4 = "sorting4";
	private String sorting5 = "sorting5";
	private String sorting6 = "sorting6";
	private String sorting7 = "sorting7";
	private String sorting8 = "sorting8";
	private String sorting9 = "sorting9";
	private String sorting10 = "sorting10";
	private String sorting11 = "sorting11";
	private String sorting12 = "sorting12";
	private String sorting13 = "sorting13";
	private String sorting14 = "sorting14";
	private List<String> attributes = new ArrayList<>(
			Arrays.asList(sorting1, sorting2, sorting3,
					sorting4, sorting5, sorting6, sorting7, sorting8,
					sorting9, sorting10, sorting11, sorting12, sorting13,
					sorting14));

	public SortingToggleService(Toggler toggler) {
		super();
		this.toggler = toggler;
	}

	public void setVariables() {
		toggler.setAttributes(attributes);
	}

	public void toggleSection1() {
		toggler.toggle(sorting1);
	}

	public void toggleSection2() {
		toggler.toggle(sorting2);
	}
	
	public void toggleGroupOneSelectionInfo() {
		toggler.toggle(sorting3);
	}
	
	public void toggleGroupOneSelectionHint() {
		toggler.toggle(sorting4);
	}
	
	public void toggleGroupOneBubbleInfo() {
		toggler.toggle(sorting5);
	}
	
	public void toggleGroupOneBubbleHint() {
		toggler.toggle(sorting6);
	}
	
	public void toggleGroupOneQuickInfo() {
		toggler.toggle(sorting7);
	}
	
	public void toggleGroupOneQuickHint() {
		toggler.toggle(sorting8);
	}
	
	public void toggleGroupTwoSelectionInfo() {
		toggler.toggle(sorting9);
	}
	
	public void toggleGroupTwoSelectionHint() {
		toggler.toggle(sorting10);
	}
	
	public void toggleGroupTwoInsertionInfo() {
		toggler.toggle(sorting11);
	}
	
	public void toggleGroupTwoInsertionHint() {
		toggler.toggle(sorting12);
	}
	
	public void toggleGroupTwoMergeInfo() {
		toggler.toggle(sorting13);
	}
	
	public void toggleGroupTwoMergeHint() {
		toggler.toggle(sorting14);
	}

}
