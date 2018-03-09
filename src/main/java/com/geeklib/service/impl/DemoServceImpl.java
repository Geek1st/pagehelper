package com.geeklib.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.geeklib.entity.DemoEntity;
import com.geeklib.mapper.DemoMapper;
import com.geeklib.service.DemoService;

@Component
public class DemoServceImpl implements DemoService {

	@Resource
	DemoMapper demoMapper;
	
	public List<DemoEntity> listObject() {
		return demoMapper.listObject();
	}

}
