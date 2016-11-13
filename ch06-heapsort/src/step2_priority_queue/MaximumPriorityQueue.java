package step2_priority_queue;

import java.util.ArrayList;

public class MaximumPriorityQueue {
	
	public static ArrayList<Integer> list = new ArrayList<Integer>();
	
	
	public static void printArray(int[] A){
		for(int c : A)
			System.out.print(c + ", ");
		System.out.println();
	}
	
	public static void maxHeapify(ArrayList<Integer> A, int pivot){
		int heapSize = A.size()-1;
		int left = (pivot)*2;
		int right = (pivot)*2 + 1;
		int maxChild = left;
		//while A[i] has a child do
		while(left <= heapSize){
			// k <- index of the biggest child of i;
			if( right <= heapSize)
				if(A.get(left-1)<A.get(right-1))
					maxChild = right;
			
			// if A[i] >= A[k] ---> return;
			if(A.get(maxChild-1)<=A.get(pivot-1))
				return;
			
			// exchange A[i] and A[k]; 
			int max = A.get(maxChild-1);
			A.set(maxChild-1, A.get(pivot-1));
			A.set(pivot-1, max);
			
			// i = k;
			pivot = maxChild;
			left = (pivot)*2;
			right = (pivot)*2 + 1;
			maxChild = left;
		}
	}
	
	public static void maxHeapInsert(ArrayList<Integer> A, int key){
		int heapSize = A.size() + 1;				// heap_size = heap_size + 1;
		A.add(key);									// A[heap_size] = key;
		int ins = heapSize;							// i = heap_size;
		int parent = ins/2;								
		while(ins>1 && A.get(parent-1) < A.get(ins-1)){	// while (i>1 and A[Parent(i)] < A[i] )
			int temp = A.get(ins-1);					//		exchange A[i] and A[Parent(i)];
			A.set(ins-1, A.get(parent-1));
			A.set(parent-1, temp);
			ins = parent;								// i = Parent(i);
			parent = ins/2;
		}
	}
	
	public static int heapExtractMax(ArrayList<Integer> A){
		int heapSize = A.size();
		int maxNumIndex = 1;
		
		if(heapSize<1){								// if heap-size[A] < 1
			System.out.println("heap underflow");	//	then error "heap underflow"
			return -1;
		} else {
			int maxNum = A.get(maxNumIndex-1);			// max <- A[1]
			A.set(maxNumIndex-1, A.get(heapSize-1));	// A[1] <- A[heap-size[A]]
			A.remove(heapSize-1);						// heap-size[A] <- heap-size[A] - 1
			maxHeapify(A, 1); 							// MAX-HEAPIFY(A, 1)
			return maxNum;
		}
	}
	
	public static void main(String[] args) {
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
		
		System.out.println(list);
		maxHeapInsert(list, 30);
		System.out.println(list);
		System.out.println(heapExtractMax(list));
		System.out.println(list);
	}

}
