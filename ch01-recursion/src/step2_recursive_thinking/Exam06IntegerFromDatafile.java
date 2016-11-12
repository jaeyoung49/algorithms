package step2_recursive_thinking;

import java.util.Scanner;

public class Exam06IntegerFromDatafile {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] data = {2,3,5,7,11,13};
		readFrom(6, data, in);
	}
	/**
	 * 6. 데이터파일로부터 n개의 정수 읽어오기
	 * 		: Scanner in이 참조하는 파일로부터 n개의 정수를 입력받아 
	 * 			배열 data의 data[0], ... , data[n-1]에 저장한다. 
	 * @param n
	 * @param data
	 * @param in
	 */
	public static void readFrom(int n, int[] data, Scanner in){
		if(n==0)
			return;
		else{
			printArray(n, data);
			System.out.println();
			readFrom(n-1, data, in);
			data[n-1] = in.nextInt();
			
			printArray(n, data);
		}
	}
	
	public static void printArray(int n, int[] data){
		if(n<=0)
			return;
		else{
			printArray(n-1, data);
			System.out.print(data[n-1] + ", ");
		}
	}
	
}
