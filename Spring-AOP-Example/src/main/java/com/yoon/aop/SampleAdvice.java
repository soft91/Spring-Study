package com.yoon.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

// @Component : 스프링의 빈으로 인식되기 위해 설정.
// @Aspect    : AOP 기능을 하는 클래스의 선언.

@Component
@Aspect
public class SampleAdvice {
	
	private static final Logger logger = LoggerFactory.getLogger(SampleAdvice.class);
	
	@Before("execution(* com.yoon.service.MessageService*.*(..))")
	public void startLog(JoinPoint joinPoint) {
		logger.info("---------------------------");
		logger.info("---------------------------");
		logger.info(Arrays.toString(joinPoint.getArgs()));
	}
}
