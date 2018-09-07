package p02.map.hashtable;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashtableEx2 {
	public static void main(String[] args) {
		//driver, oracle.jdbc.driver.OracleDriver
		//url, jdbc:oracle:thin:@localhost:1521:orcl
		//username, java
		//password, java
		
		Map<String, String> ht = new Hashtable<>();
		ht.put("driver", "oracle.jdbc.driver.OracleDriver");
		ht.put("url", "jdbc:oracle:thin:@localhost:1521:orcl");
		ht.put("username", "java");
		ht.put("password", "java");
		
		
		Iterator<String> it = ht.keySet().iterator();
		while(it.hasNext()) {
			String k = it.next();
			String v = ht.get(k);
			System.out.println(k + " " + v);
			
		}
		System.out.println();
		
		for(String key: ht.keySet()) {
			System.out.println(key + " " + ht.get(key));
		}
	}
}
