package team.ui;

import java.util.List;

import org.apache.commons.lang.NumberUtils;

import team.dao.TeamDao;
import team.model.Team;
import ui.AbstractUi;

public class SelectTeamUi extends AbstractUi {
	
	private TeamDao teamDao;
	
	public void setTeamDao(TeamDao teamDao) {
		this.teamDao = teamDao;
	}
	
	@Override
	public void show() {
		//팀 목록 출력처리
		showTeamList(this.teamDao.getTeamList());
		System.out.println("Enter를 눌러주세요");
		getInputedString();
		NumberUtils.createInteger("123");
	}

	private void showTeamList(List<Team> teamList) {
		System.out.println("-------------------");
		System.out.println(":: 팀 목록 ::");
		System.out.println("[ID]      [이름]");
		
		// 팀 목록 보여주기
		for(Team team: teamList) {
			System.out.println("    " + team.getId() + "   " + team.getName());
		}
		
	}

}
