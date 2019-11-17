package com.vo;
/**
 * 
 * 员工信息类
 *
 */
public class Staff {
	String name;//姓名
	int age;//年龄
	String dep;//所在部门
	String sex;//性别
	String id;//编号
	String salary;//月薪

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String toString()
	{
		return this.id+this.age+this.dep+this.name+this.sex+this.salary;
	}
}
