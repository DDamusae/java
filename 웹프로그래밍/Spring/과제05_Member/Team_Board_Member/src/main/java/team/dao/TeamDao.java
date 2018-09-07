package team.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import team.model.Team;

public interface TeamDao {
	List<Team> getTeamList() throws DataAccessException;
}
