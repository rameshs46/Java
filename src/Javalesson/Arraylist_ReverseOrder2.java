package oraclelesson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Arraylist_ReverseOrder2 {

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
		
		List<Integer> descendingList = numbersList.stream()
				.sorted(Collections.reverseOrder())
				.collect(Collectors.toList());
		
		// Printing the final list after reverse order sorting. Original list only
		// sorted.
		System.out.println("After sorting : " + descendingList);
	}
}