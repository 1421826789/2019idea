package com.youzhong.service;

import java.util.List;

import com.youzhong.entity.Dept;
import com.youzhong.entity.DeptExample;
import com.youzhong.utils.DeptUserVo;

public interface IDeptService {
	
	List<Dept> selectByExample();
	
	List<DeptUserVo> selectdeptuser();

}
