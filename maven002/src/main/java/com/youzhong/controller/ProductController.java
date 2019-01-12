package com.youzhong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.youzhong.entity.Product;
import com.youzhong.service.IProductService;
import com.youzhong.utils.Datagrid;
import com.youzhong.utils.PageUtils;
import com.youzhong.utils.ResponseStatus;

@Controller
@RequestMapping("/product")
public class ProductController {
	  @Autowired
	  private IProductService productService;
      @RequestMapping("/list")
      @ResponseBody
	  public Datagrid<Product> list(Integer page,Integer rows){
    	  PageUtils pageUtils = new PageUtils(page,rows);
		  return productService.selectlist(pageUtils);
	  }
      
      
      @RequestMapping("/list2")
      @ResponseBody
	  public List<Product> list2(){
    	  PageUtils pageUtils = new PageUtils(1,Integer.MAX_VALUE);
    	  Datagrid<Product> datagrid = productService.selectlist(pageUtils);
    	  List<Product> list = datagrid.getRows();
		  return list; 
	  }
      
      
      
      @RequestMapping("/toadd")
      public String toadd(Long id,Model model){
    	  Product product = productService.selectByPrimaryKey(id);
    	  model.addAttribute("product", product);
    	  return "product/toadd";
      }
      @RequestMapping("/fuzeren")
      public String fuzeren(){
    	  return "product/fuzeren";
      }
      @RequestMapping("/add")
      @ResponseBody
      public ResponseStatus add(Product product){
    	  
    	  return productService.add(product);
      }
	
}
