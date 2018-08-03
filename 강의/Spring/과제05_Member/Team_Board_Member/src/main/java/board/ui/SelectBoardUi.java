package board.ui;

import java.util.List;

import org.apache.commons.lang.NumberUtils;

import board.dao.BoardListDao;
import board.member.Board;
import ui.AbstractUi;

public class SelectBoardUi extends AbstractUi{

	private BoardListDao boardListDao;
	
	public void setBoardListDao(BoardListDao boardListDao) {
		this.boardListDao = boardListDao;
	}
	
	@Override
	public void show() {
		showBoardList(this.boardListDao.getBoardList());
		System.out.println("Enter를 눌러 주세요.");
		getInputedString();
		NumberUtils.createInteger("123");
	}

	private void showBoardList(List<Board> boardList) {
		System.out.println("---------------------");
		System.out.println(":: 게시판 리스트 ::");
		System.out.println("[ID]      [이름]");
		
		// 팀 목록 보여주기
		for(Board board: boardList) {
			System.out.println("    " + board.getNo() + "   " + board.getTitle());
		}
		
	}
	
}
