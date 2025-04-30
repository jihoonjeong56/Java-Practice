package exam08;

import java.util.Scanner;

public class WhileTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target = (int)(Math.random()*50 +1);
		Scanner scan = new Scanner(System.in);
		
		int user = 0;
		int count = 0;
		while(target != user) {
			
			System.out.println("숫자를 입력  : ");
			user = scan.nextInt();
			if(target > user) {
				System.out.println("엽!!");				
			}else if(target<user) {
				System.out.println("다운!");
			}else {
				System.out.println("정답! 값은 : "+target+"입니다.");
				System.out.println(count + "번 만에 맞췄습티다.");
			}
			count++;
		}
		scan.close();

	}

}
