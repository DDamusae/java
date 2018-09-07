package test2;

import test2.Cart.Item;

public class NestedEx02 {
	public static void main(String[] args) {
		Cart c = new Cart();
		
		c.addItem("쵸콜렛", 3, 1000);
		c.addItem("케이크", 1, 25000);
		c.addItem("샴페인", 1, 7000);
		c.addItem("꽃다발", 1, 50000);
		
		System.out.println("상품명		수량		단가		금액");
		System.out.println("======================================================");
		
		for(Item i: c.list) {
			System.out.println(i.name + "		" + i.num + "		" + i.unitPrice + "		" + i.getPrice());
		}
		System.out.println("======================================================");
		System.out.println("총계						" + c.getTotalPrice());
	}
}
