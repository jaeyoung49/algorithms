package step2_recursive_thinking;

public class Exam04PrintInBinary {

	public static void main(String[] args) {
		printInBinary(10);
	}
	/**
	 * 4. 2진수로 변환하여 출력
	 * 	- 음이 아닌 정수n을 이진수로 변환하여 인쇄한다.
	 * @param n
	 */
	public static void printInBinary(int n){
		if(n<2)
			System.out.print(n);
		else{
			// n을 2로 나눈 몫을 먼저 2진수로 변환하여 인쇄한 후
			printInBinary(n/2);
			// n을 2로 나눈 나머지를 인쇄한다
			System.out.print(n%2);
		}
	}
	
}
