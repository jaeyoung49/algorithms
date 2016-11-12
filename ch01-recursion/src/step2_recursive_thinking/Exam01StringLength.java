/**
 * 	recursion은 수학함수 계산에만 유용한가?
 * 		: 수학함수뿐 아니라 다른 많은 문제들을 recursion으로 해결할 수 있다.
 * 
 * 	Recursion vs. Iteration
 *		- 모든 순환함수는 반복문(iteration)으로 변경 가능
 * 		- 그 역도 성립함. 즉 모든 반복문은 recursion으로 표현가능함
 * 		- 순환함수는 복잡한 알고리즘을 단순하고 알기 쉽게 표현하는 것을 가능하게 함
 *		- 하지만 함수 호출에 따른 오버해드가 있음
 *			(매개변수 전달, 액티베이션 프레임 생성 등)
 */
package step2_recursive_thinking;

public class Exam01StringLength {

	public static void main(String[] args) {
		System.out.println(length("ace"));
	}
	/**
	 * 1. 문자열의 길이를 반환하는 recursion
	 * @param str
	 * @return
	 */
	public static int length(String str){
		if(str.equals(""))
			return 0;
		else
			return 1 + length(str.substring(1));
	}
	
}
