package com.fdmgroup.icode.sorting.group2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.fdmgroup.icode.sorting.model.Algorithm;

@Repository("group2")
public class AlgorithmRepo {
	
	private List<Algorithm> algorithms;
	
	public void setAlgorithms(){
		List<Algorithm> algorithms = new ArrayList<>();
		algorithms.add(new Algorithm("Selection"));
		algorithms.add(new Algorithm("Insertion"));
		algorithms.add(new Algorithm("Merge"));
		this.algorithms = algorithms;
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
