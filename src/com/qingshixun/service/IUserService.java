package com.qingshixun.service;

import java.util.List;

import com.qingshixun.entity.User;

public interface IUserService {
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
