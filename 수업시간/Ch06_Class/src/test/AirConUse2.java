package test;

public class AirConUse2 {
	public static void main(String[] args) {
		//
		AirCon airCon1 = new AirCon();

		// 변수 사용
		airCon1.color = "White";
		airCon1.temp = 10;
		airCon1.price = 10000;

		// 메소드 사용
		airCon1.tempUp();
		System.out.println("airCon1.temp = " + airCon1.temp + ", airCon1.color = " + airCon1.color
				+ ", airCon1.price = " + airCon1.price + "원 ");
		airCon1.powerOn();
		airCon1.powerOff();
		airCon1.tempDown();
		System.out.println("airCon1.temp = " + airCon1.temp + ", airCon1.color = " + airCon1.color
				+ ", airCon1.price = " + airCon1.price + "원 ");

		// 두번째 객체 생성
		AirCon airCon2 = new AirCon();
		System.out.println("airCon2.temp = " + airCon2.temp + ", airCon2.color = " + airCon2.color
				+ ", airCon2.price = " + airCon2.price + "원 ");

		// airCon2 변수에 airCon1 변수 참조 값 할당
		airCon2 = airCon1;
		System.out.println("airCon2.temp = " + airCon2.temp + ", airCon2.color = " + airCon2.color
				+ ", airCon2.price = " + airCon2.price + "원 ");

	}
}
