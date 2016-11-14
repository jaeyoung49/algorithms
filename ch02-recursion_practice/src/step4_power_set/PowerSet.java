package step4_power_set;

public class PowerSet {
	/*
	 * Mission:
	 * 		data[k], ... , data[n-1]의 멱집합을 구한 후 각각에
	 * 		include[i]=true -> i=0, ... , k-1인 원소를 추가하여 출력하라.
	 */
	private static char data[] = {'a', 'b', 'c'};
	private static int n = data.length;
	private static boolean[] include = new boolean[n];		
												// include, int k는
	public static void powerSet(int k){			// 트리상에서 현재 나의 위치를 표현한다
		if(k==n){	// 만약 내 위치가 리프노드라면								
			for(int i=0; i<n; i++)
				if(include[i])
					System.out.print(data[i] + " ");
			System.out.println();
			return;
		}					
		include[k]=false;	// 먼저 왼쪽으로 내려갔다가
		powerSet(k+1);	
		include[k]=true;	// 이번엔 오른쪽으로 내려간다.
		powerSet(k+1);
	}
	
	public static void main(String[] args) {
		/*
		 * 처음 이 함수를 호출할 때는 powerSet(0)로 호출한다.
		 * 즉 P는 공집합이고 S는 전체집합이다.
		 */
		PowerSet.powerSet(0);	
	}
}