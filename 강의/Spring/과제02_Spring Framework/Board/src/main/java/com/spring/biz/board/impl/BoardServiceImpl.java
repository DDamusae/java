package com.spring.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.biz.board.BoardService;
import com.spring.biz.board.BoardVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardDAO dao;
	
	public void setBoardDAO(BoardDAO dao) {
		this.dao = dao;
	}
	
	@Override
	public void insertBoard(BoardVO vo) {
		System.out.println("JDBC로 insertBoard() 기능 처리");
		dao.intsertBoard(vo);
	}

	@Override
	public void updateBoard(BoardVO vo) {
		System.out.println("JDBC로 updateBoard() 기능 처리");
		dao.updateBoard(vo);
	}

	@Override
	public void deleteBoard(BoardVO vo) {
		System.out.println("JDBC로 deleteBoard() 기능 처리");
		dao.deleteBoard(vo);
	}

	@Override
	public BoardVO getBoard(BoardVO vo) {
		System.out.println("JDBC로 getBoard() 기능 처리");
		return dao.getBoard(vo);
	}

	@Override
	public List<BoardVO> getBoardList(BoardVO vo) {
		System.out.println("JDBC로 getBoardList() 기능 처리");
		return dao.getBoardList(vo);
	}

}
