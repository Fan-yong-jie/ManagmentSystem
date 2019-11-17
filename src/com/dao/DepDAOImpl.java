package com.dao;

import java.sql.*;
import com.vo.Department;
import com.dbc.*;

public class DepDAOImpl implements IDepDAO {

	private Connection conn;

	@Override
	public void doAdd(Department dep) throws Exception {
		// TODO Auto-generated method stub
		// boolean flag = false;
		String sql = "INSERT INTO `tbldep`(depNo,depName,cmmt) VALUES(?,?,?)";
		conn = DataBaseConnection.grtConnection();
		PreparedStatement pre = conn.prepareStatement(sql);
		pre.setString(1, dep.getId());
		pre.setString(2, dep.getName());
		pre.setString(3, dep.getNumber());
		pre.executeUpdate();
		DataBaseConnection.close(conn, pre, null);
	}

	@Override
	public Department findByid(String id) throws Exception  {
		// TODO Auto-generated method stub
		Department dep = new Department();
		String sql = "SELECT *FROM `tbldep`WHERE `depNo`=?";
		
		conn = DataBaseConnection.grtConnection();
		PreparedStatement pre = conn.prepareStatement(sql);
		pre.setString(1, id);
		ResultSet res = pre.executeQuery();
		System.out.println("cz");
		if (res.next()) {
			dep.setName(res.getString(2));
			dep.setNumber(res.getString(3));
			dep.setId(id);
			System.out.println("cz1");
		}
	
		
		//DataBaseConnection.close(conn, pre, res);
		return dep;

	}

	@Override
	public void delete(String id) throws Exception {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM `tbldep` WHERE `depNo` = ?";
		Connection conn = DataBaseConnection.grtConnection();
		PreparedStatement pre = conn.prepareStatement(sql);
		pre.setString(1, id);
		pre.executeUpdate();
		DataBaseConnection.close(conn, pre, null);

	}

	@Override
	public void update(Department dep) throws Exception {
		// TODO Auto-generated method stub

		String sql = "UPDATE `tbldep`SET depName=?,`cmmt`=? WHERE `depNo`=?";
		Connection conn = DataBaseConnection.grtConnection();
		PreparedStatement pre = conn.prepareStatement(sql);
		pre.setString(1, dep.getName());
		pre.setString(2, dep.getNumber());
		pre.setString(3, dep.getId());
		pre.execute();
		DataBaseConnection.close(conn, pre, null);
	}

}
