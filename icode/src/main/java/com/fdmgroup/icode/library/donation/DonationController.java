package com.fdmgroup.icode.library.donation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
@RequestMapping("library/donate")
public class DonationController {

    @Autowired
    private DonationService donationSer;

    @Autowired
    private DonationRepository donationRepo;

    public DonationController(DonationService donationSer, DonationRepository donationRepo) {
        super();
        this.donationSer = donationSer;
        this.donationRepo = donationRepo;
    }
    

    @GetMapping("/allDonations")
	public String goToAllDonationRecords(Model model) {
		List<Donation> allDonations = donationRepo.getAllDonations();
		model.addAttribute("allDonations", allDonations);
		return "/library/donate/allDonations";
	}
	
	@GetMapping("/createDonationForm")
	public String goToCreateDonation(Model model) {
        List<String> ProgramsWithDonationNeeds = donationSer.getStarterDonationPrograms();
        model.addAttribute("ProgramsWithDonationNeeds", ProgramsWithDonationNeeds);
		model.addAttribute("donation", new Donation());
		return "/library/donate/createDonation";
	}

    @PostMapping("/createDonation")
    public String addDonation(Donation donation, @RequestParam String targetProgram) {
        donation.setTargetProgram(targetProgram);
        donationSer.createDonation(donation);
        return "redirect:/library/donate/allDonations";
    }
    

    @GetMapping("/updateDonationAmountByIdForm")
    public String goToUpdateDonationAmountById(Model model) {
        return "/library/donate/updateDonationAmountById";
    }

    @GetMapping("/searchDonationAmountById")
    public String getMethodName(@RequestParam Long donationId, Model model) {
        Donation donation = donationSer.searchDonationById(donationId);
        model.addAttribute("donation", donation);
        return "/library/donate/updateDonationAmountById";
    }
    
	@PostMapping("/updateDonationAmountById/{donationId}/updatedDonationAmount")
	public String postUpdateDonationAmountById(@PathVariable Long donationId, @RequestParam Long donationAmount, Model model) {
        Donation donation = donationSer.searchDonationById(donationId);
        donationSer.updateDonationAmountById(donationId, donationAmount);
		model.addAttribute("donation", donation);
		return "redirect:/library/donate/allDonations";
	}

    
    // Render the page
    @GetMapping("/deleteDonationForm")
    public String goToDeleteDonation(Model model) {
        return "/library/donate/deleteDonationById";
    }

    //TODO different method to delete than the one used in the book controller
    @PostMapping("/deleteDonationById")
    public String deleteDonationById(@RequestParam Long donationId, Model model) {
        Donation donation = donationSer.searchDonationById(donationId);
        donationRepo.getAllDonations().remove(donation);
        return "redirect:/library/donate/allDonations";
    }

    @GetMapping("/editDonationAmountForm")
    public String goToEditDonationAmount() {
        return "/library/donate/editDonationAmount";
    }



    @GetMapping("/updateDonationTargetProgramForm")
    public String goToEditDonationProgram() {
        return "/library/donate/updateDonationTargetProgram";
    }

    @GetMapping("/searchDonationTargetProgramById")
    public String goToSearchDonationTargetProgramById(@RequestParam Long donationId, Model model) {
        Donation donation = donationSer.searchDonationById(donationId);
        model.addAttribute("donation", donation);
        return "/library/donate/updateDonationTargetProgram";
    }

    @PostMapping("/updateDonationTargetProgram/{donationId}/updatedTargetProgram")
    public String postUpdateDonationTargetProgramById(@PathVariable Long donationId, @RequestParam String targetProgram, Model model) {
        Donation donation = donationSer.searchDonationById(donationId);
        donationSer.updateDonationTargetProgramById(donationId, targetProgram);
        model.addAttribute("donation", donation);
        return "redirect:/library/donate/allDonations";
    }
    

    @GetMapping("/searchDonationReceiptByName")
    public String goToSearchDonationByID() {
        return "/library/donate/searchDonationReceiptByName";
    }

    @GetMapping("/searchByDonorNameForm")
    public String goToSearchDonationByDonorName(@RequestParam String donorName, Model model) {
        Donation donation = donationSer.searchDonationByDonorName(donorName);
        model.addAttribute("donation", donation);
        return "/library/donate/searchDonationReceiptByName";
    }


    
    
    
    
    
    
}


