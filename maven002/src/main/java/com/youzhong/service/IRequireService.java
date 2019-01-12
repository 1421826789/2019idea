package com.youzhong.service;

import java.util.List;
import java.util.Map;

import com.youzhong.entity.Require;
import com.youzhong.entity.RequireExample;
import com.youzhong.utils.Datagrid;
import com.youzhong.utils.PageUtils;
import com.youzhong.utils.RequireUserVo;
import com.youzhong.utils.ResponseStatus;

public interface IRequireService {
	
	Datagrid<Require> selectByExample(PageUtils pageUtils);
	
	Datagrid<RequireUserVo> findByPage(PageUtils pageUtils);

	Long add(Require require);
	
	 List<Map> getColComments();
	 
	 List<Map> getDatas();
	
	

}
