package step3_designing_recursion;

public class Exam05FindMaxValue2 {

	public static void main(String[] args) {

	}
	/*
	 * 	2-2. 최대값 찾기2
	 */
	public static int findMax(int[] data, int begin, int end){
		if(begin==end)
			return data[begin];
		else{
			int middle = (begin+end)/2;
			int max1 = findMax(data, begin, middle);
			int max2 = findMax(data, middle+1, end);
			return Math.max(max1, max2);
		}
	}
	
}
