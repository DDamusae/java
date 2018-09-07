package team.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import team.dao.TeamDao;
import team.model.Team;

//Spring JDBC를 사용해서 DB에 직접 접근
//JdbcDaoSupport 클래스를 상속하고 TeamDao 인터페이스를 구현
public class TeamDaoImpl extends JdbcDaoSupport implements TeamDao {

	@Override
	public List<Team> getTeamList() throws DataAccessException {
		//callback Interface 생성
		//RowMapper: 검색 결과(ResultSet)를 자바 객체(Team)로 Mapping할 때 사용
		//테이블당 하나씩 필요
		RowMapper<Team> rowMapper = new TeamRowMapper();
		
		//SQL실행
		String sql = "select team_id, name from team";
		//jdbcDaoSupport는 getJdbcTemplate() 구현(간소화)
		return getJdbcTemplate().query(sql, rowMapper);
	}
	
	protected class TeamRowMapper implements RowMapper<Team>{
		
		private List<Team> teamList = new ArrayList<Team>();
		
		public List<Team> getResults(){
			return teamList;
		}
		
		//rowMapper로부터 한줄씩 받아와서 리스트를 채워준다. (for문이 숨어있음)
		//ResultSet에서 취득한 값을 객체에 넣기
		@Override
		public Team mapRow(ResultSet rs, int rowNum) throws SQLException {
			Team team = new Team();
			team.setId(rs.getInt("team_id"));
			team.setName(rs.getString("name"));
			return team;
		}
		
	}
}
