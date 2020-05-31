package com.yoon.persistence;

import com.yoon.domain.MessageVO;

// ������ ��ü�� SQL�� ó��.

public interface MessageDAO {
	public void create(MessageVO vo) throws Exception;
	
	public MessageVO readMessage(Integer mid) throws Exception;
	
	public void updateState(Integer mid) throws Exception;
}
