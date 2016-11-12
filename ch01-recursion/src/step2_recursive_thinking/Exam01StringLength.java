/**
 * 	recursion�� �����Լ� ��꿡�� �����Ѱ�?
 * 		: �����Լ��� �ƴ϶� �ٸ� ���� �������� recursion���� �ذ��� �� �ִ�.
 * 
 * 	Recursion vs. Iteration
 *		- ��� ��ȯ�Լ��� �ݺ���(iteration)���� ���� ����
 * 		- �� ���� ������. �� ��� �ݺ����� recursion���� ǥ��������
 * 		- ��ȯ�Լ��� ������ �˰����� �ܼ��ϰ� �˱� ���� ǥ���ϴ� ���� �����ϰ� ��
 *		- ������ �Լ� ȣ�⿡ ���� �����ص尡 ����
 *			(�Ű����� ����, ��Ƽ���̼� ������ ���� ��)
 */
package step2_recursive_thinking;

public class Exam01StringLength {

	public static void main(String[] args) {
		System.out.println(length("ace"));
	}
	/**
	 * 1. ���ڿ��� ���̸� ��ȯ�ϴ� recursion
	 * @param str
	 * @return
	 */
	public static int length(String str){
		if(str.equals(""))
			return 0;
		else
			return 1 + length(str.substring(1));
	}
	
}
