package com.vo;
/**
 * 
 * ���岿����
 *
 */
//import dbc.DataBaseConnection;
public class Department {
	String name;	//��������
	String id;	//���ű��
	String number;	//��������
	
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
