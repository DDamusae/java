package com.spring.changepw.service;

import com.spring.exception.MemberNotFoundException;
import com.spring.register.command.Member;
import com.spring.register.dao.MemberDao;

public class ChangePasswordService {
	private MemberDao memberDao;

	public ChangePasswordService(MemberDao memberDao) {
		super();
		this.memberDao = memberDao;
	}
	
	public void changePassword(String email, String oldPwd, String newPwd) {
	Member m =	memberDao.selectByEmail(email);
	if(m == null) {
		throw new MemberNotFoundException();
	}
	m.changePassword(oldPwd, newPwd);
	memberDao.update(m);
	}
}
