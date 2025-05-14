package study.code.sort2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ObjCompareExam02 {

	public static void main(String[] args) {

		Student2 st01 = new Student2("김철수", 260);
		Student2 st02 = new Student2("김영희", 290);
		Student2 st03 = new Student2("김대리", 288);
		
		List<Student2> list = new ArrayList<>();
		list.add(st01);
		list.add(st02);
		list.add(st03);
		
		System.out.println("정렬전 : "+list);
		for(Student2 st : list) {
			System.out.println(st);
		}
		//내림차순 정렬
		Collections.sort(list, new StdDescCompare());
		System.out.println("정렬후 : "+list);
		for(Student2 st : list) {
			System.out.println(st);
		}
		//오름차순 정렬
		Collections.sort(list, new StdAscCompare());
		System.out.println("정렬후 : "+list);
		for(Student2 st : list) {
			System.out.println(st);
		}
	}

}
