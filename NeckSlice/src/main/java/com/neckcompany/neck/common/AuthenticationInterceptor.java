package com.neckcompany.neck.common;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AuthenticationInterceptor extends HandlerInterceptorAdapter {
	
	private static final String LOGIN = "login";
	private static Logger logger = LoggerFactory.getLogger(AuthenticationInterceptor.class);
	
	/**
	 * controller 이전에 호출.
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		
		System.out.println("AuthenticationInterceptor preHandle.....................");
		
		// 현재 수행중인 빈, 메소드 로그 출
		HandlerMethod method = (HandlerMethod) handler;
		Method methodObj = method.getMethod();
		logger.info("Called Bean : " + method.getBean());
		logger.info("Called Method : " + methodObj);
		
		HttpSession session = request.getSession();
		Object login = session.getAttribute(LOGIN);
		
		if (login != null) {
			logger.info("Old session removing...");
			session.removeAttribute(LOGIN);
		}
		
		return true;
	}
	
	/**
	 * controller 이후에 호출.
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception{
		System.out.println("AuthenticationInterceptor postHandle.....................");
		super.postHandle(request, response, handler, modelAndView);
	}
}
