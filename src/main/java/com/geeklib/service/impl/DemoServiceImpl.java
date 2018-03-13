package com.geeklib.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.geeklib.annotation.EnablePage;
import com.geeklib.mapper.DemoMapper;
import com.geeklib.service.DemoService;

@Service
public class DemoServiceImpl<DemoEntity> implements DemoService<DemoEntity> {

	@Resource
	DemoMapper demoMapper;
	
	@EnablePage
	public Object listObject(int offset, int limit) {
		
		
		demoMapper.listObject();
		System.out.println("============");
		return demoMapper.listObject();
	}

}
