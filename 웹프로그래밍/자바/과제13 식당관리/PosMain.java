package test;

import java.util.Scanner;

public class PosMain {
	static Goods g = new Goods();
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Login login = new Login();
		Order order = new Order();
		Stat stat = new Stat();

		boolean loop = true;
		boolean loginChk = false;

		while (loop) {
			if (loginChk == false) {
				System.out.println("관리자 아이디 입력");
				login.inputId = scan.next();
				System.out.println("관리자 비밀번호 입력");
				login.inputPw = scan.next();
				loginChk = login.loginCheck();
			} else {
				System.out.println("=====================================");
				System.out.println("1.상품 등록 / 2. 판매 게시 / 3. 정산 / 4. 종료");
				int select = scan.nextInt();
				
				switch (select) {
				case 1:
					g.insertInfo();
					g.goodsList();
					break;
				case 2:
					order.orderGoods();
					break;
				case 3:
					stat.calculate(g);
					break;
				case 4:
					loop = false;
					break;
				}

			}

		}
		
		scan.close();
	}
}
