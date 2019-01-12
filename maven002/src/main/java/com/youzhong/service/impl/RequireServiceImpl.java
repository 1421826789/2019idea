package com.youzhong.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.youzhong.dao.RequireMapper;
import com.youzhong.entity.Require;
import com.youzhong.service.IRequireService;
import com.youzhong.utils.Datagrid;
import com.youzhong.utils.PageUtils;
import com.youzhong.utils.RequireUserVo;
import com.youzhong.utils.ResponseStatus;
@Service
public class RequireServiceImpl implements IRequireService {
	@Autowired
	private RequireMapper requireMapper;

	@Override
	public Datagrid<Require> selectByExample(PageUtils pageUtils) {
		PageHelper.startPage(pageUtils.getPage(), pageUtils.getRows());
		List<Require> list = requireMapper.selectByExample(null);
		long total = new PageInfo<>(list).getTotal();
		return new Datagrid<>((int)total,list);
	}

	@Override
	public Datagrid<RequireUserVo> findByPage(PageUtils pageUtils) {
		PageHelper.startPage(pageUtils.getPage(), pageUtils.getRows());
		List<RequireUserVo> list = requireMapper.findByPage();
		for (RequireUserVo r : list) {
			String userName = requireMapper.findByPageId(r.getId());
			String userName2 = requireMapper.findByPageId2(r.getId());
			
			
			r.setUserName2(userName2);
			r.setUserName(userName);			
		}
		long total = new PageInfo<>(list).getTotal();
		return new Datagrid<>((int)total,list);
	}

	@Override
	public Long add(Require require) {
		int i = requireMapper.insert(require);
		Long arr=require.getId();
		
		if(i>0){
			return arr;
		}
		return arr;
	}

	@Override
	public List<Map> getColComments() {
		
		return requireMapper.getColComments();
	}

	@Override
	public List<Map> getDatas() {
		
		return requireMapper.getDatas();
	}

}
