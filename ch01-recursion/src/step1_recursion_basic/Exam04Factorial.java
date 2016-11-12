package step1_recursion_basic;
 /**
  *   4. Factorial: n!
  *   	- 0! = 1
  *   	- n! = n*(n-1)!, n>0
  *   
  *		<��ȯ�Լ��� ������ �ͳ���>
  * 	 - ���� : factorial(int n)�� ���� �ƴ� ���� n�� ���ؼ� n!�� �ùٷ� ����Ѵ�
  * 	 - ���� :
  * 		1. n=0�� ��� : n=0�� ��� 1�� ��ȯ�Ѵ�. �ùٸ���.
  * 		2. ������ ���� ���� k�� ���ؼ� n<k�� ��� n!�� �ùٸ��� ����Ѵٰ� ��������.
  * 		3. n=k�� ��츦 ����غ���. factorial�� ���� factorial(k-1) ȣ���ϴµ�
  * 			2���� ������ ���ؼ� (k-1)!�� �ùٷ� ���Ǿ� ��ȯ�ȴ�. ���� �޼���
  * 			factorial�� k*(k-1)!=k!�� ��ȯ�Ѵ�.
  */
public class Exam04Factorial {

	public static void main(String[] args) {
		
		long result = factorial(4);
		System.out.println(result);
		
	}
	
	public static long factorial(long n){
		if(n==0)
			return 1;
		else
			return n*factorial(n-1);
	}
	
}
