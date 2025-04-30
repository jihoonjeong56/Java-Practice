package lottoExam;

import java.util.Scanner;

public class LottoSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1부터 45 버의 공을 모두 가진다.
		int[] lottoMachine = new int[45];
		//선택된 로또번호를 저장할 배열
		int[] lottoBalls = new int[6];
		//보너스번호 저장
		int bonusNumber =0;
		
		//1~45개 공 생성
		for(int i=0; i<lottoMachine.length; i++) {
			lottoMachine[i] = i+1;
		}
		int count =0;
		while(count<7) {
			//공을 선택하는 위치를 랜덤함수로 선택
			int index = (int)(Math.random()*(45-count));
			//선택된 index 의 값이 0이 아니면 아직 미사용, 0이면 사용된 위치
			if(lottoMachine[index]!= 0) {
				if(count<6) {
					lottoBalls[count++] = lottoMachine[index];
				}else {
					bonusNumber = lottoMachine[index];
					count++;
				}
				//사용했다는 증거
				lottoMachine[index] = 0;
			}
		}
		for(int i=0; i<lottoBalls.length; i++) {
			System.out.print(lottoBalls[i]+ " ");
		}
		System.out.println("보너스 번호 : "+ bonusNumber);
		
		// 사용자가 선택;
		count =0;
		Scanner scan = new Scanner(System.in);
		//사용자 번호 저장 배열
		int[] userLotto = new int[6];
		
		while(count<6) {
			System.out.println((count+1) + "번째 로또 번호 : ");
			int balls = scan.nextInt();
			
			//중복체트
			for(int i=0; i<count; i++) {
				if(userLotto[i] == balls) {
					System.out.println(balls + "는 이미 존재하는 번호");
					balls =0;//중복된의미
					break;
				}
			}
			if(balls != 0) {
				userLotto[count++] = balls;
				
			}
			
		}
		scan.close();
		System.out.println("사용자 번호 : ");
		for(int i=0; i<lottoBalls.length; i++) {
			System.out.print(userLotto[i] + " ");
		}
		System.out.println();
		int matchCount=0;
		boolean isBonus = false;
		//비교
		for(int i=0; i<userLotto.length; i++) {
			for(int j=0; j<lottoBalls.length; j++) {
				if(userLotto[i] == lottoBalls[j]) {
					matchCount++;
					break;
				}
			}
			//보너스 번호 찾기
			if(!isBonus) {
				if(userLotto[i] == bonusNumber) {
					isBonus = true; 
				}
			}
		}
		// 등수출력
		if(matchCount ==6) {
			System.out.println("1등");
		}else if(matchCount ==5 && isBonus) {
			System.out.println("2등");
		}else if(matchCount ==5 ) {
			System.out.println("3등");
		}else if(matchCount ==4 ) {
			System.out.println("4등");
		}else if(matchCount ==3 ) {
			System.out.println("5등");
		}else {
			System.out.println("낙첨");
		}

	
	
	

	}
}
