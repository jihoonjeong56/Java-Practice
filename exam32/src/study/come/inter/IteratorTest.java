package study.come.inter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		Set<Integer> set = new HashSet<>(list);
		
		//list를 iterator 이용해서 출력
		Iterator<Integer> intIter = list.iterator();
		
		while(intIter.hasNext()) {
			System.out.println(intIter.next());
		}
		//set을 이용해itertor출력
		Iterator<Integer> setInter = set.iterator();
		
		while(setInter.hasNext()) {
			System.out.println(setInter.next());
		}
		

	}

}
