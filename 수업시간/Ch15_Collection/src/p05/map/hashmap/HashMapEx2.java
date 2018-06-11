package p05.map.hashmap;

import java.util.HashMap;

public class HashMapEx2 {
	public enum Season{ WINTER, SPRING, SUMMER, FALL	}
	
	
	public static void main(String[] args) {
		HashMap<Season, String> map = new HashMap<>();
		map.put(Season.WINTER, "겨울");
		map.put(Season.SPRING, "봄");
		map.put(Season.SUMMER, "여름");
		map.put(Season.FALL, "가을");
		
		
		for(Season key: Season.values()) {
			System.out.println(key + " " + map.get(key));
		}
	}
}
