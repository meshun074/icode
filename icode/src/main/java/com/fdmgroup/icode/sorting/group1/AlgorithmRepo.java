package com.fdmgroup.icode.sorting.group1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.fdmgroup.icode.sorting.model.Algorithm;

@Repository("group1")
public class AlgorithmRepo {
	
	private List<Algorithm> algorithms;

	void setAlgorithms(){
		algorithms = new ArrayList<>();
		algorithms.add(new Algorithm("Selection"));
		algorithms.add(new Algorithm("Bubble"));
		algorithms.add(new Algorithm("Quick"));
	}
	
	public void updateAlgorithmTimeByName(String name, double time) {
		/**
		 * Refactor this code to make use of streams
		 */
		for(Algorithm algorithm: this.algorithms) {
			if(algorithm.getName().equalsIgnoreCase(name)) {
				algorithm.setTime(time);
				algorithm.setCompleted(true);
			}
		}
	}
	
	public List<Algorithm> getAlgorithms(){
		return this.algorithms;
	}

}
