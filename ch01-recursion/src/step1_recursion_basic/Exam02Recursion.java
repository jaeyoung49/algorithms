package step1_recursion_basic;
/**
 * Recursion이 항상 무한루프에 빠지는 것은 아니다
 */
public class Exam02Recursion {
	
	public static void main(String[] args) {
		int n = 4;
		function(n);
		
	}
	
	
	public static void function(int k){
		/**
		 * BaseCase : 적어도 하나의 recursion에 빠지지 않는 경우가 존재해야 한다
		 */
		if(k<=0){
			return;
		} else {
			System.out.println("Hello....");
			/*
			 * RecursiveCase : recursion을 반복하다보면 결국 BaseCase로 수렴해야 한다
			 */
			function(k-1);
		}
	}
}