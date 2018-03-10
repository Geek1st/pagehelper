package com.geeklib.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.geeklib.entity.DemoEntity;
import com.geeklib.mapper.DemoMapper;
import com.geeklib.service.DemoService;
import com.github.pagehelper.PageHelper;

@Service
public class DemoServiceImpl implements DemoService {

	@Resource
	DemoMapper demoMapper;
	
	public List<DemoEntity> listObject() {
		
		return demoMapper.queryObject();
	}

}
