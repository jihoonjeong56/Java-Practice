package exam05;

public class SwitchExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 0;
		
		score = (int)(Math.random()*(100-60+1))+60;
		
		switch(score /10) {
		
		case 10:
			
		case 9:
			System.out.println("점수:" + score +", 학점 : A학점");
			break;
		case 8:
			System.out.println("점수:" + score +", 학점 : B학점");
			break;
		case 7:
			System.out.println("점수:" + score +", 학점 : C학점");
			break;
		default :
			System.out.println("점수: "+ score +", 학점 : F학점");
		}

	}

}
