package com.youzhong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.youzhong.entity.From;
import com.youzhong.service.IFromService;

@Controller
@RequestMapping("/from")
public class FromController {
	@Autowired 
	private IFromService fromService;
      @RequestMapping("/list")
      @ResponseBody
	  public List<From> list(){
		  return fromService.selectByExample();
	  }
}
