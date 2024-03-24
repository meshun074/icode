package com.fdmgroup.icode.library.donation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DonationService {
	
    @Autowired
    private DonationRepository donationRepository;
    
    public DonationService(DonationRepository donationRepository) {
    	super();
    	this.donationRepository = donationRepository;
    }
    
    public List<Donation> getAllDonations(){
    	List<Donation> donations = donationRepository.getAllDonations();
    	return donations;
    }
    
    
    
    public Donation createDonation(Donation donation) {
        return donationRepository.save(donation);
    }
    


	public Donation updateDonationAmountById(Long donationId, Long donationAmount) {
		return donationRepository.updateDonationAmountById(donationId , donationAmount);
		
	}

    public Donation searchDonationById(Long donationId) {
        Donation donation = donationRepository.searchDonationById(donationId);
        return donation;
    }

    public Donation updateDonationTargetProgramById(Long donationId, String targetProgram) {
        return donationRepository.updateDonationTargetProgramById(donationId, targetProgram);
    }

    public Donation searchDonationByDonorName(String donorName) {
        return donationRepository.searchDonationByDonorName(donorName);
    }

    public List<String> getStarterDonationPrograms() {
        return donationRepository.getStarterDonationPrograms();
    }

}
