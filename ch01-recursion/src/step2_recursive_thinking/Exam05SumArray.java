package step2_recursive_thinking;

public class Exam05SumArray {

	public static void main(String[] args) {
		int[] data = {2, 3, 5, 7, 11};
		System.out.println(sum(3, data));
	}
	/**
	 * 5. 배열의 합 구하기
	 */
	public static int sum(int n, int[] data){
		if(n<=0)
			return 0;
		else
			return data[n-1] + sum(n-1, data);
		
	}
	
}