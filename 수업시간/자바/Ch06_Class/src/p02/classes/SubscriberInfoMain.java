package p02.classes;

public class SubscriberInfoMain {
	public static void main(String[] args) {
		SubscriberInfo s1, s2;
		s1 = new SubscriberInfo("aaa", "pushman", "pw12");
		s2 = new SubscriberInfo("bbb", "richman", "money", "010-1234-1234", "타워");
		
		printSubscriberInfo(s1);
		printSubscriberInfo(s2);
	}
	
	static void printSubscriberInfo(SubscriberInfo s) {
		//SubscriberInfo 안에 있는 변수 출력
		System.out.println(s.name);
		System.out.println(s.id);
		System.out.println(s.password);
		System.out.println(s.phoneNo);
		System.out.println(s.address);
		System.out.println();
	}
}
