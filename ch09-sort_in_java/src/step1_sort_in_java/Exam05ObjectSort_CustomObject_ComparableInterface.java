package step1_sort_in_java;

import java.util.Arrays;

public class Exam05ObjectSort_CustomObject_ComparableInterface {
	
	public static void main(String[] args) {
		
		Fruits[] fruits = new Fruits[4];
		fruits[0] = new Fruits("Pineapple", 70);
		fruits[1] = new Fruits("Apple", 100);
		fruits[2] = new Fruits("Orange", 80);
		fruits[3] = new Fruits("Banana", 90);
		
		Arrays.sort(fruits);
		for(Fruits fruit : fruits)
			System.out.print(fruit);
	}

}

class Fruits implements Comparable<Fruits>{
	
	public String name;
	public int quantity;
	
	public Fruits(String name, int quantity) {
		super();
		this.name = name;
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "Fruits [name=" + name + ", quantity=" + quantity + "]";
	}

	// name 기준으로 정렬
//	@Override
//	public int compareTo(Fruits other) {
//		return name.compareTo(other.name);
//	}
	
	// quantity 순으로 정렬
	@Override
	public int compareTo(Fruits other) {
		return quantity - other.quantity;
	}
}