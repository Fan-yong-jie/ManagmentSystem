package com.vo;
/**
 * 
 * 定义部门类
 *
 */
//import dbc.DataBaseConnection;
public class Department {
	String name;	//部门名称
	String id;	//部门编号
	String number;	//部门人数
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String toString()
	{
		return "["+"id="+this.id+",name="+this.name+",number="+this.number+"]";
	}
	
}
