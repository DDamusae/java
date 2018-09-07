package p05.map.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx1 {
	public static void main(String[] args) {
		HashMap<String, String> h = new HashMap<>();
		h.put("abcd", "1234");
		h.put("hong", "4567");
		h.put("alphago", "1234");

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("아이디, 패스워드 입력");
			System.out.println("ID: ");
			String id = sc.next();
			System.out.println("password: ");
			String pw = sc.next();
			if (!h.containsKey(id)) {
				System.out.println("아이디가 없습니다.");
			}else {
				if (h.get(id).equals(pw)) {
					System.out.println("로그인 성공");
					break;
				}else { 
					System.out.println("패스워드가 일치하지 않습니다.");
				}
			}
		}
		
		sc.close();
	}
}
