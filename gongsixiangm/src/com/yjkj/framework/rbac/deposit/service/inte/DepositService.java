package com.yjkj.framework.rbac.deposit.service.inte;


import java.util.List;

import javax.servlet.http.HttpSession;

import com.yjkj.framework.base.pager.Pager;
import com.yjkj.framework.rbac.deposit.model.Deposit;

public interface DepositService {

	public Pager informationLoad(Pager pager,Deposit Deposit,HttpSession session) throws Exception;
	
	public List<Deposit> informationLoadAll(Deposit Deposit) throws Exception;
	
	public Integer count(Deposit Deposit) throws Exception;
	
	public Deposit informationLoadOne(Deposit Deposit) throws Exception;
	
	public void informationDelete(Deposit Deposit) throws Exception;
	
	public void informationAdd(Deposit Deposit) throws Exception;
	
	public void informationUpade(Deposit Deposit) throws Exception;
	
}
