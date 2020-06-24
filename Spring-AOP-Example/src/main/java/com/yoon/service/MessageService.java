package com.yoon.service;

import com.yoon.domain.MessageVO;

// 실제 작업을 수행하는 서비스

public interface MessageService {
	public void addMessage(MessageVO vo) throws Exception;
	
	public MessageVO readMessage(String uid, Integer mno) throws Exception;
}
