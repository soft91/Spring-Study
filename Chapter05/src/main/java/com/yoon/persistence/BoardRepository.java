package com.yoon.persistence;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.yoon.domain.Board;

public interface BoardRepository extends CrudRepository<Board, Long>{
	// 게시글의 제목 검색
	List<Board> findByTitle(String searchKeyword);
	// 특정 단어가 포함된 목록 검색
	List<Board> findByContentContaining(String searchKeyword); 
	// 제목 또는 내용에 특정 단어가 포함된 글을 조회
	List<Board> findByTitleContainingOrContentContaining(String title, String content);
	// 데이터 내림차순 정렬
	List<Board> findByTitleContainingOrderBySeqDesc(String searchKeyword);
	// 1개부터 다섯개의 데이터만 조회
	Page<Board> findByTitleContaining(String searchKeyword, Pageable paging);
	// 
	@Query("SELECT b FROM Board b WHERE b.title like %?1% ORDER BY b.seq DESC")
	List<Board> queryAnnotationTest1(String searchKeyword);
}
