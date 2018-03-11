package com.geeklib.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geeklib.annotation.NotPaging;
import com.geeklib.entity.DemoEntity;
import com.geeklib.service.DemoService;

@RestController
@Component
public class DemoController {

	@Resource
	DemoService demoService;
	
	@GetMapping("/list")
	@NotPaging
	public Object listObject(){
		return demoService.listObject();
	}
}
