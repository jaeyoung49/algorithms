package step1_recursion_basic;
/**
 * 3. 1~n까지의 합
 * 
 * <순환함수와 수학적 귀납법>
 * 	- 정리 : function(int n)은 음이 아닌 정수에 n에 대해서 0에서 n까지의 합을 올바로 계산한다
 * 	- 증명 : 
 * 		1. n=0인 경우 : n=0인 경우 0을 반환한다. 올바르다.
 * 		2. 임의의 양의 정수 k에 대해서 n<k인 경우 
 * 			0에서 n까지의 합을 올바르게 계산하여 반환한다고 가정하자
 * 		3. n=k인 경우를 고려해보자.
 * 			function은 먼저 function(k-1) 호출하는데 2번의 가정에 의해서 0에서 k-1까지의 합이
 * 			올바로 계산되어 반환된다. 메서드 function은 그 값에 n을 더해서 반환한다. 따라서
 * 			메서드 function은 0에서 k까지의 합을 올바로 계산하여 반환한다.
 */
public class Exam03Sum {

	public static void main(String[] args) {
		
		int result = function(4);
		System.out.println(result);
		
	}
	/*
	 * 해석방법
	 * 	1. 이 함수의 mission은 0~n까지의 합을 구하는 것이다.
	 */
	public static int function(int n){
		// 2. n==0이라면 합은 0이다.
		if(n==0)
			return 0;
		else
			// 3. n이 0보다 크다면 0에서 n-1까지의 합에 n을 더한 것이다.
			return n + function(n-1);
	}

}