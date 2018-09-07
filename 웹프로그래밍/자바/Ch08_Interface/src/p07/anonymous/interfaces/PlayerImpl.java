package p07.anonymous.interfaces;

public class PlayerImpl implements Player{

	@Override
	public void play(String source) {
		System.out.println("플레이어 시작: " + source);
	}

	@Override
	public void stop() {
		System.out.println("플레이어 종료");
	}
	
}
