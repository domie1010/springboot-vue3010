package com.yjkj.framework.rbac.deposit.dao;

import java.util.List;
import java.util.Map;

import com.yjkj.framework.rbac.deposit.model.Deposit;

public interface DepositDao {

	public List<Deposit> informationLoad(Map<String,Object> map) throws Exception;
	
	public List<Deposit> informationLoadAll(Deposit Deposit) throws Exception;
	
	public Integer count(Deposit Deposit) throws Exception;
	
	public Deposit informationLoadOne(Deposit Deposit) throws Exception;
	
	public void informationDelete(Deposit Deposit) throws Exception;
	
	public void informationAdd(Deposit Deposit) throws Exception;
	
	public void informationUpdate(Deposit Deposit) throws Exception;
	
}
