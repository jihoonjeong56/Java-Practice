package exam4;

import java.util.Scanner;

public class IfTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("나이를 입력 : ");
		int age = scan.nextInt();
		if (age>19) {
			System.out.println("성인입니다.");
		}else {
			System.out.println("미성년자 입니다.");
		}
		scan.close();
		

	}

}
