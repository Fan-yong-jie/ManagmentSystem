package com.dao;
import com.vo.Register;
public interface IRegisterDAO {
	//增加用户
	public void add(Register reg);
	//查询用户
	public Boolean find(Register reg);
	
	
}
