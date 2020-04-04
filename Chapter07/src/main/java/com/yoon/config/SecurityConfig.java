package com.yoon.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	@Override
	protected void configure(HttpSecurity security) throws Exception {
		// authorizeRequests() : 사용자 인증과 권한을 설정
		// antMatchers("URL 패턴") : 매칭되는 url 패턴들에 대한 접근 허용(permitAll은 모든 사용자, hasRole은 특정 권한 사용자)
		security.authorizeRequests().antMatchers("/").permitAll();
		security.authorizeRequests().antMatchers("/member/**").authenticated();
		security.authorizeRequests().antMatchers("/manager/**").hasAnyRole("MANAGER");
		security.authorizeRequests().antMatchers("/admin/**").hasRole("ADMIN");
		
		// csrf() : 크로스사이트 위조 요청의 대한 설정. RESTfull을 사용하기 위해서는 disable 처리를 해야함.
		security.csrf().disable();
		
		// formLogin() : 로그인 페이지 설정
		// defaultSuccessUrl() : 로그인이 완료되면 이동할 페이지
		security.formLogin().loginPage("/login").defaultSuccessUrl("/loginSuccess", true);
	}
}
