package com.fdmgroup.icode.demo.trails;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class TrailRepository {

	private List<Trail> trails = new ArrayList<>();
	private List<String> activities = new ArrayList<>(
			Arrays.asList("Hiking", "Walking", "Running", "Snowmobiling", "Climbing"));


	public TrailRepository(@Qualifier("trails") List<Trail> trails) {
		super();
		this.trails = trails;
	}
	
	public List<String> findAllTrailActivities(){
		return this.activities;
	}
	
	
	public List<Trail> findAll(){
		return this.trails;
	}

	public Trail save(Trail trail) {
		trail.setId(TrailIdGenerator.getId());
		this.trails.add(trail);
		return trail;
	}

	public Optional<Trail> findById(int trailId) {
		for (Trail trail : this.trails) {
			if (trail.getId() == trailId) {
				return Optional.ofNullable(trail);
			}
		}
		return Optional.ofNullable(null);
	}
	
}
