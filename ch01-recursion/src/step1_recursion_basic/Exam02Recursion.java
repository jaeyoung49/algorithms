package step1_recursion_basic;
/**
 * Recursion�� �׻� ���ѷ����� ������ ���� �ƴϴ�
 */
public class Exam02Recursion {
	
	public static void main(String[] args) {
		int n = 4;
		function(n);
		
	}
	
	
	public static void function(int k){
		/**
		 * BaseCase : ��� �ϳ��� recursion�� ������ �ʴ� ��찡 �����ؾ� �Ѵ�
		 */
		if(k<=0){
			return;
		} else {
			System.out.println("Hello....");
			/*
			 * RecursiveCase : recursion�� �ݺ��ϴٺ��� �ᱹ BaseCase�� �����ؾ� �Ѵ�
			 */
			function(k-1);
		}
	}
}