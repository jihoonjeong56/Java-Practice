package exam13;

public class DoubleArrayExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2차배열 선언
		int[][] arr = new int[3][5];
		//선언2
		int[][] arr01 = new int[3][];
		//선언3
		int[][] arr02 = {{1,2,3},{4,5,6}};
		
		//출력
		System.out.println("2차배열 : "+ arr);
		System.out.println("2차배열의 1차수 출력 : "+ arr[1]);
		System.out.println("2차배열의 1차수 출력 : "+ arr[2]);
		System.out.println("2차배열의21차수 출력 : "+ arr02[1][1]);
		
		
		//ㅣ열을 쓰지 않고 선언했다면 추가해 주어야 한다.
		for(int i=0; i<arr01.length; i++) {
			arr01[i] = new int[3];
			
		}
				

	}

}
