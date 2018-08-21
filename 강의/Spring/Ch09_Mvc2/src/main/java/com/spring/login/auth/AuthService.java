package com.spring.login.auth;

import com.spring.exception.IdPasswordNotMatchingException;
import com.spring.register.command.Member;
import com.spring.register.dao.MemberDao;

public class AuthService {
	private MemberDao memberDao;

	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	public AuthInfo authenticate(String email, String password) {
		Member member = memberDao.selectByEmail(email);
		if(member == null) {
			throw new IdPasswordNotMatchingException();
		}
		if(!member.matchPassword(password)) {
			throw new IdPasswordNotMatchingException();
		}
		AuthInfo auth = new AuthInfo(member.getId(), member.getEmail(), member.getName()); 
		return auth;
	}
	
	
}
