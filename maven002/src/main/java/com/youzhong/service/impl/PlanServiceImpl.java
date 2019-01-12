package com.youzhong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youzhong.dao.PlanMapper;
import com.youzhong.entity.Plan;
import com.youzhong.entity.PlanExample;
import com.youzhong.service.IPlanService;
@Service
public class PlanServiceImpl implements IPlanService {
	 @Autowired
	 private PlanMapper planMapper;

	@Override
	public List<Plan> selectByExample(Long id) {
		PlanExample example = new PlanExample();
		example.createCriteria().andProidEqualTo(id);
		return planMapper.selectByExample(example);
	}

}
