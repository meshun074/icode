package com.fdmgroup.icode.physical.assignment;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fdmgroup.icode.physical.model.Client;

@Controller
@RequestMapping("/assignment")
public class AssignmentController {
	
	private String baseFolder = "physical/assignment";
	private AssignmentService assignmentService;
	
	public AssignmentController(AssignmentService assignmentService) {
		super();
		this.assignmentService = assignmentService;
	}

	@GetMapping()
	public String goToAsignmentPage() {
		return baseFolder  + "/home";
	}
	
	@GetMapping("/create")
	public String goToCreateAssignmentPage() {
		return baseFolder  + "/create-assignment";
	}
	
	@GetMapping("/view-clients-assigned")
	public String goToViewClientsWithAssignments(Model model) {
		List<Client> clients = assignmentService.findClientsWithAssignments();
		model.addAttribute("clients", clients);
		return baseFolder + "/clients-with-assign";
	}
	
	@GetMapping("/{clientId}")
	public String goToViewAssignmentsByClientId(@PathVariable int clientId) {
		
		return baseFolder + "/client-assignments";
	}

}
