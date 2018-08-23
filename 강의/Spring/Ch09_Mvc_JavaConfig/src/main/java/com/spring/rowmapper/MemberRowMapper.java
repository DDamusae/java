package com.spring.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.register.command.Member;

public class MemberRowMapper implements RowMapper<Member> {

	@Override
	public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
		Member member = new Member(rs.getString("email"),rs.getString("password"),rs.getString("name"),rs.getTimestamp("regdate"));
		member.setId(rs.getLong("id"));
		return member;
	}
}
