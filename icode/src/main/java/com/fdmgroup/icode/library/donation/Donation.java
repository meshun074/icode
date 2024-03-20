package com.fdmgroup.icode.library.donation;



import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Donation{
	
	private Long donationId;
	private String donorName;
	private Long donationAmount;
	private String targetProgram;
	
	private static Long nextId = 100000L;
	
	public Donation() {
		this.donationId = generateUniqueId();
		
	}


	public Donation(String donorName, Long donationAmount, String targetProgram) {
		this();
		this.donorName = donorName;
		this.donationAmount = donationAmount;
		this.targetProgram = targetProgram;
	}
	
	
	public Long getDonationId() {
		return donationId;
	}
	public void setDonationId(Long id) {
		this.donationId = id;
	}
	public String getDonorName() {
		return donorName;
	}
	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}
	public Long getDonationAmount() {
		return donationAmount;
	}
	public void setDonationAmount(Long donationAmount2) {
		this.donationAmount = donationAmount2;
	}

	public String getTargetProgram() {
		return this.targetProgram;
	}

	public void setTargetProgram(String targetProgram) {
		this.targetProgram = targetProgram;
	}
	
	public Long generateUniqueId() {
		nextId += 3;
		return nextId;
	}
	
	@Override
	public String toString() {
		return "DonationEntity [id=" + donationId + ", donorName=" + donorName + ", donationAmount=" + donationAmount + "]";
	}


	


}