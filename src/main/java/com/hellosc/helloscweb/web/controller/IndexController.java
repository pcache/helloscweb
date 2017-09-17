package com.hellosc.helloscweb.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hellosc.helloscweb.config.HelloscConstants;
import com.hellosc.helloscweb.service.DemoService;

import io.swagger.annotations.ApiOperation;

@RestController
public class IndexController {
	
	@Autowired
	private HelloscConstants constant;
	
	@Autowired
	private DemoService demoService;
	
	@ApiOperation(value="应用首页", notes="测试restful")
	@RequestMapping("/index")
    public String index(){
		demoService.test();
        return constant.getName()+constant.getUrl();
    }

}
