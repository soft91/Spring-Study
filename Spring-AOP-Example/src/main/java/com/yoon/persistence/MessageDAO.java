package com.yoon.persistence;

import com.yoon.domain.MessageVO;

// 도메인 객체와 SQL을 처리.

public interface MessageDAO {
	public void create(MessageVO vo) throws Exception;
	
	public MessageVO readMessage(Integer mid) throws Exception;
	
	public void updateState(Integer mid) throws Exception;
}
