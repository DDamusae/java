package com.spring.biz.board.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.biz.board.BoardVO;
import com.spring.biz.common.JDBCUtil;

@Repository("boardDAO")
public class BoardDAO {
	//JDBC 관련 변수
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	//SQL 명령어들
	private final String INSERT = "insert into board(seq, title, writer, content) values(seq.nextval, ?, ?, ?)";
	private final String UPDATE = "update board set title = ?, writer = ?, content= ?";
	private final String DELETE = "delete from board where seq = ?";
	private final String READ = "select * from board where seq = ?";
	private final String LIST = "select * from board order by seq desc";
	
	//CRUD 기능의 메소드 구현
	//글 등록
	public void intsertBoard(BoardVO vo) {
		try {
			con = JDBCUtil.getConnection();
			pstmt = con.prepareStatement(INSERT);
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getWriter());
			pstmt.setString(3, vo.getContent());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(pstmt, con);
		}
	}
	
	
	//글 수정
	public void updateBoard(BoardVO vo) {
		try {
			con = JDBCUtil.getConnection();
			pstmt = con.prepareStatement(UPDATE);
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getWriter());
			pstmt.setString(3, vo.getContent());
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(pstmt, con);
		}
	}
	
	//글 삭제
	public void deleteBoard(BoardVO vo) {
		try {
			con = JDBCUtil.getConnection();
			pstmt = con.prepareStatement(DELETE);
			pstmt.setInt(1, vo.getSeq());
			pstmt.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(pstmt, con);
		}
	}
	
	
	//글 상세 조회
	public BoardVO getBoard(BoardVO vo) {
		BoardVO board = new BoardVO();
		try {
			con = JDBCUtil.getConnection();
			pstmt = con.prepareStatement(READ);
			pstmt.setInt(1, vo.getSeq());
			rs = pstmt.executeQuery();
			if(rs != null) {
				board.setSeq(rs.getInt("seq"));
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
				board.setRegDate(rs.getDate("regDate"));
				board.setCnt(rs.getInt("cnt"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, pstmt, con);
		}
		return board;
	}
	
	
	//글 목록 조회
	public List<BoardVO> getBoardList(BoardVO vo){
		List<BoardVO> list = new ArrayList<BoardVO>();
		
		try {
			con = JDBCUtil.getConnection();
			pstmt = con.prepareStatement(LIST);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				BoardVO board = new BoardVO();
				board.setSeq(rs.getInt("seq"));
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
				board.setRegDate(rs.getDate("regdate"));
				board.setCnt(rs.getInt("cnt"));
				
				list.add(board);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, pstmt, con);
		}
		
		return list;
	}
	
}
