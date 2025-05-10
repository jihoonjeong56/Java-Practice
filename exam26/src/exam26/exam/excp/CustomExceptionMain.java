package exam26.exam.excp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("나이를 읿력 : ");
			int age = scan.nextInt();
			if(age<1) {
				throw new CustomException("입력범위오류");
			}else if(age<8) {
				System.out.println("유아");
			}else if(age<15) {
				System.out.println("어린이");
			}else if(age<19) {
				System.out.println("청소년");
			}else {
				System.out.println("성인");
			}
		} catch (CustomException e) {
	
			System.out.println(e.getMessage() ==null ? "입력범위 오류 " : e.getMessage());
		}catch (InputMismatchException e) {
			System.out.println(e.getMessage() ==null ? "입력 오류 " : e.getMessage());
		}

	}

}
