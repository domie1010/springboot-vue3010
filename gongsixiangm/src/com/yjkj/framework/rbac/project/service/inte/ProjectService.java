package com.yjkj.framework.rbac.project.service.inte;


import java.util.List;

import javax.servlet.http.HttpSession;

import com.yjkj.framework.base.pager.Pager;
import com.yjkj.framework.rbac.project.model.Project;

public interface ProjectService {

	public Pager informationLoad(Pager pager,Project Project,HttpSession session) throws Exception;
	
	public List<Project> informationLoadAll(Project Project) throws Exception;
	
	public Integer count(Project Project) throws Exception;
	
	public Project informationLoadOne(Project Project) throws Exception;
	
	public void informationDelete(Project Project) throws Exception;
	
	public void informationAdd(Project Project) throws Exception;
	
	public void informationUpade(Project Project) throws Exception;
	
}
