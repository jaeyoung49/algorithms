package step3_designing_recursion;

public class Exam04FindMaxValue1 {

	public static void main(String[] args) {

	}
	/*
	 * 	2-1. 매개변수의 명시화: 최대값 찾기
	 */
	public static int findMax(int[] data, int begin, int end){
		if(begin==end)
			return data[begin];
		else
			return Math.max(data[begin], findMax(data, begin+1, end));
	}
	
}
