package p05.multi.inherit;

public class SizeMain {
	public static void main(String[] args) {
		Label obj = new Label("안녕하세요", 100, 30, "yellow", "green", "굴림체");
		
		SizeMain.printLable(obj);
		obj.resize(200, 70);
		obj.setBackground("white");
		obj.setFont("궁서체");
		SizeMain.printLable(obj);
	}
	
	static void printLable(Label obj) {
		System.out.printf("%s: %d x %d 배경색(%s) 전경색(%s) 폰트(%s) \n", obj.str, obj.x, obj.y, obj.bg, obj.fg, obj.font);
	}
}
