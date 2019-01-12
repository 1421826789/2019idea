package com.youzhong.service;

import java.util.List;

import com.youzhong.entity.User;
import com.youzhong.entity.UserExample;
import com.youzhong.utils.Datagrid;
import com.youzhong.utils.PageUtils;
import com.youzhong.utils.ResponseStatus;

public interface IUserService {
	
	Datagrid<User> selectByExample(PageUtils pageUtils);

	ResponseStatus addorupdate(User user);
	
	User selectByPrimaryKey(Long id);

	int batchdelete(String ids);

}
