package com.dao;
import org.junit.Test;


import com.vo.*;
public class CeShi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Staff sta = new Staff();
		sta.setAge(12);
		sta.setDep("guanli");
		sta.setId("02");
		sta.setSalary("4000");
		sta.setName("zs");
		sta.setSex("la");
		StaffDAOImpl Sta = new StaffDAOImpl();
	try {
		//Sta.doAdd(sta);
		//Sta.delete("45");
		Sta.update(sta);
		System.out.println(Sta.findByid("02"));
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	@Test
	public void ceshi() throws Exception
	{
	
		//dep = new Department();
//		DataBaseConnectionFactory.getDateBaseConnection();
//		DepDAOProxy depdaoproxy = new DepDAOProxy();
//		String aa="03";
//		Department dep =depdaoproxy.findByid(aa);
//		System.out.println(dep.getName());
		try {
			System.out.println("aa");
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("bb");
	}
}
 