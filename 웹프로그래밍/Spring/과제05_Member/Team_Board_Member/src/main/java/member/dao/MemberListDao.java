package member.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import member.member.Member;

public interface MemberListDao {
	List<Member> getMemberList() throws DataAccessException;
}
