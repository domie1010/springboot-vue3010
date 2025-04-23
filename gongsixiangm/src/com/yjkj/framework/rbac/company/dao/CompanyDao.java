package com.yjkj.framework.rbac.company.dao;

import java.util.List;
import java.util.Map;

import com.yjkj.framework.rbac.company.model.Company;

public interface CompanyDao {

	public List<Company> informationLoad(Map<String,Object> map) throws Exception;
	
	public List<Company> informationLoadAll(Company Company) throws Exception;
	
	public Integer count(Company Company) throws Exception;
	
	public Company informationLoadOne(Company Company) throws Exception;
	
	public void informationDelete(Company Company) throws Exception;
	
	public void informationAdd(Company Company) throws Exception;
	
	public void informationUpdate(Company Company) throws Exception;
	
}
