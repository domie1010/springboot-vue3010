package com.yjkj.framework.rbac.project.dao;

import java.util.List;
import java.util.Map;

import com.yjkj.framework.rbac.project.model.Project;

public interface ProjectDao {

	public List<Project> informationLoad(Map<String,Object> map) throws Exception;
	
	public List<Project> informationLoadAll(Project Project) throws Exception;
	
	public Integer count(Project Project) throws Exception;
	
	public Project informationLoadOne(Project Project) throws Exception;
	
	public void informationDelete(Project Project) throws Exception;
	
	public void informationAdd(Project Project) throws Exception;
	
	public void informationUpdate(Project Project) throws Exception;
	
}
