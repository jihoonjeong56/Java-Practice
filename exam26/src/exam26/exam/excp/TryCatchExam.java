package exam26.exam.excp;

public class TryCatchExam {

	public static void main(String[] args) {

		try {
			int num = 15;
			int result = num /0;
			System.out.println("결과 : " +result);
			
			Integer a = null;
			System.out.println(a/10);
			
		}catch(ArithmeticException e) {
			System.out.println("0으로나눌수 없습니다.");
			e.printStackTrace();//내부에서 에러난 내용전체 풀력
			System.out.println(e.getMessage());//에러메세지만 출력
		}
		
		System.out.println("프로그램종료");
	}

}
