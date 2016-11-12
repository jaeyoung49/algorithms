package step1_heapsort;

public class Heapsort {
	
	public static int[] array = {0, 4, 1, 3, 2, 16, 9, 10, 14, 8, 7};

	public static void printArray(int[] A){
		for(int c : A)
			System.out.print(c + ", ");
		System.out.println();
	}
	
	public static void heapsort(int[] A){
		int heapSize = A.length-1;
		while(heapSize>0){
			// 3. MaxHeapify(A, 1);
			for(int j=heapSize; j>0; j--){
				maxHeapify(A, j, heapSize);
				printArray(array);
			}
			
			// 1. exchange A[1] <-> A[i]
			int temp = A[1];
			A[1] = A[heapSize];
			A[heapSize] = temp;
			
			// 2. heapSize <- heapSize-1
			heapSize--;
			
		}
	}
		
	
	public static void maxHeapify(int[] A, int pivot, int heapSize){
		int left = (pivot)*2;
		int right = (pivot)*2 + 1;
		int maxChild = left;
		//while A[i] has a child do
		while(left <= heapSize){
			// k <- index of the biggest child of i;
			if( (pivot*2+1) <= heapSize)
				if(A[left]<A[right])
					maxChild = right;
			
			// if A[i] >= A[k] ---> return;
			if(A[maxChild]<=A[pivot])
				return;
			
			// exchange A[i] and A[k]; 
			int max = A[maxChild];
			A[maxChild] = A[pivot];
			A[pivot] = max;
			
			// i = k;
			pivot = maxChild;
			left = (pivot)*2;
			right = (pivot)*2 + 1;
			maxChild = left;
		}
	}
	
	public static void main(String[] args) {
		printArray(array);
//		buildMaxHeap(array);
		heapsort(array);
//		maxHeapify(array, 5);
//		maxHeapify(array, 4);
//		maxHeapify(array, 3);
//		maxHeapify(array, 2);
//		maxHeapify(array, 1);
		printArray(array);
	}

}
