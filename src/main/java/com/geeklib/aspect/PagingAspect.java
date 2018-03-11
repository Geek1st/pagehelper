package com.geeklib.aspect;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Aspect
@Component
public class PagingAspect {

	@Around("execution(* com.geeklib.controller..*.list*(..)) and !@annotation(com.geeklib.annotation.NotPaging)")
	public Object pageHandler(ProceedingJoinPoint joinPoint) {

		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
				.getRequest();

		int offset = 0;
		int limit = 0;

		try {
			offset = Integer.parseInt(request.getParameter("offset"));
			limit = Integer.parseInt(request.getParameter("limit"));
		} catch (ClassCastException e) {
			
			e.printStackTrace();
		}
		
		
		@SuppressWarnings("rawtypes")
		Page page = PageHelper.offsetPage(offset, limit);

		try {
			joinPoint.proceed(joinPoint.getArgs());

		} catch (Throwable e) {
			e.printStackTrace();
		}

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("size", page.getTotal());
		map.put("data", page.getResult());
		return map;
	}

}
