package com.spring.persistence;

import com.spring.domain.MemberVO;

public interface MemberDAO {
	public String getTime();//현재시간 : select now()
	public void insertMember(MemberVO vo);//사용자 등록
//	public MemberVO readMember(String userid) throws Exception;//조회
//	public MemberVO readWithPW(String userid, String pw) throws Exception;//조회
	
}
