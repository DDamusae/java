package test;

public class Stat {
	int totalPrice;
	
	public void calculate(Goods goods) {
		for(int i=0; i<5; i++) {
			System.out.print((i+1) + "." + goods.name[i] + " : ");
			System.out.print("판매 갯수: [" + goods.cnt[i] + "개] : ");
			System.out.println("판매 금액: [" + goods.totalPrice[i] + "원]");
			this.totalPrice += goods.totalPrice[i];
		}
		System.out.println("총 판매 금액: " + this.totalPrice);
	}
}
