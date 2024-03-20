package com.fdmgroup.icode.setup.toggle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ImageToggleService {
	
	private Toggler toggler;
	private String image1 = "image1";
	private String image2 = "image2";
	private String image3 = "image3";
	private String image4 = "image4";
	private String image5 = "image5";
	private List<String> attributes = new ArrayList<>(
			Arrays.asList(image1, image2, image3, image4, image5));

	public ImageToggleService(Toggler toggler) {
		super();
		this.toggler = toggler;
	}

	public void setVariables() {
		toggler.setAttributes(attributes);
	}

	public void toggleGreyscale() {
		toggler.toggle(image1);
	}

	public void toggleNegative() {
		toggler.toggle(image2);
	}

	public void toggleRedGreenBlue() {
		toggler.toggle(image3);
	}

	public void toggleSepia() {
		toggler.toggle(image4);
	}

	public void toggleMirror() {
		toggler.toggle(image5);
	}
	
	

}
