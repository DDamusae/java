package test2;

public class Weather {
	String city, wea, tem, rain, hum; //지역 날씨 온도 강수량 습도
	
	public void info() { //간단정보
		System.out.println("지역: " + city);
		System.out.println("날씨: " + wea);
		System.out.println("온도: " + tem);
		System.out.println("강수량: " + rain);
		System.out.println("습도: " + hum);
	}
}
