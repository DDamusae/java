package member.ui;

import java.util.List;

import org.apache.commons.lang.NumberUtils;

import member.dao.MemberListDao;
import member.member.Member;
import ui.AbstractUi;

public class SelectMemberUi extends AbstractUi{

	private MemberListDao memberListDao;
	
	public void setMemberListDao(MemberListDao memberListDao) {
		this.memberListDao = memberListDao;
	}
	
	@Override
	public void show() {
		showMemberList(this.memberListDao.getMemberList());
		System.out.println("Enter를 눌러주세요.");
		getInputedString();
		NumberUtils.createInteger("123");
	}

	private void showMemberList(List<Member> memberList) {
		System.out.println("---------------------");
		System.out.println(" :: 회원 리스트 ::");
		System.out.println("[ID]    [NAME]");
		
		for(Member member : memberList) {
			System.out.println(member.getId() + "  " +member.getName());
		}
	}

}
