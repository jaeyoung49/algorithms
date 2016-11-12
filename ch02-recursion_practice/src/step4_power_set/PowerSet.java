package step4_power_set;

public class PowerSet {
	/*
	 * Mission:
	 * 		data[k], ... , data[n-1]�� �������� ���� �� ������
	 * 		include[i]=true -> i=0, ... , k-1�� ���Ҹ� �߰��Ͽ� ����϶�.
	 */
	private static char data[] = {'a', 'b', 'c'};
	private static int n = data.length;
	private static boolean[] include = new boolean[n];		
												// include, int k��
	public static void powerSet(int k){			// Ʈ���󿡼� ���� ���� ��ġ�� ǥ���Ѵ�
		if(k==n){	// ���� �� ��ġ�� ���������								
			for(int i=0; i<n; i++)
				if(include[i])
					System.out.print(data[i] + " ");
			System.out.println();
			return;
		}					
		include[k]=false;	// ���� �������� �������ٰ�
		powerSet(k+1);	
		include[k]=true;	// �̹��� ���������� ��������.
		powerSet(k+1);
	}
	
	public static void main(String[] args) {
		/*
		 * ó�� �� �Լ��� ȣ���� ���� powerSet(0)�� ȣ���Ѵ�.
		 * �� P�� �������̰� S�� ��ü�����̴�.
		 */
		PowerSet.powerSet(0);	
	}
}
