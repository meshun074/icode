package com.fdmgroup.icode.setup.toggle;

import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpSession;

@Service
public class Toggler {

	
	private HttpSession session;

	public Toggler(HttpSession session) {
		super();
		this.session = session;
	}

	public void toggle(String attribute) {
		if (session.getAttribute(attribute).equals(false)) {
			session.setAttribute(attribute, true);
		} else {
			session.setAttribute(attribute, false);
		}
	}
	
	public void setAttributes(List<String> attributes) {
		for(String attribute : attributes) {
			if(session.getAttribute(attribute) == null) {
				session.setAttribute(attribute, false);
			}
		}
	}
}
