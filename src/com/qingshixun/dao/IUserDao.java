package com.qingshixun.dao;

import java.util.List;

import com.qingshixun.entity.User;

public interface IUserDao {
	/**
	 * 用户注册
	 */
	public boolean registerUser(User user);
	
	/**
	 * 通过姓名来查找用户
	 * @param name
	 * @return
	 */
	public List<User> findByNameUser(String name);
}
