package study.code.sort1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class ListSortExam2 {

	public static void main(String[] args) {
		// 
		
		List<Integer> list = new ArrayList<>();
		//랜덤 클래서 선언
		Random rand = new Random();
		
		for(int i =0; i<10; i++) {
			//nextInt(값); 0<= x < 값 +1--> 1<= x<=값
			list.add(rand.nextInt(30)+1);
		}
		System.out.println("정렬전: "+list);
		//collection을 이용한 정렬 기능
		Collections.sort(list);
		System.out.println("오름 차순 정렬후: "+list);
		//내림차순 정렬
		Collections.sort(list, Comparator.reverseOrder());
		System.out.println("내림 차순 정렬후: "+list);


	}

}
