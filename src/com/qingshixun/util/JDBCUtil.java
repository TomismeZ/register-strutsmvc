package com.qingshixun.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUtil {
	// 数据库连接属性
		private static String driver = "com.mysql.jdbc.Driver";
		// jdbc:mysql://IP:端口号/数据库名称
		private static String url = "jdbc:mysql://127.0.0.1:3306/test";
		private static String user = "root";
		private static String password = "123456";

		/**
		 * 获取JDBC连接
		 * @return
		 */
		public static Connection getConnection() {
			Connection connection = null;

			try {
				// 注册驱动
				Class.forName(driver);

				// 获取连接
				connection = DriverManager.getConnection(url, user, password);
			} catch (ClassNotFoundException e) {
				System.out.println("未找到驱动包");
				e.printStackTrace();
			} catch (SQLException e) {
				System.out.println("获取连接失败");
				e.printStackTrace();
			}

			return connection;
		}

		/**
		 * 关闭对应连接
		 * @param resultSet
		 * @param statement
		 * @param connection
		 * @throws SQLException
		 */
		public static void closeConnection(ResultSet resultSet, PreparedStatement statement, Connection connection) throws SQLException {
			if (resultSet != null) {
				resultSet.close();
			}

			if (statement != null) {
				statement.close();
			}

			if (connection != null) {
				connection.close();
			}
		}

	
}
