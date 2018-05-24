package basic01.arraylist.bean.ex;

import java.util.Scanner;

public class SearchMain {
	public static void main(String[] args) {
		//객체 생성
		SearchService sv = new SearchService();
		//입력
		Scanner sc = new Scanner(System.in);		
		
		do {
			System.out.println("검색할 회원 이름을 입력하세요.");
			String name = sc.nextLine();
			boolean searchResult = sv.searchMember(name);
			if(searchResult) break;
			System.out.println("해당 회원이 없습니다.");
		}while(true);
		sc.close();
	}
}
