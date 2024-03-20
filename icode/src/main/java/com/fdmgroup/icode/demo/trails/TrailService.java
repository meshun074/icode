package com.fdmgroup.icode.demo.trails;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TrailService {

	private TrailRepository trailRepo;

	public TrailService(TrailRepository trailRepo) {
		super();
		this.trailRepo = trailRepo;
	}
	
	public List<String> findAllTrailActivities(){
		return trailRepo.findAllTrailActivities();
	}
	
	public List<Trail> findAllTrails(){
		return trailRepo.findAll();
	}

	public Trail createNewTrail(Trail trail) {
		return trailRepo.save(trail);
	}

	public Trail findTrailById(int trailId) throws TrailNotFoundException {
		return trailRepo.findById(trailId).orElseThrow(() -> new TrailNotFoundException(trailId));
	}

	/*
	 * The Service will call on the repository and return its response
	 */
	public List<Trail> findTrailsByLocation(String location) {
		return trailRepo.findTrailsByLocation(location);
	}
}
