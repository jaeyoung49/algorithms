package step1_merge_sort;

public class MergeSort {
	private static char[] charArray = {'a','l','g','o','r','i','t','h','m','s'};
	
	public static void printArray(char[] A){
		for(char c : A)
			System.out.print(c);
		System.out.println();
	}
	
	public static void mergeSort(char[] A, int p, int r){
		if( p < r ){
			int q = (p+r)/2;
			mergeSort(A, p, q);
			mergeSort(A, q+1, r);
			merge(A, p, q, r);
			printArray(A);
		}
	}
	
	public static void merge(char[] data, int p, int q, int r){
		int i=p, j=q+1, k=p;
		char[] temp = new char[data.length];
		while(i<=q && j<=r){
			if(data[i]<=data[j])
				temp[k++] = data[i++];
			else
				temp[k++] = data[j++];
		}
		while (i<=q){
			temp[k++] = data[i++];
		}
		while (j<=r){
			temp[k++] = data[j++];
		}
		for (int n=p; n<=r; n++)
			data[n] = temp[n];
	}
	
	public static void main(String[] args) {
		printArray(charArray);
		mergeSort(charArray, 0, 9);
		printArray(charArray);
	}

}
