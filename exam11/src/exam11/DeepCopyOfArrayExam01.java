package exam11;

public class DeepCopyOfArrayExam01 {

	public static void main(String[] args) {
		int[] arr01 = {1,3,5,7,9};
		int[] arr02 = new int[5];
		
		//첫번째 값의 배열을 loop를 이용해 대입
		for(int i=0; i<arr01.length; i++) {
			arr02[i] = arr01[i];
		}
		
		arr02[1] =11;
		arr01[0] = 8;
		System.out.println();
		System.out.println("arr02값 출력 : ");
		for(int i=0; i<arr02.length; i++) {
			System.out.print(arr02[i]+ "\t");
		}
		System.out.println();
		System.out.println("arr01값 출력 : ");
		for(int i=0; i<arr01.length; i++) {
			System.out.print(arr01[i]+ "\t");
		}

	}

}
