package com.youzhong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.youzhong.entity.Plan;
import com.youzhong.service.IPlanService;

@Controller
@RequestMapping("/plan")
public class PlanController {
	 @Autowired
	 private IPlanService planService;
	
	  @RequestMapping("/list")
	  @ResponseBody
	  public List<Plan> list(Long id){
		  return planService.selectByExample(id);
	  }

}
