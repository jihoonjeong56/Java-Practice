package exam35;

public class CompareMaxMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		int num01 = 20;
		int num02 = 30;
		
		//익명클래스 만들기
		CompareMax compareMax =  (x,y)-> x > y ? 1 : x < y ? -1 : 0;
		
		
		int result = compareMax.max(num01, num02);
		
		if(result ==1) {
			System.out.println(num01+ "이"+num02+"보다 크다");
		}else if(result == -1) {
			System.out.println(num01+ "이"+num02+"보다 작다");
		}else {
			System.out.println(num01+ "과 "+num02+"는 같다");

		}
	}

}
