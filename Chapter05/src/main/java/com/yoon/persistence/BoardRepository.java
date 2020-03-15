package com.yoon.persistence;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.yoon.domain.Board;

public interface BoardRepository extends CrudRepository<Board, Long>{
	List<Board> findByTitle(String searchKeyword); // 게시글의 제목 검색
	List<Board> findByContentContaining(String searchKeyword); // 특정 단어가 포함된 목록 검색
}
