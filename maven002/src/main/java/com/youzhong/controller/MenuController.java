package com.youzhong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sun.tools.javac.util.List;
import com.youzhong.entity.Menu;
import com.youzhong.service.IMenuService;

@Controller
@RequestMapping("/menu")
public class MenuController {
	 @Autowired
     private IMenuService menuService;	
	  @RequestMapping("/list")
	  @ResponseBody
	  public java.util.List<Menu> list(){
		  java.util.List<Menu> list = menuService.selectByExample();
		 return list;
	  }

}
