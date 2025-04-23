package com.yjkj.framework.rbac.mission.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.yjkj.framework.base.basemodel.BaseService;
import com.yjkj.framework.base.pager.Pager;
import com.yjkj.framework.base.regular.Regular;
import com.yjkj.framework.base.regular.date.CreatDate;
import com.yjkj.framework.rbac.mission.model.Mission;
import com.yjkj.framework.rbac.mission.service.inte.MissionService;
@Service
public class MissionServiceImpl extends BaseService implements MissionService {

	
	@Override
	public Pager informationLoad(Pager pager,Mission Mission,HttpSession session) throws Exception{
		Map<String,Object> map = new HashMap<>();
		map.put("pager", pager);
		map.put("mission", Mission);
		List<Mission> list = this.missionDao.informationLoad(map);
		pager.setDatas(list);
		pager.setTotalCount(this.count(Mission));
		return pager;
	}

	@Override
	public List<Mission> informationLoadAll(Mission Mission) throws Exception {
		List<Mission> list = this.missionDao.informationLoadAll(Mission);
		return list;
	}
	

	@Override
	public Integer count(Mission Mission) throws Exception {
		Integer count = this.missionDao.count(Mission);
		return count;
	}

	@Override
	public Mission informationLoadOne(Mission Mission) throws Exception {
			Mission = this.missionDao.informationLoadOne(Mission);
		return Mission;
	}

	@Override
	public void informationDelete(Mission Mission) throws Exception {
			this.missionDao.informationDelete(Mission);

	}

	@Override
	public void informationAdd(Mission Mission) throws Exception {
			Mission.setId(Regular.createId());
			Mission.setCreatetime(CreatDate.getDate());
			this.missionDao.informationAdd(Mission);

	}

	@Override
	public void informationUpade(Mission Mission) throws Exception {
			this.missionDao.informationUpdate(Mission);
	}

}
