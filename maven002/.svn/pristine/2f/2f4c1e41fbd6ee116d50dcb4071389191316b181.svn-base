package com.youzhong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youzhong.dao.DeptMapper;
import com.youzhong.entity.Dept;
import com.youzhong.service.IDeptService;
import com.youzhong.utils.DeptUserVo;
@Service
public class DeptServiceImpl implements IDeptService{
      @Autowired
	  private DeptMapper deptMapper;
	
	@Override
	public List<Dept> selectByExample() {
		
		return deptMapper.selectByExample(null);
	}

	@Override
	public List<DeptUserVo> selectdeptuser() {
		
		return deptMapper.selectdeptuser();
	}

}
