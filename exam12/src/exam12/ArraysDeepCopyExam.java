package exam12;

import java.util.Arrays;

public class ArraysDeepCopyExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] cards = {3,7,10,11,12};
		int[] newCards = new int[5];
		
		//깊은 복사
		//copyof는 복사대상 복사길이
		newCards = Arrays.copyOf(cards,  cards.length);
		
		System.out.println("복사후 : "+ Arrays.toString(newCards));
		
		cards[1] = 10;
		newCards[3] = 22;
		System.out.println("cards : "+ Arrays.toString(cards));
		System.out.println("newCards : "+ Arrays.toString(newCards));
		
		

	}

}
