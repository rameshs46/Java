package oraclelesson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arraylist_ReverseOrder1 {
	public static void main(String[] args) {
		// Creating ArrayList
		List<Integer> numbersList = new ArrayList<>();
		
		// Adding values to List
		numbersList.add(150);
		numbersList.add(50);
		numbersList.add(250);
		numbersList.add(500);
		numbersList.add(350);
		
		// Printing before sorting
		System.out.println("Before sorting : " + numbersList);
		
		// Sorting the list in the ascending order
		Collections.sort(numbersList);
		
		// Reversing the sorted list into descending order
		Collections.reverse(numbersList);
		
		// Printing the final list after reverse order sorting. Original list only
		// sorted.
		System.out.println("After sorting : " + numbersList);
	}
}
