package com.springbook.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;

public class AroundAdvice {
	public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("[Before] �����Ͻ� ���� ���� ���� ó���� ����...");
		Object returnObj = pjp.proceed();
		System.out.println("[After] �����Ͻ� �޼ҵ� ���� �Ŀ� ó���� ����...");
		return returnObj;
	}
}
