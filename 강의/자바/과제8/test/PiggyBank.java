package test;

public class PiggyBank { //돼지 저금통 클래스
	int total;
	Slot slot;
	PiggyBank(){
		total = 0;
		slot = new Slot();
	}
	
	class Slot{ //입구 클래스
		void put(int amount) {
			total += amount ; //Outer Class를 직접 사용
		}
	}
}
