package step1_recursion_basic;
/**
 *	6. Fibonacci Number
 * 		- f0 = 0
 * 		- f1 = 1
 * 		- fn = fn-1 + fn-2, n>1
 * 		
 * 		0 : 0,	1 : 1,	2 : 1,	3 : 2,	4 : 3,	5 : 5
 * 				6 : 8,	7 : 13,	8 : 21,	9 : 34,	10 : 55,
 * 				11 : 89
 */
public class Exam06FibonacciNumber {

	public static void main(String[] args) {
		int result = fibonacci(11);
		System.out.println(result);
	}
	
	public static int fibonacci(int n){
		if(n<2)
			return n;
		else
			return fibonacci(n-1) + fibonacci(n-2);
	}
	
}
