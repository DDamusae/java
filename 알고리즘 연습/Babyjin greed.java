import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		boolean run = false; //3장 연속
		boolean triplete = false; //3장 동일
		int size = 6;
		
		for(int x=0; x<size; x++) {
			list.add((int)(Math.random()*9));
		}
	
		list.sort(null);
		//같은 카드 3장이 있는지 확인
		for(int i=0; i<list.size()-2; i++) {
			if(list.get(i) == list.get(i+1) && list.get(i) == list.get(i+2)) {
				list.remove(i);
				list.remove(i);
				list.remove(i);
				triplete = true;
				break;
			}
		}
		System.out.println(list);
		//카드 3장이 연속인지
		for(int i=0; i<list.size()-2; i++) {
			if(list.get(i)+1 == list.get(i+1) && list.get(i+1)+1 == list.get(i+2)) {
				run = true;
			}
		}
		if(triplete && run) {
			System.out.println("baby-gin");
		}
	}
}
