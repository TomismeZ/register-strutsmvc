package com.qingshixun.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.qingshixun.dao.IUserDao;
import com.qingshixun.entity.User;
import com.qingshixun.util.JDBCUtil;
import com.qingshixun.util.JdbcUtils_C3P0;

public class UserDaoImpl implements IUserDao {

	Connection conn = null;
	PreparedStatement st = null;
	ResultSet rs = null;

	@Override
	public boolean registerUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("添加用户");
		int result = 0;
		try {
			// 获取数据库连接
			conn = (Connection) JDBCUtil.getConnection();
			st = conn.prepareStatement(
					"insert into t_user(username,password,gender,email,occupation,hobby) values(?,?,?,?,?,?)");
			st.setString(1, user.getUsername());
			st.setString(2, user.getPassword());
			st.setString(3, String.valueOf(user.getGender()));
			st.setString(4, user.getEmail());
			st.setString(5, user.getOccupation());
			st.setString(6, user.getHobby().toString());
			result = st.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		} finally {
			// 释放资源
			try {
				JDBCUtil.closeConnection(rs, st, conn);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (result > 0) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public List<User> findByNameUser(String name) {
		List<User> list = new ArrayList<>();
		try {
			// 获取数据库连接
			conn = (Connection) JDBCUtil.getConnection();
			st = conn.prepareStatement("SELECT username,password FROM t_user WHERE username=?");
			st.setString(1, name);
			rs = st.executeQuery();
			if (rs.next()) {
				while (rs.next()) {
					User user = new User();
					user.setUsername(rs.getString(1));
					user.setPassword(rs.getString(2));

					list.add(user);
				}
				return list;
			} else {
				return null;
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			// 释放资源
			try {
				JDBCUtil.closeConnection(rs, st, conn);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

}
