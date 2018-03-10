package com.geeklib.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.github.pagehelper.PageHelper;

public class PagingInterceptor extends HandlerInterceptorAdapter {

	int count;
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		try {
			request.setAttribute("offset", request.getParameter("offset"));
			request.setAttribute("limit", request.getParameter("limit"));
		} catch (Exception e) {
			// TODO: handle exception
		}


		return super.preHandle(request, response, handler);
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		count ++;
		System.out.println(count);
		super.postHandle(request, response, handler, modelAndView);
	}
}
