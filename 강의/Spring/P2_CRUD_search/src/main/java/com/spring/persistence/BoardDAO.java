package com.spring.persistence;
import java.util.List;

import com.spring.domain.BoardVO;
import com.spring.domain.Criteria;
import com.spring.domain.SearchCriteria;
public interface BoardDAO {
	public void create(BoardVO vo) throws Exception;//insert
	public BoardVO read(Integer bno)throws Exception;//select
	public void update(BoardVO vo) throws Exception;
	public void delete(Integer bno) throws Exception;
	public List<BoardVO> listAll() throws Exception; //select
	
	//Paging
	public List<BoardVO> listPage(int page) throws Exception;
	public List<BoardVO> listCriteria(Criteria cri) throws Exception;
	
	//totalCount를 반환할수 있게 처리
	public int countPaging(Criteria cri) throws Exception;
	
	//Search
	public List<BoardVO> listSearch(SearchCriteria cri) throws Exception;
	public int listSearchCount(SearchCriteria cri) throws Exception;
	
}
