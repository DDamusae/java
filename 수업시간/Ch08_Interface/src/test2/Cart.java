package test2;

import java.util.ArrayList;

public class Cart {
	ArrayList<Item> list = new ArrayList<Item>();
	
	void addItem(String name, int num, int unitPrice) {
		list.add(new Item(name, num, unitPrice)); //이너 생성자 호출
	}
	void removeItem(int index) {
		list.remove(index);
	}
	int getItemNum() { //항목수
		return list.size();
	}
	Item getItem(int index) { //상품 항목 가져올 때
		return list.get(index);
	}
	int getTotalPrice() {
		int total = 0;
		for(Item item:list) {
			total += item.getPrice(); //이너 클래스의 메소드 호출
		}
		return total;
	}
	
	void changeItemNumber(int index, int num) {//상품갯수 변경
		Item item = list.get(index);
		item.num = num; //이너 클래스의 필드 사용
	}
	
	class Item{ //Inner Class (상품 항목)
		String name;
		int num;
		int unitPrice;
		public Item(String name, int num, int unitPrice) {
			this.name = name;
			this.num = num;
			this.unitPrice = unitPrice;
		}
		
		int getPrice() {
			return num*unitPrice;
		}
	}

		
}
