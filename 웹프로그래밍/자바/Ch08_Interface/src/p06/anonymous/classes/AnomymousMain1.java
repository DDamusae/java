package p06.anonymous.classes;

public class AnomymousMain1 {
	public static void main(String[] args) {
		EmailSender em = new EmailSender("홍길동", "ALPHAGO");
		em.sendMessage("Hello");

		//1. Local Inner Class: 메소드 안에 있는 클래스
		class SatelliteSender extends MessageSender {

			@Override
			void sendMessage(String message) {
				System.out.println("발신: " + "abc");
				System.out.println("수신: " + "알파고");
				System.out.println("메세지: " + message);
			}
		}

		SatelliteSender s = new SatelliteSender();
		s.sendMessage("굿모닝");
		System.out.println();
		
		//2. 익명(Anonymous) Class: 메소드 안에 있는 클래스
		MessageSender b = new MessageSender() {
//		class BikeSender extends MessageSender {
			@Override
			void sendMessage(String message) {
				System.out.println("발신: " + "Abstract Class :: Anonymous");
				System.out.println("수신: " + "베타고");
				System.out.println("메세지: " + message);
			}
		};
		
//		BikeSender b = new BikeSender();
		b.sendMessage("AI");
		
	}
}
