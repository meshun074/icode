package com.fdmgroup.icode.sorting.group1;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.fdmgroup.icode.sorting.Timer;
import com.fdmgroup.icode.sorting.data.DataToSort;
import com.fdmgroup.icode.sorting.model.Algorithm;

@Service
public class Group1SorterService {
	
	private AlgorithmRepo repo; 
	
	public Group1SorterService(@Qualifier("group1")AlgorithmRepo repo) {
		super();
		this.repo = repo;
	}

	public void selectionSort() {
		int[] unsorted = DataToSort.getUnsortedArray();
		Timer timer = new Timer();
		timer.startTimer();
		/************** CODE BELOW THIS LINE***********************/

		/**************** CODE ABOVE THIS LINE *******************/
		timer.stopTimer();
		// Only set the time if the array is properly sorted
		if(Arrays.compare(unsorted, DataToSort.getSortedArray()) == 0) {
			repo.updateAlgorithmTimeByName("Selection", timer.getSeconds());
		}
	}
	
	public void bubbleSort() {
		int[] unsorted = DataToSort.getUnsortedArray();
		Timer timer = new Timer();
		timer.startTimer();
		/************** CODE BELOW THIS LINE***********************/
        
		/**************** CODE ABOVE THIS LINE *******************/
		timer.stopTimer();
		// Only set the time if the array is properly sorted
		if(Arrays.compare(unsorted, DataToSort.getSortedArray()) == 0) {
			repo.updateAlgorithmTimeByName("Bubble", timer.getSeconds());
		}
	}
	
	public void quickSort() {
		int[] unsorted = DataToSort.getUnsortedArray();
		Timer timer = new Timer();
		timer.startTimer();
		/************** CODE MAIN BELOW THIS LINE***********************/
		/************ Feel free to develop additional methods *********/

		/**************** CODE ABOVE THIS LINE *******************/
		timer.stopTimer();
		// Only set the time if the array is properly sorted
		if(Arrays.compare(unsorted, DataToSort.getSortedArray()) == 0) {
			repo.updateAlgorithmTimeByName("Quick", timer.getSeconds());
		}
	}
	
	public List<Algorithm> getAllAlgorithms(){
		return repo.getAlgorithms();
	}
	
	public List<Algorithm> getAllFastestToSlowest(){
		repo.getAlgorithms().sort(new FastestToSlowestComparator());
		return repo.getAlgorithms();
	}
	
	public List<Algorithm> getAllSlowestToFastest(){
		repo.getAlgorithms().sort(new SlowestToFastestComparator());
		return repo.getAlgorithms();
	}

	public void setAlgorithms() {
		repo.setAlgorithms();
	}

}
