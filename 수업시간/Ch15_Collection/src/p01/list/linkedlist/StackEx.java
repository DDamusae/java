package p01.list.linkedlist;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackEx {
	public static void main(String[] args) {
		Stack<String> st = new Stack<>();
		Queue<String> q = new LinkedList<>();
		st.push("0");
		st.push("1");
		st.push("2");
		st.push("3");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		q.offer("3");
		
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		System.out.println("-------------");
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}
}
