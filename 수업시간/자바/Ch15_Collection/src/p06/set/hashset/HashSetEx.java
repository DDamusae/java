package p06.set.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("java");
		set.add("spring");
		set.add("java");
		set.add("JSP");
		
		System.out.println("데이터 갯수: " + set.size());
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
