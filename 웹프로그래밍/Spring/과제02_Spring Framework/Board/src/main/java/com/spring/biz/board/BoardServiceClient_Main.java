package com.spring.biz.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardServiceClient_Main {
	public static void main(String[] args) {
		AbstractApplicationContext context = new GenericXmlApplicationContext("board.xml");
		BoardService boardService = (BoardService) context.getBean("boardService");

		BoardVO vo = new BoardVO();
		vo.setTitle("임시 제목");
		vo.setWriter("홍길동");
		vo.setContent("임시 내용............");
		boardService.insertBoard(vo);

		// 글 목록 검색 기능 테스트
		List<BoardVO> list = boardService.getBoardList(vo);
		for (BoardVO b : list)
			System.out.println("----->" + b.toString());

		context.close();
	}
}
