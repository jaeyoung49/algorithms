package step2_recursive_thinking;

public class Exam03PrintStringReverse {

	public static void main(String[] args) {
		printCharsReverse("ShowMeTheMoney");
	}
	/**
	 * 3. ���ڿ��� �������� ��ȯ�Ͽ� ���
	 * @param str
	 */
	public static void printCharsReverse(String str){
		if(str.length()==0)
			return;
		else{
			printCharsReverse(str.substring(1));
			System.out.print(str.charAt(0));
		}
	}
	
}
