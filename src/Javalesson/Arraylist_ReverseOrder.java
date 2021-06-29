package oraclelesson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Arraylist_ReverseOrder {
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
		
		// Getting the descending order comparator
		Comparator<Integer> reverseComparator = Collections.reverseOrder();
		
		// Sorting with the reverse comparator with sort() method.
		// sort() method internally uses this comparator to sort in the descending order
		Collections.sort(numbersList, reverseComparator);
		
		// Printing the final list after reverse order sorting. Original list only
		// sorted.
		System.out.println("After sorting : " + numbersList);
	}
}
