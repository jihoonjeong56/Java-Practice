package study.come.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();
		
		map.put("one", 1);
		map.put("two", 2);
		map.put("two", 22);
		map.put("three", 3);
		map.put("four", 4);
		map.put("five", 5);
		
		System.out.println("map의 사이즈 : " + map.size());
		System.out.println(map.values());
		map.remove("five");
		System.out.println("map의 사이즈 : " + map.size());
		System.out.println("map has that key name is one : " + map.containsKey("one"));
		System.out.println("map has that key name is one : " +map.containsKey("six"));

		System.out.println("map has value 1: " + map.containsValue(1));
		System.out.println("map has value 2: " +map.containsValue(2));

		//출력형태
		//key를 이용한 출력
		Set<String> keySet = map.keySet();
		for(String key : keySet) {
			System.out.println("key : " +key+ ", value : " +map.get(key));
		}
		System.out.println("===============");
		//Entry 를 이용한 출력
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		for(Map.Entry<String, Integer> en : entrySet) {
			System.out.println("key : " +en.getKey()+ ", value : " +en.getValue());		}
	}

}
