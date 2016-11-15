package step1_sort_in_java;

import java.util.Arrays;

public class Exam02SortOfObject_String {
	
	public static void main(String[] args) {
		
		// primitive 타입 데이터와 마찬가지로 Array.sort 메서드로 정렬된다.
		String[] fruits = {"Pineapple", "Apple", "Orange", "Banana"};
		Arrays.sort(fruits);
		for(String fruit : fruits)
			System.out.print(fruit + " ");
		
	}
	
}
