package com.youzhong.controller;

import org.junit.validator.PublicClassValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sun.tools.javac.util.List;
import com.youzhong.entity.Dept;
import com.youzhong.service.IDeptService;
import com.youzhong.utils.DeptUserVo;

@Controller
@RequestMapping("/dept")
public class DeptController {
	 @Autowired
	private IDeptService deptService;
	   @RequestMapping("/list")
	   @ResponseBody
	   public java.util.List<Dept> list(){
		   java.util.List<Dept> list = deptService.selectByExample();
		   return list;
	   }
	   @RequestMapping("/deptuserlist")
	   @ResponseBody
	   public java.util.List<DeptUserVo> deptuserlist(){
		    java.util.List<DeptUserVo> list = deptService.selectdeptuser();		    
		   return list;
	   }
//测试一下
}
