package p03.ref.instanceofs;

public class DicaPhone extends HandPhone {
	String pixel;

	public DicaPhone() {
		//객체가 생성이 되면서 실행될 내용 작성
	}
	
	public DicaPhone(String pixel) {
		super();
		this.pixel = pixel;
	}

	public DicaPhone(String model, String number, String pixel) {
		super(model, number);
		this.pixel = pixel;
	}
	
	void printDicaPhone() {
		System.out.println(model + " " + number + " " + pixel);
	}
}
