package com.geeklib.service;

import java.util.List;

import com.geeklib.entity.DemoEntity;

public interface DemoService {

	List<DemoEntity> listObject(int offset,int limit);
}
