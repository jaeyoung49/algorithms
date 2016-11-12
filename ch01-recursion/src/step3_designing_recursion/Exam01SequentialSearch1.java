package step3_designing_recursion;
/**
 * 	- ��ȯ�� �˰��� ����
 * 		- ��� �ϳ��� base case, �� ��ȯ���� �ʰ� ����Ǵ� case�� �־����
 * 		- ��� case�� �ᱹ base case�� �����ؾ� ��
 * 
 * 	*****�Ͻ���(implicit) �Ű������� �����(explicit) �Ű������� �ٲپ��!!!
 */
public class Exam01SequentialSearch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/*	1-1. �Ͻ��� �Ű����� : ����Ž��
	 * 	�� �Լ��� �̼��� data[0]���� data[n-1] ���̿��� target�� �˻��ϴ� ���̴�.
	 * 	������ �˻� ������ ���� �ε��� 0�� ���� �����Ѵ�.
	 * 	�� ***�Ͻ���(implicit) �Ű������̴�.
	 */
	public static int search(int[] data, int n, int target){
		for(int i=0; i<n; i++){
			if(data[i]==target)
				return i;
		}
		return -1;
	}
	
	/*
	 * 	1-2. ����� �Ű����� : ����Ž��
	 * 	�� �Լ��� �̼��� data[begin]���� data[end] ���̿��� target�� �˻��Ѵ�.
	 * 	��, �˻������� �������� �����(explicit)���� �����Ѵ�.
	 * 
	 * 		1-2-1. 0���� n-1�� ������ Ž��
	 */
	public static int search(int[] data, int begin, int end, int target){
		if(begin>end)
			return -1;
		else if(target==data[begin])
			return begin;
		else
			return search(data, begin+1, end, target);
	}

	
}
