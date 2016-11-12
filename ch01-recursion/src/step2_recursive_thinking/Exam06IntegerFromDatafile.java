package step2_recursive_thinking;

import java.util.Scanner;

public class Exam06IntegerFromDatafile {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] data = {2,3,5,7,11,13};
		readFrom(6, data, in);
	}
	/**
	 * 6. ���������Ϸκ��� n���� ���� �о����
	 * 		: Scanner in�� �����ϴ� ���Ϸκ��� n���� ������ �Է¹޾� 
	 * 			�迭 data�� data[0], ... , data[n-1]�� �����Ѵ�. 
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
