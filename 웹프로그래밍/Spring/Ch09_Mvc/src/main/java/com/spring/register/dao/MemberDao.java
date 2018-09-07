package com.spring.register.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.spring.register.command.Member;
import com.spring.rowmapper.MemberRowMapper;

public class MemberDao {
	
	private JdbcTemplate jdbcTemplate;
	
	public MemberDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public Member selectByEmail(String email) {
		String sql="select * from member where email=?";
		List<Member> results = jdbcTemplate.query(sql, new MemberRowMapper(), email);

		return results.isEmpty()? null: results.get(0);
		
	}
	
	public void insert(final Member member) {
		KeyHolder keyHolder = new GeneratedKeyHolder();
		jdbcTemplate.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				String sql = "insert into member(email, password, name,regdate) values(?,?,?,?)";
				PreparedStatement pstmt = con.prepareStatement(sql,new String[] {"id"});
				pstmt.setString(1, member.getEmail());
				pstmt.setString(2, member.getPassword());
				pstmt.setString(3, member.getName());
				pstmt.setTimestamp(4, new Timestamp(member.getRegisterDate().getTime()));
				return pstmt;
			}
		}, keyHolder);
		Number keyvalue = keyHolder.getKey();
		member.setId(keyvalue.longValue());
	}
	
	public void update(Member member) {
		String sql = "update member set name=?, password=? where email=?";
		jdbcTemplate.update(sql, member.getName(), member.getPassword(),member.getEmail());
	}
	
	public List<Member> selectAll() {
		String sql ="select * from member";
	List<Member> results = jdbcTemplate.query(sql, new MemberRowMapper());
		return results;
		
	}
	
	public int count() {
		String sql ="select count(*) from member";
		Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
		return count;
	}
	
}














