package com.fdmgroup.icode.setup.toggle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CipherToggleService {
	
	private Toggler toggler;
	private String morseCode = "morseCode";
	private String keyWord = "keyword";
	private String pigpen = "pigpen";
	private String tapCode = "tapCode";
	private String gridCode = "gridCode";
	private List<String> attributes = new ArrayList<>(Arrays.asList(morseCode,
			keyWord, pigpen, tapCode, gridCode));

	public CipherToggleService(Toggler toggler) {
		super();
		this.toggler = toggler;
	}

	public void setVariables() {
		toggler.setAttributes(attributes);
	}

	public void toggleMorseCode() {
		toggler.toggle(morseCode);
	}

	public void toggleKeyword() {
		toggler.toggle(keyWord);
	}

	public void togglePigpen() {
		toggler.toggle(pigpen);
	}

	public void toggleTapCode() {
		toggler.toggle(tapCode);
	}

	public void toggleGridCode() {
		toggler.toggle(gridCode);
	}

}
