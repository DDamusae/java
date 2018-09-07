package com.spring.persistence;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;
import javax.xml.stream.events.Namespace;

import org.apache.ibatis.session.SqlSession;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {

	//private JdbcTemplate jdbcTemplate;
	//@Inject: 만들어진 bean 주입
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "com.spring.persistence.MemberDAO";
	
	@Override
	public String getTime() {
		//String sql="select now()";
		return sqlSession.selectOne(namespace+".getTime");
	}

	@Override
	public void insertMember(MemberVO vo) {
		sqlSession.insert(namespace+".insertMember", vo);

	}

//	@Override
//	public MemberVO readMember(String userid) throws Exception {
//		
//		return sqlSession.selectOne(namespace+".selectMember", userid);
//	}
//
//	@Override
//	public MemberVO readWithPW(String userid, String pw) throws Exception {
//		//Parameter 2개 이상 전달되는 경우 Map타입 사용
//		Map<String, Object> paramMap = new HashMap<>();
//		paramMap.put("userid", userid);
//		paramMap.put("userpw", pw);
//		return sqlSession.selectOne(namespace+".readWithPW", paramMap);
//	}

}









