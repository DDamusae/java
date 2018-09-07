package p02.map.hashtable;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashtableEx1 {
	public static void main(String[] args) {
		Map<String, String> ht = new Hashtable<>();
		ht.put("포도", "grape");
		ht.put("사과", "Apple");
		ht.put("딸기", "Strawberry");
		ht.put("오렌지", "Orange");
		
		System.out.println("hashtable의 키의 수: " + ht.size());
		System.out.println("사과의 값: " + ht.get("사과"));
		System.out.println();
		
		//1.Iterator
		Set<String> keyset = ht.keySet();
		Iterator<String> it = keyset.iterator();
		while(it.hasNext()) {
			String k = it.next();
			String v = ht.get(k);
			System.out.println(k + " " + v);
		}
		System.out.println();
		//2.Enumeration
		Enumeration<String> e = ((Hashtable<String, String>) ht).keys();
		while(e.hasMoreElements()) {
			String k = e.nextElement();
			String v = ht.get(k);
			System.out.println(k + " " + v);
		}
		System.out.println();
		
		for(String key: ht.keySet()) {
			System.out.println(key + " " + ht.get(key));
		}
	}
}
