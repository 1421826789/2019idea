package com.youzhong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youzhong.dao.FromMapper;
import com.youzhong.entity.From;
import com.youzhong.service.IFromService;
@Service
public class FromServiceImpl implements IFromService {
    @Autowired
	private FromMapper fromMapper;
	@Override
	public List<From> selectByExample() {
		
		return fromMapper.selectByExample(null);
	}

}
