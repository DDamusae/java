package board.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import board.dao.BoardListDao;
import board.member.Board;

public class BoardListDaoImpl extends JdbcDaoSupport implements BoardListDao {

	@Override
	public List<Board> getBoardList() throws DataAccessException {
		
		RowMapper<Board> rowMapper = new BoardRowMapper();
		
		String sql = "select no, title from board";
		
		return getJdbcTemplate().query(sql, rowMapper);
	}

	
protected class BoardRowMapper implements RowMapper<Board>{
		
		private List<Board> BoardList = new ArrayList<Board>();
		
		public List<Board> getResults(){
			return BoardList;
		}
		
		//rowMapper로부터 한줄씩 받아와서 리스트를 채워준다. (for문이 숨어있음)
		//ResultSet에서 취득한 값을 객체에 넣기
		@Override
		public Board mapRow(ResultSet rs, int rowNum) throws SQLException {
			Board Board = new Board();
			Board.setNo(rs.getInt("no"));
			Board.setTitle(rs.getString("title"));
			return Board;
		}
		
	}
}
