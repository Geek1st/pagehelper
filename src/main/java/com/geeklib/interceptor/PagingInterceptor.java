package com.geeklib.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

public class PagingInterceptor extends HandlerInterceptorAdapter {

	int count;
//	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
//			throws Exception {
//		
//		int offset = 0;
//		int limit = 0;
//		try {
//			offset = Integer.parseInt(request.getParameter("offset"));
//			limit = Integer.parseInt(request.getParameter("limit"));
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//
//		Page page = PageHelper.offsetPage(offset, limit);
//		request.setAttribute("page", page);
//		return super.preHandle(request, response, handler);
//	}

//	@Override
//	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
//			ModelAndView modelAndView) throws Exception {
//		Page page = (Page)request.getAttribute("page");
//		System.out.println("interceptor = " + page);
//		super.postHandle(request, response, handler, modelAndView);
//		System.out.println("interceptor = " + page);
//	}
//	
//	@Override
//	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//		Page page = (Page)request.getAttribute("page");
//		System.out.println("interceptor2 = " + page);
//		super.afterCompletion(request, response, handler, ex);
//		System.out.println("interceptor2 = " + page);
//	}
}
