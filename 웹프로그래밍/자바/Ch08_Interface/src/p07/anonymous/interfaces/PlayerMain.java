package p07.anonymous.interfaces;

public class PlayerMain {
	public static void main(String[] args) {
		//익명 구현 객체
		//[결과]: "플레이어 시작: " LetItBe.mp3
		//		 "플레이어 종료"
		
		PlayerImpl p = new PlayerImpl();
		p.play("LetItBe.mp3");
		p.stop();
		System.out.println();
		
		Player ap = new Player() {
			
			@Override
			public void play(String source) {
				System.out.println("aaaa.mp3 " + source);
			}

			@Override
			public void stop() {
				System.out.println("Play End");
			}
		};
		
		ap.play("LetItBe.mp3");
		ap.stop();
	}
}
