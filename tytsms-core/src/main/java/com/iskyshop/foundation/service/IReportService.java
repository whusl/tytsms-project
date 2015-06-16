package com.iskyshop.foundation.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import com.iskyshop.core.query.support.IPageList;
import com.iskyshop.core.query.support.IQueryObject;

import com.iskyshop.foundation.domain.Report;

public interface IReportService {
	/**
	 * 保存一个Report，如果保存成功返回true，否则返回false
	 * 
	 * @param instance
	 * @return 是否保存成功
	 */
	boolean save(Report instance);
	
	/**
	 * 根据一个ID得到Report
	 * 
	 * @param id
	 * @return
	 */
	Report getObjById(Long id);
	
	/**
	 * 删除一个Report
	 * 
	 * @param id
	 * @return
	 */
	boolean delete(Long id);
	
	/**
	 * 批量删除Report
	 * 
	 * @param ids
	 * @return
	 */
	boolean batchDelete(List<Serializable> ids);
	
	/**
	 * 通过一个查询对象得到Report
	 * 
	 * @param properties
	 * @return
	 */
	IPageList list(IQueryObject properties);
	
	/**
	 * 更新一个Report
	 * 
	 * @param id
	 *            需要更新的Report的id
	 * @param dir
	 *            需要更新的Report
	 */
	boolean update(Report instance);
	/**
	 * 
	 * @param query
	 * @param params
	 * @param begin
	 * @param max
	 * @return
	 */
	List<Report> query(String query, Map params, int begin, int max);
}
