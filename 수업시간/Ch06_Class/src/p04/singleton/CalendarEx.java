package p04.singleton;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarEx {
	public static void main(String[] args) {
		//Calendar Class :: 추상 클래스이므로 객체 생성 불가
		//Calendar c = new Calendar();
		Calendar c = Calendar.getInstance(); //Singleton 형식
		System.out.println("올 해 년도: " + c.get(Calendar.YEAR));
		System.out.println("현재 월: " + (c.get(Calendar.MONTH)+1));
		
		
		GregorianCalendar g = new GregorianCalendar();
		int year = g.get(Calendar.YEAR);
		int month = g.get(Calendar.MONTH)+1;
		int date = g.get(Calendar.DATE);
		System.out.printf("%d년 %d월 %d일", year, month, date);
	}
}
