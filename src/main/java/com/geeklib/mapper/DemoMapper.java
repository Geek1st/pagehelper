package com.geeklib.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.geeklib.entity.DemoEntity;

public interface DemoMapper {

	@Select("SELECT * FROM f_userinfo")
	List<DemoEntity> listObject();
}
