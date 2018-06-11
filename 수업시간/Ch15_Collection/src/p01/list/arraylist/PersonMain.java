package p01.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class PersonMain {
	public static void main(String[] args) {
		PersonTest pt = new PersonTest();
		ArrayList<Person> list = pt.getAllPerson();

		// 1.일반 for
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName() + " " + list.get(i).getAge() + " " + list.get(i).getAddress());
		}
		System.out.println();
		// 2.향상된 for
		for (Person li : list) {
			System.out.println(li.getName() + " " + li.getAge() + " " + li.getAddress());
		}
		System.out.println("------------------------------");
		// 3.Iterator while
		Iterator<Person> it = list.iterator();
		while (it.hasNext()) {
			Person p = it.next();
			System.out.println(p. getName() + " " + p.getAge() + " " + p.getAddress());
		}
		System.out.println();
		// 4.Iterator for
		Iterator<Person> it2 = list.iterator();
		for (; it2.hasNext();) {
			Person p = it2.next();
			System.out.println(p.getName() + " " + p.getAge() + " " + p.getAddress());
		}
	}
}
