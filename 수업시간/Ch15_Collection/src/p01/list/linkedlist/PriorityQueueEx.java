package p01.list.linkedlist;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<>();
		q.offer(3);
		q.offer(1);
		q.offer(2);
		q.offer(4);
		q.offer(5);
		
		System.out.println(q);
		
		Object obj = null;
		while((obj = q.poll()) != null) {
			System.out.println(obj);
		}
	}
}
