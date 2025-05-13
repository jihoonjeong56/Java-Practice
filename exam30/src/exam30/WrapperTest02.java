package exam30;

public class WrapperTest02 {
	public static void main(String[] args) {
		String intStr = "70";
		String doubleStr = "60.77";
		
		/*
		 * 정수 경우
		 * valueOf() --> 정수 또는 문자형 타입 정수 리턴락입: Integer
		 * parseInt()--> 문자형 타입 정수. 리턴타입= int 
		 */
		int myScore = Integer.parseInt(intStr);
		double cutLine = Double.parseDouble(doubleStr);
		
		if(myScore>= cutLine) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
	}
}
