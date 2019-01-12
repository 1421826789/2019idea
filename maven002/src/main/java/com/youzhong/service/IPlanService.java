package com.youzhong.service;

import java.util.List;

import com.youzhong.entity.Plan;
import com.youzhong.entity.PlanExample;

public interface IPlanService {
	
	 List<Plan> selectByExample(Long id);

}
