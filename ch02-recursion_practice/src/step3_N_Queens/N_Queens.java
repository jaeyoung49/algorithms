package step3_N_Queens;

public class N_Queens {
	private static int n;
	private static int[] cols;

	public static void setN(int n) {
		N_Queens.n = n;
		cols = new int [n+1];
	}

	
	public static boolean queens(int level){
		if( !promising(level) )
			return false;
		else if ( level == n ){
			for (int i=1; i<=n; i++){
				System.out.println("(" + i + ", " + cols[i] + ")");
			}
			return true;
		} for (int i=1; i<=n; i++){
			cols[level+1] = i;
			if ( queens(level+1) ){
				return true;
			}
		}
		return false;
	}
	
	public static boolean promising(int level){
		for( int i=1; i<level; i++) {
			if ( cols[level] == cols[i] )
				return false;
			else if ( level-i == Math.abs(cols[level] - cols[i]))
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		setN(10);

		/*for(int i : cols)
			System.out.print(i + ", ");
		System.out.println();*/			// 배열 생산 확인
		
		queens(0);
		
	}
	
}
