package com.dao;

import com.vo.*;

public interface IDepDAO {
	/**
	 * 增加数据
	 * @param dep 增加数据的对象
	 * @return 成功标记
	 * @throws Exception 异常继续向上抛出
	 */
	public void doAdd(Department dep) throws Exception;
	
	//public List<Department> findAll() throws Exception;
	
	public Department findByid(String id) throws Exception;
	
	public void delete(String id)throws Exception;
	
	public void update(Department dep)throws Exception;
}
