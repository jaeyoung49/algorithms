package step1_recursion_basic;
/**
 * 3. 1~n������ ��
 * 
 * <��ȯ�Լ��� ������ �ͳ���>
 * 	- ���� : function(int n)�� ���� �ƴ� ������ n�� ���ؼ� 0���� n������ ���� �ùٷ� ����Ѵ�
 * 	- ���� : 
 * 		1. n=0�� ��� : n=0�� ��� 0�� ��ȯ�Ѵ�. �ùٸ���.
 * 		2. ������ ���� ���� k�� ���ؼ� n<k�� ��� 
 * 			0���� n������ ���� �ùٸ��� ����Ͽ� ��ȯ�Ѵٰ� ��������
 * 		3. n=k�� ��츦 ����غ���.
 * 			function�� ���� function(k-1) ȣ���ϴµ� 2���� ������ ���ؼ� 0���� k-1������ ����
 * 			�ùٷ� ���Ǿ� ��ȯ�ȴ�. �޼��� function�� �� ���� n�� ���ؼ� ��ȯ�Ѵ�. ����
 * 			�޼��� function�� 0���� k������ ���� �ùٷ� ����Ͽ� ��ȯ�Ѵ�.
 */
public class Exam03Sum {

	public static void main(String[] args) {
		
		int result = function(4);
		System.out.println(result);
		
	}
	/*
	 * �ؼ����
	 * 	1. �� �Լ��� mission�� 0~n������ ���� ���ϴ� ���̴�.
	 */
	public static int function(int n){
		// 2. n==0�̶�� ���� 0�̴�.
		if(n==0)
			return 0;
		else
			// 3. n�� 0���� ũ�ٸ� 0���� n-1������ �տ� n�� ���� ���̴�.
			return n + function(n-1);
	}

}
