package com.youzhong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.youzhong.entity.Promodel;
import com.youzhong.service.IPromodelService;
import com.youzhong.service.impl.PromodelServiceImpl;

@Controller
@RequestMapping("/promodel")
public class PromodelController {
	 @Autowired 
	private IPromodelService promodelService;
	  @RequestMapping("/list")
	  @ResponseBody
	  public List<Promodel> list(Long id){
		  return promodelService.selectByExample(id);
	  }

}
