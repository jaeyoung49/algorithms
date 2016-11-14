package step1_heapsort;

public class Heapsort {
	
	public static int[] array = {0, 4, 1, 3, 2, 16, 9, 10, 14, 8, 7};

	public static void printArray(int[] A){
		for(int c : A)
			System.out.print(c + ", ");
		System.out.println();
	}
	
	public static void buildMaxHeap(int[] A){
		int heapSize = A.length;
		for(int i = heapSize/2; i>0; i--){
			maxHeapify(A, i, heapSize);
		}
	}
	
	public static void maxHeapify(int[] A, int i, int heapSize){
		int pivot = i;
		int left = (pivot)*2;
		int right = (pivot)*2 + 1;
		int maxChild = left;
		//while A[i] has a child do
		while(left <= heapSize){
			// k <- index of the biggest child of i;
			if( right <= heapSize)
				if(A[left-1] < A[right-1])
					maxChild = right;
			
			// if A[i] >= A[k] ---> return;
			if(A[maxChild-1]<=A[pivot-1])
				return;
			
			// exchange A[i] and A[k]; 
			int max = A[maxChild-1];
			A[maxChild-1] = A[pivot-1];
			A[pivot-1] = max;
			
			// i = k;
			pivot = maxChild;
			left = (pivot)*2;
			right = (pivot)*2 + 1;
			maxChild = left;
		}
	}

	public static void heapsort(int[] A){
		// 1. Build-Max-Heap(A)
		buildMaxHeap(A);
		int heapSize = A.length;
		
		// 2. for i <- heap_size down to 2 do
		for(int i=heapSize; i>1; i--){
			// 3. exchange A[1] <-> A[i]	
			int temp = A[0];
			A[0] = A[i-1];
			A[i-1] = temp;
			
			// 4. heap_size <- heap_size-1
			heapSize--;
						
			// 5. Max-Heapify(A, 1)
			maxHeapify(A, 1, heapSize);
		}
	}
	
	public static void main(String[] args) {
		printArray(array);

//		buildMaxHeap(array);
		
//		maxHeapify(array, 5);
//		maxHeapify(array, 4);
//		maxHeapify(array, 3);
//		maxHeapify(array, 2);
//		maxHeapify(array, 1);
		
		heapsort(array);
		
		printArray(array);
	}

}