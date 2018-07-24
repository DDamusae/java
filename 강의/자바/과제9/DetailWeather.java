package test2;

public class DetailWeather extends Weather {
	String dust, direction;

	public void info(int num) { //상세 정보 출력
		super.info();
		System.out.println("미세먼지 농도: " + dust + "%");
		System.out.println("풍향: " + direction);
	}
}
