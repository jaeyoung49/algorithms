package step1_sort_in_java;

import java.util.Arrays;
import java.util.Comparator;


class Fruits1{
	private String name;
	private int quantity;
	public Fruits1(String name, int quantity) {
		super();
		this.name = name;
		this.quantity = quantity;
	}
	
	// 데이터 객체의 static member로 둔다.
	public static Comparator<Fruits1> nameComparator = new Comparator<Fruits1>(){
		@Override
		public int compare(Fruits1 fruit1, Fruits1 fruit2) {
			return fruit1.name.compareTo(fruit2.name);
		}
	};
	public static Comparator<Fruits1> quantComparator = new Comparator<Fruits1>(){
		@Override
		public int compare(Fruits1 fruit1, Fruits1 fruit2) {
			return fruit1.quantity - fruit2.quantity;
		}
	};
	
}

public class Exam06ObjectSort_CustomObject_ComparatorInterface {
	
	public static void main(String[] args) {
		
		
		
		Fruits1[] fruits = new Fruits1[4];
		fruits[0] = new Fruits1("Pineapple", 70);
		fruits[1] = new Fruits1("Apple", 100);
		fruits[2] = new Fruits1("Orange", 80);
		fruits[3] = new Fruits1("Banana", 90);
		
		for(Fruits1 fruit : fruits)
			System.out.print(fruit);
		System.out.println();
		
		// 이름으로 정렬
		Arrays.sort(fruits, Fruits1.nameComparator);
		
		for(Fruits1 fruit : fruits)
			System.out.print(fruit);
		System.out.println();
		
		// 재고순으로 정렬
		Arrays.sort(fruits, Fruits1.quantComparator);
		
		for(Fruits1 fruit : fruits)
			System.out.print(fruit);
		System.out.println();
	}

}