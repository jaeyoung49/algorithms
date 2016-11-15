package step1_sort_in_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exam03ArrayListSort_String {
	
	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList<String>();
		fruits.add("Pineapple");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		
		// Collections.sort 메서드로 정렬된다.
		Collections.sort(fruits);
		
		for(String name : fruits)
			System.out.print(name + " ");
		
	}
	
}
