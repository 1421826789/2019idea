package com.youzhong.service;

import java.util.List;

import com.youzhong.entity.From;
import com.youzhong.entity.FromExample;

public interface IFromService {
     
	List<From> selectByExample();
}
