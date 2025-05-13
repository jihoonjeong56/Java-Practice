package exam30;

public class WrapperTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer num01 = 10;//autoBoxing가능
		//Integer num02 = new Integer(10);//사용못함
		Integer num03 = Integer.valueOf(10);
		Integer num04 = Integer.valueOf("10");//문자타입 숫자(정수) --> 정수
		
		Double dnum01 = 10.11;
		Double dnum02 = Double.valueOf("10.11");
		Double dnum03 = Double.valueOf("10");
		
		System.out.println("정수 : "+ num01);
		System.out.println("정수 : "+ num03);
		System.out.println("정수 : "+ num04);
		System.out.println("정수 : "+ dnum01);
		System.out.println("정수 : "+ dnum02);
		System.out.println("정수 : "+ dnum03);
		
		
	}

}
