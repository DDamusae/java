package member.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import board.member.Board;
import member.dao.MemberListDao;
import member.member.Member;

public class MemberListDaoImpl extends JdbcDaoSupport implements MemberListDao {

	@Override
	public List<Member> getMemberList() throws DataAccessException {
		RowMapper<Member> rowMapper = new MemberRowMapper();

		String sql = "select * from member";
		
		return getJdbcTemplate().query(sql, rowMapper);
	}

protected class MemberRowMapper implements RowMapper<Member>{
		
		private List<Member> memberList = new ArrayList<Member>();
		
		public List<Member> getResults(){
			return memberList;
		}
		
		//rowMapper로부터 한줄씩 받아와서 리스트를 채워준다. (for문이 숨어있음)
		//ResultSet에서 취득한 값을 객체에 넣기
		@Override
		public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
			Member member = new Member();
			member.setId(rs.getString("member_id"));
			member.setName(rs.getString("name"));
			return member;
		}
		
	}
}
