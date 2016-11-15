package step1_sort_in_java;

import java.util.Arrays;

public class Exam01BasicSortPrimitiveTypeData {
	// 1. Array 클래스가 primitive 타입 데이터를 위한 정렬 메서드를 제공
	//	int[] data = new int[capacity];
		
		// 	1) data[0]에서 data[capacity-1]까지 
		//		데이터가 꽉 차있는 경우 다음과 같이 정렬한다
		//			Arrays.sort(data);
	
		//	2) 배열이 꽉 차있지 않고 data[0]에서 data[size-1]까지 
		//		size개의 데이터만 있다면 다음과 같이 한다.
		// 			Arrays.sort(data, 0, size);
	
	// 2. int 이외의 다른 primitive 타입 데이터(double, char 등)에 대해서도 제공
	
	public static void main(String[] args) {
		
		// 1-1) 데이터가 꽉 차있는 경우
		int[] data = {0,9,1,8,2,7,3,6,4,5};
		
		for(int i : data)
			System.out.print(i + " ");
		System.out.println();
		
		Arrays.sort(data);
		
		for(int i : data)
			System.out.print(i + " ");
		System.out.println();
		
		// 1-2) 배열이 꽉 차있지 않은 경우
		int[] data2 = new int[10];
		data2[0]=9; data2[1]=7; data2[2]=5; data2[3]=3; data2[4]=1;
		
		for(int i : data2)
			System.out.print(i + " ");
		System.out.println();
		
		Arrays.sort(data2, 0, 5);
		
		for(int i : data2)
			System.out.print(i + " ");
		System.out.println();
		
	}
}
