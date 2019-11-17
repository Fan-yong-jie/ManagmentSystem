package com.dao;

import com.vo.*;

public interface IDepDAO {
	/**
	 * ��������
	 * @param dep �������ݵĶ���
	 * @return �ɹ����
	 * @throws Exception �쳣���������׳�
	 */
	public void doAdd(Department dep) throws Exception;
	
	//public List<Department> findAll() throws Exception;
	
	public Department findByid(String id) throws Exception;
	
	public void delete(String id)throws Exception;
	
	public void update(Department dep)throws Exception;
}
