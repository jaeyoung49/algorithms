package step1_sort_in_java;

import java.util.Arrays;
import java.util.Comparator;

public class Exam07ObjectSort_CustomObject_AnonymousComparatorInterface {
	
	public static void main(String[] args) {
		
		/*
		 * 	두 가지 기준을 동시에 지원하려면?
		 * 		- 하나의 객체 타입에 대해서 2가지 이상의 기준으로 정렬을 지원하려면
		 * 		- Comparator 를 사용
		 */
		
		Comparator<Fruits> nameComparator = new Comparator<Fruits>(){
			@Override
			public int compare(Fruits fruit1, Fruits fruit2) {
				return fruit1.name.compareTo(fruit2.name);
			}
		};
		Comparator<Fruits> quantComparator = new Comparator<Fruits>(){
			@Override
			public int compare(Fruits fruit1, Fruits fruit2) {
				return fruit1.quantity - fruit2.quantity;
			}
		};
		
		Fruits[] fruits = new Fruits[4];
		fruits[0] = new Fruits("Pineapple", 70);
		fruits[1] = new Fruits("Apple", 100);
		fruits[2] = new Fruits("Orange", 80);
		fruits[3] = new Fruits("Banana", 90);
		
		for(Fruits fruit : fruits)
			System.out.print(fruit);
		System.out.println();
		
		// 이름으로 정렬
		Arrays.sort(fruits, nameComparator);
		
		for(Fruits fruit : fruits)
			System.out.print(fruit);
		System.out.println();
		
		// 재고순으로 정렬
		Arrays.sort(fruits, quantComparator);
		
		for(Fruits fruit : fruits)
			System.out.print(fruit);
		System.out.println();
	}

}