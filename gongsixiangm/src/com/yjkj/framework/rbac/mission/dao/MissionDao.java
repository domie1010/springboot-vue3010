package com.yjkj.framework.rbac.mission.dao;

import java.util.List;
import java.util.Map;

import com.yjkj.framework.rbac.mission.model.Mission;

public interface MissionDao {

	public List<Mission> informationLoad(Map<String,Object> map) throws Exception;
	
	public List<Mission> informationLoadAll(Mission Mission) throws Exception;
	
	public Integer count(Mission Mission) throws Exception;
	
	public Mission informationLoadOne(Mission Mission) throws Exception;
	
	public void informationDelete(Mission Mission) throws Exception;
	
	public void informationAdd(Mission Mission) throws Exception;
	
	public void informationUpdate(Mission Mission) throws Exception;
	
}
