package step2_recursive_thinking;

public class Exam04PrintInBinary {

	public static void main(String[] args) {
		printInBinary(10);
	}
	/**
	 * 4. 2������ ��ȯ�Ͽ� ���
	 * 	- ���� �ƴ� ����n�� �������� ��ȯ�Ͽ� �μ��Ѵ�.
	 * @param n
	 */
	public static void printInBinary(int n){
		if(n<2)
			System.out.print(n);
		else{
			// n�� 2�� ���� ���� ���� 2������ ��ȯ�Ͽ� �μ��� ��
			printInBinary(n/2);
			// n�� 2�� ���� �������� �μ��Ѵ�
			System.out.print(n%2);
		}
	}
	
}
