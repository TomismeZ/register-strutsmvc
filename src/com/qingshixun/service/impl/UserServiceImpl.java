package com.qingshixun.service.impl;

import java.util.List;

import com.qingshixun.dao.IUserDao;
import com.qingshixun.dao.impl.UserDaoImpl;
import com.qingshixun.entity.User;
import com.qingshixun.service.IUserService;

public class UserServiceImpl implements IUserService{
	private IUserDao userdao=new UserDaoImpl();
	@Override
	public boolean registerUser(User user) {
		// TODO Auto-generated method stub
		return userdao.registerUser(user);
	}
	@Override
	public List<User> findByNameUser(String name) {
		// TODO Auto-generated method stub
		return userdao.findByNameUser(name);
	}

}
