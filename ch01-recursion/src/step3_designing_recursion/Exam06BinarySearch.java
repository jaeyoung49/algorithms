package step3_designing_recursion;

public class Exam06BinarySearch {

	public static void main(String[] args) {

	}
	/*
	 * 	3. BinarySearch
	 * 		- 파일크기로 순차적으로 정렬했을경우
	 * 			middle보다 크면 middle+1에서 end사이를
	 * 			middle보다 작으면 begin에서 middle-1사이를 검색한다
	 */
	public static int binarySearch(String[] items, String target, int begin, int end){
		if(begin>end)
			return -1;
		else{
			int middle = (begin+end)/2;
			int compResult = target.compareTo(items[middle]);
			if(compResult == 0)
				return middle;
			else if(compResult<0)
				return binarySearch(items, target, begin, middle-1);
			else
				return binarySearch(items, target, middle+1, end);
		}
	}
	
}