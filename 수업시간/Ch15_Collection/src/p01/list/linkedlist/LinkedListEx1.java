package p01.list.linkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx1 {
	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		q.offer("강남구");
		q.offer("노원구");
		q.offer("마포구");
		q.offer("종로구");
		
		while(!q.isEmpty()) {
			System.out.println(q.peek()); //헤드에 들어있는 데이터를 꺼낸다
			System.out.println(q.poll()); //헤드에 들어있는 데이터를 꺼낸 후 제거
		}
		System.out.println();
		
		LinkedList<String> linked = new LinkedList<>();
		linked.add("소나타");
		linked.add("에쿠스");

		for(int i=0; i<linked.size(); i++) {
			System.out.println(linked.get(i));
		}
		
	}
	
}
