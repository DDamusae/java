package board.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import board.member.Board;

public interface BoardListDao {
	List<Board> getBoardList() throws DataAccessException;
}
