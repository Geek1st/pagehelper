package com.geeklib.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.geeklib.entity.DemoEntity;

public interface DemoMapper {

	@Select("SELECT * FROM m_cultureact_gzl")
	List<DemoEntity> listObject();
}
