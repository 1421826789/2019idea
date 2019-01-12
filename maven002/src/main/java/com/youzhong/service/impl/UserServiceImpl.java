package com.youzhong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.youzhong.dao.UserMapper;
import com.youzhong.entity.User;
import com.youzhong.entity.UserExample;
import com.youzhong.service.IUserService;
import com.youzhong.utils.Datagrid;
import com.youzhong.utils.PageUtils;
import com.youzhong.utils.ResponseStatus;
@Service
public class UserServiceImpl  implements IUserService{
   @Autowired
	private UserMapper userMapper;
	
	@Override
	public Datagrid<User> selectByExample(PageUtils pageUtils) {
		PageHelper.startPage(pageUtils.getPage(), pageUtils.getRows());
		String name = (String) pageUtils.getParams().get("name");
		Long deptid = (Long) pageUtils.getParams().get("deptid");
		UserExample example = new UserExample();
		if (name!=null&&deptid==null) {							
				example.createCriteria().andRealnameLike("%"+name+"%");		
				List<User> list = userMapper.selectByExample(example);
				long total = new PageInfo<>(list).getTotal();
				return new Datagrid<User>((int)total,list);			
		}
		if (name==null&&deptid!=null) {
			example.createCriteria().andDeptidEqualTo(deptid);
			List<User> list = userMapper.selectByExample(example);
			long total = new PageInfo<>(list).getTotal();
			return new Datagrid<User>((int)total,list);
		}
		if (name!=null&&deptid!=null) {
			if (name!=""&&deptid!=0) {
				example.createCriteria().andDeptidEqualTo(deptid).andRealnameLike("%"+name+"%");
				List<User> list = userMapper.selectByExample(example);
				long total = new PageInfo<>(list).getTotal();
				return new Datagrid<User>((int)total,list);
			}
			
		}
		if (name==null&&deptid==null) {
			List<User> list = userMapper.selectByExample(null);
			long total = new PageInfo<>(list).getTotal();
			return new Datagrid<User>((int)total,list);
		}
		if (deptid!=null&&name=="") {
			example.createCriteria().andDeptidEqualTo(deptid);
			List<User> list = userMapper.selectByExample(example);
			long total = new PageInfo<>(list).getTotal();
			return new Datagrid<User>((int)total,list);
		}
		
		return null;
		
		
	}

	@Override
	public ResponseStatus addorupdate(User user) {
		int ret=0;
		if (user.getId()==null) {
			ret+=userMapper.insert(user);
		}else{
			ret+=userMapper.updateByPrimaryKey(user);
		}
		if (ret>0) {
			return ResponseStatus.ok();
		}
		return ResponseStatus.error();
	}

	@Override
	public User selectByPrimaryKey(Long id) {
		
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public int batchdelete(String ids) {
		
		return userMapper.batchdelete(ids);
	}

}
