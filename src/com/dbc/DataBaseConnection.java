package com.dbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DataBaseConnection {
	private static final String DBURl = "jdbc:mysql://localhost:3306/hrdb?useUnicode=true&characterEncoding=utf-8";//数据库地址
	private static final String DBUSER = "root";//数据库用户名
	private static final String DBPASSWORD = "123456";//数据库密码
	//加载驱动
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//创建连接对象
 public static Connection grtConnection()
	{
		
		try {
			return DriverManager.getConnection(DBURl, DBUSER, DBPASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
 
 //断开连接，释放资源
	public static void close(Connection conn,PreparedStatement sta,ResultSet res)
	{
		if(res != null)
		{
			try {
				res.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(sta != null)
		{
			try {
				sta.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(conn != null)
		{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
