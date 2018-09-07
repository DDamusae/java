package p01.list.arraylist;

import java.util.ArrayList;

public class PersonTest {
	public ArrayList<Person> getAllPerson() {
		ArrayList<Person> list = new ArrayList<>();
		list.add(new Person("홍길동", 20, "서울"));
		list.add(new Person("알파고", 2, "경기"));
		list.add(new Person("베타고", 10, "부산"));
		
		return list;
		
	}
}
