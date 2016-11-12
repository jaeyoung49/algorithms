package step1_basic_sort;

public class Exam01SelectionSort {
	
	private static int[] sortArray = {29, 10, 14, 37, 13};
	private static int[] insertionSortArray = {15, 12, 13, 10, 14, 11};
	
	public static void printArray(int[] A){
		for(int i=0; i<A.length; i++)
			System.out.print(A[i] + ", ");
		System.out.println();
	}
	
	public static void selectionSort (int[] A){
		for(int i=0; i<A.length; i++){
			// 1. maxNum ã��
			int maxNum = 0;
			int index = 0;
			for(int j=0; j<A.length-i; j++){
				if(maxNum<A[j]){
					maxNum = A[j];
					index = j;
				}
			}
			// 2. A[j] <-> A[last] ��ȯ
			A[index] = A[A.length-1-i]; 
			A[A.length-1-i] = maxNum;
		}
	}
	
	public static void bubbleSort(int[] A){
		for(int i=0; i<A.length; i++){
			for(int j=i+1; j<A.length; j++){
				if(A[i]>A[j]){
					int temp = A[i];
					A[i] = A[j];
					A[j] = temp;
				}
			}
		}
	}
	
	public static void insertSort(int[] A){
		for(int i=0; i<A.length-1; i++){
			int temp = A[i+1];
			boolean flag = true;
			int count = 0;
			while(flag){
				if(i-count<0 || A[i-count]<temp){	// or ��������"|"�̸� ��� ���� üũ
					A[i-count+1] = temp;			// "||"�̸� ���� ���ð�� ���ǹ� ������ �ߴ�
					count = 0;
					flag=false;
				} else {
					A[i-count+1] = A[i-count];
					count++;
				} 
			}
		}
	}
	
	
	public static void main(String[] args) {
		printArray(insertionSortArray);
		insertSort(insertionSortArray);
		printArray(insertionSortArray);
		
	}

}
