package mms.memer.dao;

import java.sql.Connection;

public class MemberDAO {
//연결
	Connection con;
	public MemberDAO(Connection con) {
		this.con = con;
	}
	
//1. 등록
	public int insertMember() {
	//insert into mms_member values((),?,?,?,?,?);	
		
		return 0;
	}
	
}
