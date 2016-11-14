package step3_designing_recursion;
/**
 * 	- 순환적 알고리즘 설계
 * 		- 적어도 하나의 base case, 즉 순환되지 않고 종료되는 case가 있어야함
 * 		- 모든 case는 결국 base case로 수렴해야 함
 * 
 * 	*****암시적(implicit) 매개변수를 명시적(explicit) 매개변수로 바꾸어라!!!
 */
public class Exam01SequentialSearch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/*	1-1. 암시적 매개변수 : 순차탐색
	 * 	이 함수의 미션은 data[0]에서 data[n-1] 사이에서 target을 검색하는 것이다.
	 * 	하지만 검색 구간의 시작 인덱스 0은 보통 생략한다.
	 * 	즉 ***암시적(implicit) 매개변수이다.
	 */
	public static int search(int[] data, int n, int target){
		for(int i=0; i<n; i++){
			if(data[i]==target)
				return i;
		}
		return -1;
	}
	
	/*
	 * 	1-2. 명시적 매개변수 : 순차탐색
	 * 	이 함수의 미션은 data[begin]에서 data[end] 사이에서 target을 검색한다.
	 * 	즉, 검색구간의 시작점을 명시적(explicit)으로 지정한다.
	 * 
	 * 		1-2-1. 0부터 n-1의 순으로 탐색
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