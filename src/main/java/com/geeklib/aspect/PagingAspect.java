package com.geeklib.aspect;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.github.pagehelper.PageHelper;

@Aspect
@Component
public class PagingAspect {

	@Around("execution(java.util.List com.geeklib.controller.*.list*(..))")
	public void pageHandler(ProceedingJoinPoint joinPoint) {
		//System.out.println("offset = " + offset + ";limit = " + limit);
		
		
		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		
		int offset = 0;
		int limit = 0;
		
		try {
			offset = Integer.parseInt(request.getParameter("offset"));
			limit = Integer.parseInt(request.getParameter("limit"));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		PageHelper.offsetPage(offset, limit);
		
		
		Object result = null;
		try {
			result = joinPoint.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(result);
		
		
//		System.out.println("before");
//		System.out.println("joinpoint = " + joinPoint.getTarget().getClass());
//		System.out.println("getKind=" + joinPoint.getKind());
//		System.out.println("getTarget=" + joinPoint.getTarget());
//		System.out.println("getThis=" + joinPoint.getThis());
//		System.out.println("getArgs=" + joinPoint.getArgs());
//		for (Object obj : joinPoint.getArgs()) {
//			System.out.println(obj);
//		}
//		System.out.println("getClass=" + joinPoint.getClass());
//		System.out.println("getSignature=" + joinPoint.getSignature());
//		System.out.println("getSourceLocation=" + joinPoint.getSourceLocation());
//		System.out.println("getStaticPart=" + joinPoint.getStaticPart());
		
	}
}
