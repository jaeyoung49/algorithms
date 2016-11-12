package step2_priority_queue;

import java.util.ArrayList;

public class MaximumPriorityQueue {
	
	public static ArrayList<Integer> list = new ArrayList<Integer>();
	
	
	public static void printArray(int[] A){
		for(int c : A)
			System.out.print(c + ", ");
		System.out.println();
	}
	
	public static void maxHeapInsert(ArrayList<Integer> A, int key){
		int heapSize = (A.size()-1) + 1;				// heap_size = heap_size + 1;
		A.add(key);							// A[heap_size] = key;
		int i = heapSize;							// i = heap_size;
		int parent = i/2;								
		while(i>1 && A.get(parent) < A.get(i)){				// while (i>1 and A[Parent(i)] < A[i] )
			int temp = A.get(i);						// 		exchange A[i] and A[Parent(i)];
			A.set(i, A.get(parent));
			A.set(parent, temp);
			i = parent;								// i = Parent(i);
			parent = i/2;
		}
	}
	
	public static void maxHeapify(ArrayList<Integer> A, int pivot, int heapSize){
		int left = (pivot)*2;
		int right = (pivot)*2 + 1;
		int maxChild = left;
		//while A[i] has a child do
		while(left <= heapSize){
			// k <- index of the biggest child of i;
			if( (pivot*2+1) <= heapSize)
				if(A.get(left)<A.get(right))
					maxChild = right;
			
			// if A[i] >= A[k] ---> return;
			if(A.get(maxChild)<=A.get(pivot))
				return;
			
			// exchange A[i] and A[k]; 
			int max = A.get(maxChild);
			A.set(maxChild, A.get(pivot));
			A.set(pivot, max);
			
			// i = k;
			pivot = maxChild;
			left = (pivot)*2;
			right = (pivot)*2 + 1;
			maxChild = left;
		}
	}
	
	public static void main(String[] args) {
		list.add(0);
		
		list.add(20);
		list.add(10);
		list.add(15);
		list.add(8);
		list.add(7);
		
		list.add(13);
		list.add(14);
		list.add(2);
		list.add(5);
		list.add(6);
		
		list.add(0);
		System.out.println(list);
//		maxHeapInsert(A, key);
		System.out.println(list);
	}

}
