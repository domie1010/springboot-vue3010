package com.yjkj.framework.rbac.company.service.inte;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.yjkj.framework.base.pager.Pager;
import com.yjkj.framework.rbac.company.model.Company;

public interface CompanyService {

	public Pager informationLoad(Pager pager,Company Company,HttpSession session) throws Exception;
	
	public List<Company> informationLoadAll(Company Company) throws Exception;
	
	public Integer count(Company Company) throws Exception;
	
	public Company informationLoadOne(Company Company) throws Exception;
	
	public void informationDelete(Company Company) throws Exception;
	
	public void informationAdd(Company Company) throws Exception;
	
	public void informationUpade(Company Company) throws Exception;
	
	public void exceptExcel(Company company,HttpServletRequest request,HttpServletResponse response,HttpSession session) throws Exception;
	
}
