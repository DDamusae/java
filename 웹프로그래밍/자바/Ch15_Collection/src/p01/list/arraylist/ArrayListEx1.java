package p01.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<>();
		list.add("홍길동");
		list.add(new Integer(123));
		list.add(123);
		list.add(new Float(3.14f));
		
		list.add("홍길동");
		list.add(new Integer(123));
		list.add(123);
		list.add(new Float(3.14f));
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		List<Object> list2 = new ArrayList<>(); //다형성
		list2.add("홍길동");
		list2.add(new Integer(123));
		list2.add(123);
		list2.add(new Float(3.14f));
		
		list2.add("홍길동");
		list2.add(new Integer(123));
		list2.add(123);
		list2.add(new Float(3.14f));
		
		for(int i=0; i<list2.size(); i++) {
			System.out.println(list2.get(i));
		}
	}
}
