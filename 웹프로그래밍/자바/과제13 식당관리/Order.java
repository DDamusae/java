package test;

import java.util.Scanner;

public class Order {

	//
	Scanner scan = new Scanner(System.in);
	Goods g = PosMain.g;
	public void orderGoods() {
		while (true) {
			System.out.println("=====================================");
			System.out.println("0.관리자 모드");
			g.goodsList();
			System.out.println("=====================================");
			int select = scan.nextInt();
			
			if (select == 0) {
				return;
			} else if (select>=1 && select<=5){
				System.out.println(g.name[select - 1] + "몇 개 주문?");
				int n = scan.nextInt();
				g.cnt[select - 1] += n;
				int price = g.price[select - 1] * n;
				System.out.println(g.name[select - 1] + "/ 수량 " + n + "개 [" + price + "원]");
				g.totalPrice[select - 1] += price;
				while(true) {
					System.out.println("얼마 주실꺼임?");
					int money = scan.nextInt();
					if(money < price) {
						System.out.println("돈이 부족합니다!!!");
						continue;
					}
					System.out.println("거스름 돈: " + (money - price));
					break;
				}
			}

		}
	}
}
