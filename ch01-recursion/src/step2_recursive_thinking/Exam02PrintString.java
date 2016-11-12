package step2_recursive_thinking;

public class Exam02PrintString {

	public static void main(String[] args) {
		printChars("ShowMeTheMoney");
	}
	/**
	 * 2. 문자열을 한글자씩 순서대로 출력
	 * @param str
	 */
	public static void printChars(String str){
		if(str.length()==0)
			return;
		else{
			System.out.print(str.charAt(0));
			printChars(str.substring(1));
		}
	}
	
}
