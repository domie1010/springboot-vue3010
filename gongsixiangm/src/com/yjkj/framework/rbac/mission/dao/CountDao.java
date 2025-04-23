package com.yjkj.framework.rbac.mission.dao;


import com.yjkj.framework.rbac.mission.model.Mission;

public interface CountDao {

	
	public Integer countComplete(Mission Mission) throws Exception;
	
	public Integer countUnComplete(Mission Mission) throws Exception;
	
}
