package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.dbc.DataBaseConnection;
import com.vo.Staff;

public class StaffDAOImpl implements IStaffDAO {

	@Override
	public void doAdd(Staff sta) throws Exception {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO `tblemp`(empNo,empName,age,sex,salary,depNo) VALUES(?,?,?,?,?,?)";
		Connection conn = DataBaseConnection.grtConnection();
		PreparedStatement pre = conn.prepareStatement(sql);
		pre.setString(1, sta.getId());
		pre.setString(2, sta.getName());
		pre.setInt(3, sta.getAge());
		pre.setString(4, sta.getSex());
		pre.setString(5, sta.getSalary());
		pre.setString(6, sta.getDep());
		pre.execute();
		DataBaseConnection.close(conn, pre, null);
	}

	@Override
	public Staff findByid(String id) throws Exception {
		// TODO Auto-generated method stub
		Staff sta = new Staff();
		String sql = "SELECT *FROM `tblemp`WHERE `empNo`=?";
		Connection conn = DataBaseConnection.grtConnection();
		PreparedStatement pre = conn.prepareStatement(sql);
		pre.setString(1, id);
		ResultSet res = pre.executeQuery();
		if (res.next()) {
			sta.setId(res.getString(1));
			sta.setName(res.getString(2));
			sta.setAge(res.getInt(3));
			sta.setSex(res.getString(4));
			sta.setSalary(res.getString(5));
			sta.setDep(res.getString(6));
		}
		DataBaseConnection.close(conn, pre, res);
		return sta;
	}

	@Override
	public void delete(String id) throws Exception {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM `tblemp` WHERE empNo=?";
		Connection conn = DataBaseConnection.grtConnection();
		PreparedStatement pre = conn.prepareStatement(sql);
		pre.setString(1, id);
		pre.execute();
		DataBaseConnection.close(conn, pre, null);
	}

	@Override
	public void update(Staff sta) throws Exception {
		// TODO Auto-generated method stub
		String sql = "UPDATE `tblemp`SET empName=?,age=?,sex=?,salary=?,depNo=? WHERE `empNo`=?";
		Connection conn = DataBaseConnection.grtConnection();
		PreparedStatement pre = conn.prepareStatement(sql);
		pre.setString(1, sta.getName());
		pre.setInt(2, sta.getAge());
		pre.setString(3, sta.getSex());
		pre.setString(4, sta.getSalary());
		pre.setString(5, sta.getDep());
		pre.setString(6, sta.getId());
		pre.execute();
		DataBaseConnection.close(conn, pre, null);
		
	}

}
