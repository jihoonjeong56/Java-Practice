package exam.code.str;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "오늘은 비가 너무 많이 옵니다. 다들 비를 조심하세요.";
		System.out.println("문장의 길이 : "+str.length());
		
		System.out.println("문자추 추출 : "+  str.charAt(11));
		System.out.println("해당문자 위치 : "+str.indexOf("이"));
		System.out.println("해당 문자 마지막 위치 : " +str.lastIndexOf("비"));
		
		String str2 = "11오늘은 비22가 너무 많이 옵니다. 33다들 비를 조심하세요.";
		System.out.println(str2.replaceAll("[0-9]", ""));
		
		String str3 = "오늘은 날씨가 험하니 집에 일찎 귀가하세요.";
		System.out.println(str3.substring(11));
		System.out.println(str3.substring(0,11));
		
				

	}

}
