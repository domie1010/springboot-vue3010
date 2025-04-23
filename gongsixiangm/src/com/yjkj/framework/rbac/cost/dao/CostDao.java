package com.yjkj.framework.rbac.cost.dao;

import java.util.List;
import java.util.Map;

import com.yjkj.framework.rbac.cost.model.Cost;

public interface CostDao {

	public List<Cost> informationLoad(Map<String,Object> map) throws Exception;
	
	public List<Cost> informationLoadAll(Cost Cost) throws Exception;
	
	public Integer count(Cost Cost) throws Exception;
	
	public Cost informationLoadOne(Cost Cost) throws Exception;
	
	public void informationDelete(Cost Cost) throws Exception;
	
	public void informationAdd(Cost Cost) throws Exception;
	
	public void informationUpdate(Cost Cost) throws Exception;
	
}
