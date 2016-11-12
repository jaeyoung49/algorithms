package step3_designing_recursion;

public class Exam02SequentialSearch2 {
	
	public static void main(String[] args) {
		
	}
	
	/*	
	 * 	1-2. 명시적 매개변수 : 순차탐색
	 * 		1-2-2. n-1부터 0의 순으로 탐색
	 */
	public static int search(int[] data, int begin, int end, int target){
		if(begin>end)
			return -1;
		else if(target==data[end])
			return end;
		else
			return search(data, begin, end-1, target);
	}

	
}
