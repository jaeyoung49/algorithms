package step2_recursive_thinking;

public class Exam02PrintString {

	public static void main(String[] args) {
		printChars("ShowMeTheMoney");
	}
	/**
	 * 2. ���ڿ��� �ѱ��ھ� ������� ���
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
