package com.yoon.service;

import com.yoon.domain.MessageVO;

// ���� �۾��� �����ϴ� ����

public interface MessageService {
	public void addMessage(MessageVO vo) throws Exception;
	
	public MessageVO readMessage(String uid, Integer mno) throws Exception;
}
