package test2;

import java.util.Scanner;

public class WeaMain {
	public static void main(String[] args) {
		Weacon con = new Weacon();
		con.input();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. 날씨 검색, 2. 종료");
			int n = sc.nextInt();
			if(n == 1) {
				System.out.println("도시명을 입력: ");
				String city = sc.next();
				con.search(city);
			}else {
				break;
			}
		}
		sc.close();
	}
}
