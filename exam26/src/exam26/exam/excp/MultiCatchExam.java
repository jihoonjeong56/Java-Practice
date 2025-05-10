package exam26.exam.excp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatchExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan  = new Scanner(System.in);
		
		try {
			int [] cards = {4,2,5,6,7,1,3};
			System.out.println("몇번째 카드?");
			int cardIndex = scan.nextInt();
			System.out.println("뽑힌 카드는 : "+ cards[cardIndex]);
			}catch (InputMismatchException e) {
				System.out.println("키 입력이 잘몼되었습니다.");
			}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 위치가 잘못되었습니다.");
	
	}finally {
		System.out.println("예외 끝");
		scan.close();
	}
		


	}
	
}
