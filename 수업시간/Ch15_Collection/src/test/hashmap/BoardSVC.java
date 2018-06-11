package test.hashmap;

import java.util.HashMap;
import java.util.Scanner;

import test.arraylist.BoardVO;

public class BoardSVC {
	//
	HashMap<String, BoardVO> boardMap = new HashMap<>();
	
	//Scanner입력
	public void writeArticle(Scanner sc) {
		//
		System.out.print("작성자: ");
		String register = sc.next();
		System.out.print("이메일: ");
		String email = sc.next();
		System.out.print("비밀번호: ");
		String passwd = sc.next();
		System.out.print("제목: ");
		String subject = sc.next();
		System.out.print("글 내용: ");
		String content = sc.next();
		
		BoardVO b = new BoardVO(register, email, passwd, subject, content);
		addArticle(register, b);
	}
	
	//게시판 글 하나를 등록
	private void addArticle(String register, BoardVO board) {
		//
		this.boardMap.put(register, board);
	}
	// 글 목록을 출력해 주는 메소드
	public void listArticles(Scanner sc) {
		//
		for(String key:boardMap.keySet()) {
			System.out.println(boardMap.get(key).toString());
		}
		System.out.println();
	}
	
	public void removeArticle(Scanner sc) {
		//
		System.out.println("[제거할 글의 작성자와 비밀번호를 입력하세요]");
		System.out.print("작성자: ");
		String register = sc.next();
		System.out.print("비밀번호: ");
		String passwd = sc.next();
		
		removeArticle(register, passwd);
	}
	
	private void removeArticle(String register, String passwd) {
		//
		if(boardMap.get(register).log(register, passwd)) {
			boardMap.remove(register);
		}
	}
}
