package com.youzhong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youzhong.dao.PromodelMapper;
import com.youzhong.entity.Promodel;
import com.youzhong.entity.PromodelExample;
import com.youzhong.service.IPromodelService;
@Service
public class PromodelServiceImpl implements IPromodelService {
	 @Autowired
	 private PromodelMapper promodelMapper;

	@Override
	public List<Promodel> selectByExample(Long id) {
		PromodelExample example = new PromodelExample();
		example.createCriteria().andProidEqualTo(id);
		return promodelMapper.selectByExample(example);
	}

}
