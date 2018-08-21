package com.spring.register.service;

import java.util.Date;

import org.springframework.transaction.annotation.Transactional;

import com.spring.exception.AlreadExistingMemberException;
import com.spring.register.command.Member;
import com.spring.register.command.RegisterRequest;
import com.spring.register.dao.MemberDao;

public class MemberRegisterService {
	private MemberDao memberDao;

	public MemberRegisterService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	@Transactional
	public void regist(RegisterRequest req) {
		Member m = memberDao.selectByEmail(req.getEmail());
		if(m != null) {
			throw new AlreadExistingMemberException("dub email: "+ req.getEmail());
		}
		Member newMember = 
			new Member(req.getEmail(), req.getPassword(), req.getName(), new Date());
		memberDao.insert(newMember);
	}
}
