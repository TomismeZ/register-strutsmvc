package com.qingshixun.dao;

import java.util.List;

import com.qingshixun.entity.User;

public interface IUserDao {
	/**
	 * �û�ע��
	 */
	public boolean registerUser(User user);
	
	/**
	 * ͨ�������������û�
	 * @param name
	 * @return
	 */
	public List<User> findByNameUser(String name);
}
