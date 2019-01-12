package com.youzhong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.youzhong.dao.ProductMapper;
import com.youzhong.entity.Product;
import com.youzhong.service.IProductService;
import com.youzhong.utils.Datagrid;
import com.youzhong.utils.PageUtils;
import com.youzhong.utils.ResponseStatus;
@Service
public class ProductServiceImpl implements IProductService{
	   @Autowired
	   private ProductMapper productMapper;

	@Override
	public Datagrid<Product> selectlist(PageUtils pageUtils) {
		PageHelper.startPage(pageUtils.getPage(), pageUtils.getRows());
		List<Product> list = productMapper.selectByExample(null);
		long total = new PageInfo<>(list).getTotal();
		
		return new Datagrid<>((int)total,list);
	}

	@Override
	public ResponseStatus add(Product product) {
		int ret=0;
		if (product.getId()==null) {
			ret+= productMapper.insert(product);
		}else{
			ret+=productMapper.updateByPrimaryKey(product);
		}
		
		if(ret>0){
			return ResponseStatus.ok();
		}
		return ResponseStatus.error();
	}

	@Override
	public Product selectByPrimaryKey(Long id) {
		
		return productMapper.selectByPrimaryKey(id);
	}
	   
	   

}
