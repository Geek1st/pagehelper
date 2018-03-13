package com.geeklib.aspect;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.geeklib.common.ResponseData;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mysql.jdbc.exceptions.jdbc4.MySQLSyntaxErrorException;

@Aspect
@Component
public class PagingAspect {

	@Around("@annotation(com.geeklib.annotation.EnablePage) && execution(* com.geeklib.service..*.*(..))")
	public Object pageHandler(ProceedingJoinPoint joinPoint) {

		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
				.getRequest();

		int offset = 0;
		int limit = 0;
		String sort = null;
		try {
			offset = Integer.parseInt(request.getParameter("offset"));
			limit = Integer.parseInt(request.getParameter("limit"));
			sort = request.getParameter("sort");

		} catch (ClassCastException e) {

			e.printStackTrace();
		}

		@SuppressWarnings("rawtypes")
		Page page = PageHelper.offsetPage(offset, limit);

		System.out.println(joinPoint.getKind());

		Type[] types = joinPoint.getTarget().getClass().getGenericInterfaces();

		for (TypeVariable type : joinPoint.getTarget().getClass().getTypeParameters()) {
			System.out.println(type.getClass());
		}
		;
		for (Type type : types) {
			Type[] types2 = ((ParameterizedType) type).getActualTypeArguments();
			for (Type type2 : types2) {
				System.out.println("type = " + type2.getTypeName());
			}
		}

		System.out.println(joinPoint.getArgs());
		System.out.println(joinPoint.getClass());
		System.out.println(joinPoint.getSignature());
		System.out.println(joinPoint.getStaticPart());
		System.out.println(joinPoint.getThis());

		if (StringUtils.isNotEmpty(sort)) {

			page.setOrderBy(sort);
		}
		try {
			joinPoint.proceed(joinPoint.getArgs());

		} catch (MySQLSyntaxErrorException e) {
			System.out.println(e);
		} catch (Throwable e) {
			e.printStackTrace();
		}

		ResponseData<?> responseData = new ResponseData();
		responseData.setPageInfo(new PageInfo(page));
		;
		responseData.setStatusCode(200);
		responseData.setStatusContent(1213);

		return responseData;
	}
}
