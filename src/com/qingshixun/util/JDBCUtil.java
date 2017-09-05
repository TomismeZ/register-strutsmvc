package com.qingshixun.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUtil {
	// ���ݿ���������
		private static String driver = "com.mysql.jdbc.Driver";
		// jdbc:mysql://IP:�˿ں�/���ݿ�����
		private static String url = "jdbc:mysql://127.0.0.1:3306/test";
		private static String user = "root";
		private static String password = "123456";

		/**
		 * ��ȡJDBC����
		 * @return
		 */
		public static Connection getConnection() {
			Connection connection = null;

			try {
				// ע������
				Class.forName(driver);

				// ��ȡ����
				connection = DriverManager.getConnection(url, user, password);
			} catch (ClassNotFoundException e) {
				System.out.println("δ�ҵ�������");
				e.printStackTrace();
			} catch (SQLException e) {
				System.out.println("��ȡ����ʧ��");
				e.printStackTrace();
			}

			return connection;
		}

		/**
		 * �رն�Ӧ����
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
