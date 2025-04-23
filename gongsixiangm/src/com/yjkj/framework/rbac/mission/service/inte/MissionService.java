package com.yjkj.framework.rbac.mission.service.inte;


import java.util.List;

import javax.servlet.http.HttpSession;

import com.yjkj.framework.base.pager.Pager;
import com.yjkj.framework.rbac.mission.model.Mission;

public interface MissionService {

	public Pager informationLoad(Pager pager,Mission Mission,HttpSession session) throws Exception;
	
	public List<Mission> informationLoadAll(Mission Mission) throws Exception;
	
	public Integer count(Mission Mission) throws Exception;
	
	public Mission informationLoadOne(Mission Mission) throws Exception;
	
	public void informationDelete(Mission Mission) throws Exception;
	
	public void informationAdd(Mission Mission) throws Exception;
	
	public void informationUpade(Mission Mission) throws Exception;
	
}
