package step1_quicksort;

public class QuickSort {
	
	private static int[] arr = {31,	8,	48,	73,	11,	3,	20,	29,	65,	15};
	
	public static void printArray(int[] A){
		for(int c : A)
			System.out.print(c + ", ");
		System.out.println();
	}
	
	public static void quickSort(int[] A, int p, int r){
		if(p<r){
			int q = partition(A, p, r);
			quickSort(A, p, q-1);
			quickSort(A, q+1, r);
		}
	}
	
	public static int partition(int[] A, int p, int r){
		int x = A[r];
		int i = p-1;
		for(int j=p; j<r; j++){
			if(A[j] <= x){
				i++;
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			}
		}
		int temp = A[i+1];
		A[i+1] = A[r];
		A[r] = temp;
		return i+1;
	}
	
	public static void main(String[] args) {
		printArray(arr);
		quickSort(arr, 0, 9);
		printArray(arr);
	}

}
