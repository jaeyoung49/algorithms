package step1_recursion_basic;
/**
 * 	7. Greatest Common Divisor : GCD(최대공약수)
 */
public class Exam07EuclidGCD {

	public static void main(String[] args) {

	}

	/*public static double gcd(int m, int n){
		if(m<n){
			int temp=m; m=n; n=temp;		// swap m and n
		}
		if(m%n==0)
			return n;
		else
			return gcd(n, m%n);
	}*/
	
	// 굳이 swap을 하지 않아도 된다.
	public static int gcd(int p, int q){
		if(q==0)
			return p;
		else
			return gcd(q, p%q);
	}
}
