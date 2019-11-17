package com.dao;

import java.sql.*;

import org.junit.Test;

import com.dbc.*;
import com.vo.Register;

public class RegisterDAOImpl implements IRegisterDAO {
	String sql=null;
	Connection conn = null;
	PreparedStatement pre = null;
	ResultSet res = null;

	@Override
	public void add(Register reg) {
		// TODO Auto-generated method stub
		
		String sql = "INSERT INTO `register`(name,password) VALUES(?,?)";
		
		conn = DataBaseConnection.grtConnection();
		try {
			pre= conn.prepareStatement(sql);
			pre.setString(1, reg.getName());
			pre.setString(2, reg.getPassword());
			pre.execute();
			System.out.println("tianjia");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			DataBaseConnection.close(conn, pre, null);
		}
	}

	@Override
	public Boolean find(Register reg) {
		// TODO Auto-generated method stub
		conn = DataBaseConnection.grtConnection();
		Boolean f=false;
		try {		
			sql="SELECT *FROM `register`WHERE `name`=? AND `password`=?";
			pre = conn.prepareStatement(sql);
			pre.setString(1, reg.getName());
			pre.setString(2, reg.getPassword());
			res = pre.executeQuery();
			if(res.next())
			{
				f=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//return false;
		return f;
	}
	@Test
	public void dd()
	{
		Register reg = new Register();
		RegisterDAOImpl iml = new RegisterDAOImpl();
		reg.setName("1234553454");
		reg.setPassword("12345");
		System.out.println(iml.find(reg));
		if(iml.find(reg))
		{
			System.out.println("cg");
		}else
		{
			System.out.println("sb");
		}
	}
}
