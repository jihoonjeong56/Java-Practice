package exam.code.str;

public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sb = new StringBuilder()
;
		sb.append("안녕하세요" +"\n");
		sb.append("만나서 반갑습니다.");
		System.out.println(sb);
		
		//삭제
		//-delete(int start, int end); start<= x<end
		sb.delete(0, 4);
		System.out.println(sb);
		
		//삽입
		sb.insert(0, "안녕하세요");//연속성 있어야함
		System.out.println("---------------------");
		System.out.println(sb);
		System.out.println("---------------------");
		System.out.println(sb.reverse());
		
		}

}
