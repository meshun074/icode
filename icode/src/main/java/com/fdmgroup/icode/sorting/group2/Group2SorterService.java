package com.fdmgroup.icode.sorting.group2;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.fdmgroup.icode.sorting.Timer;
import com.fdmgroup.icode.sorting.data.DataToSort;
import com.fdmgroup.icode.sorting.model.Algorithm;

@Service
public class Group2SorterService {
	
	private AlgorithmRepo repo; 
	
	public Group2SorterService(@Qualifier("group2")AlgorithmRepo repo) {
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
	
	public void insertionSort() {
		int[] unsorted = DataToSort.getUnsortedArray();
		Timer timer = new Timer();
		timer.startTimer();
		/************** CODE BELOW THIS LINE***********************/
        
		/**************** CODE ABOVE THIS LINE *******************/
		timer.stopTimer();
		// Only set the time if the array is properly sorted
		if(Arrays.compare(unsorted, DataToSort.getSortedArray()) == 0) {
			repo.updateAlgorithmTimeByName("Insertion", timer.getSeconds());
		}
	}
	
	public void mergeSort() {
		int[] unsorted = DataToSort.getUnsortedArray();
		Timer timer = new Timer();
		timer.startTimer();
		/************** CODE BELOW THIS LINE***********************/
		/** Feel free to develop additional methods or make use of previous methods****/
	
		
		/**************** CODE ABOVE THIS LINE *******************/
		timer.stopTimer();
		// Only set the time if the array is properly sorted
		if(Arrays.compare(unsorted, DataToSort.getSortedArray()) == 0) {
			repo.updateAlgorithmTimeByName("Merge", timer.getSeconds());
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
