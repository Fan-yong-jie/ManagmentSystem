package com.vo;
/**
 * 
 * Ա����Ϣ��
 *
 */
public class Staff {
	String name;//����
	int age;//����
	String dep;//���ڲ���
	String sex;//�Ա�
	String id;//���
	String salary;//��н

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
