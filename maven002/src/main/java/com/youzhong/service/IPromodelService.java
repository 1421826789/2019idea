package com.youzhong.service;

import java.util.List;

import com.youzhong.entity.Promodel;
import com.youzhong.entity.PromodelExample;

public interface IPromodelService {
	
	List<Promodel> selectByExample(Long id);

}
