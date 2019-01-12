package com.youzhong.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youzhong.dao.ReqimgMapper;
import com.youzhong.entity.Reqimg;
import com.youzhong.service.IReqingService;
@Service
public class ReqingServiceImpl implements IReqingService {
	@Autowired
	private ReqimgMapper reqimgMapper;

	@Override
	public int insert(Reqimg record) {
		
		return reqimgMapper.insert(record);
	}

}
