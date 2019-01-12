package com.youzhong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youzhong.dao.MenuMapper;
import com.youzhong.entity.Menu;
import com.youzhong.service.IMenuService;
@Service
public class MenuServiceImpl implements IMenuService {
      @Autowired
	  private MenuMapper menuMapper;
	
	@Override
	public List<Menu> selectByExample() {
		
		return menuMapper.selectByExample(null);
	}

}
