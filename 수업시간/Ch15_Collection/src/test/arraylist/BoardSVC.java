package test.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardSVC {
	//
	ArrayList<BoardVO> boardList = new ArrayList<>();
	
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
		
		addArticle(new BoardVO(register, email, passwd, subject, content));
	}
	
	//boardList 객체에 BoardVO 객체 하나를 요소로 추가. 즉, 게시판 글 하나를 등록
	private void addArticle(BoardVO boardVO) {
		//
		boardList.add(boardVO);
	}
	//ArrayList 객체에 저장되어 있는 게시판 글 목록을 출력해 주는 메소드
	public void listArticles(Scanner sc) {
		//
		for(int i=0; i<boardList.size(); i++) {
			System.out.print(boardList.get(i).toString());
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
		for(int i=0; i<boardList.size(); i++) {
			BoardVO b = boardList.get(i);
			if(b.log(register, passwd)) {
				boardList.remove(i);
				break;
			}
		}
	}
}
