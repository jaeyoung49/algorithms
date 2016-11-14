package step1_recursion_basic;
/**
 * 	5. power(제곱)
 */
public class Exam05Power {

	public static void main(String[] args) {
		double result = power(3, 14);
		System.out.println(result);
	}

	public static double power(double x, int n){
		if(n==0)
			return 1;
		else
			return x*power(x, n-1);
	}
	
}
