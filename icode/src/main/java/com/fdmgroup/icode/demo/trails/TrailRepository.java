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
	
	/*
	 * Create a new list of trails we want to return
	 * 		new ArrayList<>()
	 * Loop through the existing list of trails and
	 * 		add trails to new list that have a location matching that of the 
	 * 		search location
	 * return the new list of trails
	 */

	public List<Trail> findTrailsByLocation(String location) {
		List<Trail> foundTrails = new ArrayList<>();
		// For (DataType currentItem : collection)
		// For each loop
		for(Trail currentTrail : trails) {
			if(currentTrail.getLocation().equalsIgnoreCase(location)) {
				// Reach here only if returns true
				foundTrails.add(currentTrail);
			}
		}
		return foundTrails;
	}

	/*
	 * Delete Step 4
	 * 	Loop through the list of trails
	 *	Find the index of the trail we want to remove
	 * 		Store it in a variable
	 * 		Break out of the loop
	 * 	Remove Trail
	 */
	public void deleteTrailById(int id) {
		int indexWeWantToRemove = 0;
		for(int i = 0 ; i < trails.size(); i++) {
			if(trails.get(i).getId() == id) {
				indexWeWantToRemove = i;
				break;
			}
		}
		trails.remove(indexWeWantToRemove);
	}
	
}
