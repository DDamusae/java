package test.array;

import java.util.Scanner;

public class ArrayTest4 {
	public static void main(String[] args) {
		String names[] = new String[] {"홍길동","전우치","이도","세종대왕","이민지","이나라","이민수"};
		Scanner scan = new Scanner(System.in);
		int index = -1;
		do {
			System.out.println("검색할 이름을 입력하세요.");
			System.out.print("이름: ");
			String name = scan.next();
			
			for(int i=0; i<names.length; i++) {
				if(name.equals(names[i])) {
					index = i;
				}
			}
			if(index != -1) {
				System.out.println(name + "은 배열의 " + index + " 인덱스 방에서 찾았습니다.");
				break;
			}
			System.out.println("해당 이름이 존재하지 않습니다.");
		}while(true);
		
		scan.close();
	}
}
