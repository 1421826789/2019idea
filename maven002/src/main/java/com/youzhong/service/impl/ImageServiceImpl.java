package com.youzhong.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youzhong.dao.ImageMapper;
import com.youzhong.entity.Image;
import com.youzhong.service.IImageService;
@Service
public class ImageServiceImpl implements IImageService {
    @Autowired
	private ImageMapper imageMapper;
	@Override
	public int insert(Image record) {
		
		return imageMapper.insert(record);
	}

}
