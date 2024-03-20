package com.fdmgroup.icode.physical.therapist;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.fdmgroup.icode.physical.model.Therapist;

@Repository
public class TherapistRepository {

	private List<Therapist> therapists;

	public TherapistRepository(@Qualifier("therapist1") List<Therapist> therapists) {
		super();
		this.therapists = therapists;
	}
	
	
}
