package com.youzhong.service;

import com.youzhong.entity.Product;
import com.youzhong.utils.Datagrid;
import com.youzhong.utils.PageUtils;
import com.youzhong.utils.ResponseStatus;

public interface IProductService {

	Datagrid<Product> selectlist(PageUtils pageUtils);

	ResponseStatus add(Product product);
	
	Product selectByPrimaryKey(Long id);

}
