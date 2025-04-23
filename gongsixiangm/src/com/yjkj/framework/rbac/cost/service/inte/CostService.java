package com.yjkj.framework.rbac.cost.service.inte;


import java.util.List;

import javax.servlet.http.HttpSession;

import com.yjkj.framework.base.pager.Pager;
import com.yjkj.framework.rbac.cost.model.Cost;

public interface CostService {

	public Pager informationLoad(Pager pager,Cost Cost,HttpSession session) throws Exception;
	
	public List<Cost> informationLoadAll(Cost Cost) throws Exception;
	
	public Integer count(Cost Cost) throws Exception;
	
	public Cost informationLoadOne(Cost Cost) throws Exception;
	
	public void informationDelete(Cost Cost) throws Exception;
	
	public void informationAdd(Cost Cost) throws Exception;
	
	public void informationUpade(Cost Cost) throws Exception;
	
}
