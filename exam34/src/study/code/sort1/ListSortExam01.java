package study.code.sort1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListSortExam01 {

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
		int temp =0;
		//버블정렬
		for(int i =(list.size()-1); i>0; i--) {
				for(int j =0; j<i; j++) {
					//오름차순 
					if(list.get(j)> list.get(j+1)) {
					//내림차순
					//if(list.get(j)< list.get(j+1)) {
						temp = list.get(j+1);
						list.set(j+1, list.get(j));
						list.set(j, temp);
					}
				}
		}
		System.out.println("정렬후: "+list);


	}

}
