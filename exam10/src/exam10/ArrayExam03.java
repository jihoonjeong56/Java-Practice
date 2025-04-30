package exam10;

import java.util.Arrays;

public class ArrayExam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		
			for(int i=0; i<10; i++) {
				arr[i] = (int)(Math.random()*50)+1;	
			}
		System.out.println("정렬전 : " + Arrays.toString(arr));
		
		//버블정렬
		int temp =0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j < (arr.length - 1)-i ;j++) {
				//오름차순은 현재위치보다 다음위치 값이 커야하는데
				//현재 위치값이 크다면 앞뒤를 변경한다.
				if(arr[j]>arr[j+1]) {
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;  
							
				}
			}
		}
		System.out.println("정렬후 : "+ Arrays.toString(arr));
		

	}

}
