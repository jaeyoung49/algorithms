package step1_sort_in_java;

import java.util.Arrays;

public class Exam04ObjectSort_CustomObject_Exception {
	
	public static void main(String[] args) {
		
		Fruits[] fruits = new Fruits[4];
		fruits[0] = new Fruits("Pineapple", 70);
		fruits[1] = new Fruits("Apple", 100);
		fruits[2] = new Fruits("Orange", 80);
		fruits[3] = new Fruits("Banana", 90);
		
		// 어떻게 될까? ---> java.lang.ClassCastException발생
		Arrays.sort(fruits);
	}

}

class Fruit {
	
	public String name;
	public int quantity;
	
	public Fruit(String name, int quantity) {
		super();
		this.name = name;
		this.quantity = quantity;
	}
	
}
