package com.mlycan.common.web;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


/**
 * 
 * 包括登录信息、权限信息、站点信息
 */
public class ContextInterceptor extends HandlerInterceptorAdapter {
	private static final Logger log = Logger
			.getLogger(ContextInterceptor.class);
	public static final String PERMISSION_MODEL = "_permission_key";
	
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler, ModelAndView mav)
			throws Exception {
		
	}

}