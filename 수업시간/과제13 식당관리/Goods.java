package test;

public class Goods {
	String[] name; // 등록 배열
	int[] price;
	int[] cnt; // 주문 시
	int[] totalPrice;

	//
	public void insertInfo() { // 자동 상품 등록
		name = new String[] { "우동", "라면", "돈가스", "김밥", "통감자" };
		price = new int[] { 4000, 3000, 5000, 2500, 2000 };
		cnt = new int[] { 0, 0, 0, 0, 0 };
		totalPrice = new int[] { 0, 0, 0, 0, 0 };
	}

	// 상품 입력 방법
	public void goodsList() { // 상품 등록 출력
		for (int i = 0; i < 5; i++) {
			System.out.println((i + 1) + "." + name[i] + "[" + price[i] + "원]");
		}
	}
}
