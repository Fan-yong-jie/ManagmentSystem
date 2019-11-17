package com.dao;


import com.vo.Staff;
public interface IStaffDAO {

public void doAdd(Staff sta) throws Exception;
	
	//public List<Department> findAll() throws Exception;
	
	public Staff findByid(String id) throws Exception;
	
	public void delete(String id)throws Exception;
	
	public void update(Staff sta)throws Exception;
}
