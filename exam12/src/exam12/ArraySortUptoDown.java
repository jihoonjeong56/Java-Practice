package exam12;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySortUptoDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//배열선언
		Integer[] arr = {5,7,1,4,11,9,10,2,4,3};
		//배열출력
		System.out.println("정렬전: " +Arrays.toString(arr));
		
		//내림차순 정렬
		Arrays.sort(arr, Comparator.reverseOrder());
		
		System.out.println("정렬후 : "+ Arrays.toString(arr));
	
	}

}
