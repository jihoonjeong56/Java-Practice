package study.code.set;

import java.util.HashSet;
import java.util.Set;

public class SetExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//set선언
		Set<Integer> set = new HashSet<>();
		//추가
		set.add(1);
		set.add(1);
		set.add(1);
		set.add(1);
		set.add(1);
		
		set.add(2);
		set.add(2);
		
		set.add(3);
		set.add(4);
		set.add(4);
		System.out.println(set);
		
		set.remove(3);
		System.out.println(set);
		
		System.out.println("set의 크기 : " +set.size());
		System.out.println("set 안에 3데이터 존대 : " +set.contains(3));
		System.out.println("set 안에 1데이터 존대 : " +set.contains(1));

		//clear는 객체 형태는 남겨두고 데이터만 삭제
		//set.clear();
		//System.out.println(set);
	}

}
