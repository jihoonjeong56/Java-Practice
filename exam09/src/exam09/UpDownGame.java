package exam09;

import java.util.Scanner;

public class UpDownGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target = (int)(Math.random()*50)+1;
		Scanner scan = new Scanner(System.in);
		
		int count =0;
		int user =0;
		while(true) {
			System.out.println("숫자를 입력 : ");
			user = scan.nextInt();
			
			if(target==user) {
				System.out.println("정답! 숫자는"+ user + "입니다.");
				System.out.println(count + "번 마에 맞췄어요");
				break;
			}else if(target> user) {
				System.out.println("업!");
			}else if(target<user) {
				System.out.println("다운!");
			}
			count++;
			
		}
		scan.close();

	}

}
