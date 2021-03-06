package com.youzhong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sun.tools.javac.util.List;
import com.youzhong.entity.User;
import com.youzhong.service.IUserService;
import com.youzhong.utils.Datagrid;
import com.youzhong.utils.PageUtils;
import com.youzhong.utils.ResponseStatus;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private IUserService userService;
	@RequestMapping("/list")
	@ResponseBody
	   public Datagrid<User> list(Integer page,Integer rows,
			                           String name,Long deptid){
		
		   PageUtils pageUtils = new PageUtils(page,rows);
		   pageUtils.getParams().put("name", name);
		   pageUtils.getParams().put("deptid", deptid);
		    
		  return userService.selectByExample(pageUtils); 
	   }
	
	@RequestMapping("/list2")
	@ResponseBody
	   public java.util.List<User> list2(){
		
		   PageUtils pageUtils = new PageUtils(1,Integer.MAX_VALUE);
		   pageUtils.getParams().put("name", null);
		   pageUtils.getParams().put("deptid", null);
		   Datagrid<User> datagrid = userService.selectByExample(pageUtils);
		   java.util.List<User> list = datagrid.getRows();
		  return list; 
	   }
	@RequestMapping("/toaddorupdate")	
	public String toaddorupdate(Long id,Model model){
		if(id!=null){
			User user = userService.selectByPrimaryKey(id);
			model.addAttribute("user", user);
		}
		return "user/addorupdate";
	}
	@RequestMapping("/addorupdate")
	@ResponseBody
	public ResponseStatus addorupdate(User user){
		return userService.addorupdate(user);
	}
	@RequestMapping("/batchdelete")
	@ResponseBody
	public int batchdelete(String ids){
		  return userService.batchdelete(ids);
	}

}
