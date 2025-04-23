package com.yjkj.framework.rbac.project.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.yjkj.framework.base.basemodel.BaseService;
import com.yjkj.framework.base.pager.Pager;
import com.yjkj.framework.base.regular.Regular;
import com.yjkj.framework.base.regular.date.CreatDate;
import com.yjkj.framework.rbac.project.model.Project;
import com.yjkj.framework.rbac.project.service.inte.ProjectService;
@Service
public class ProjectServiceImpl extends BaseService implements ProjectService {

	
	@Override
	public Pager informationLoad(Pager pager,Project Project,HttpSession session) throws Exception{
		Map<String,Object> map = new HashMap<>();
		map.put("pager", pager);
		map.put("project", Project);
		List<Project> list = this.projectDao.informationLoad(map);
		pager.setDatas(list);
		pager.setTotalCount(this.count(Project));
		return pager;
	}

	@Override
	public List<Project> informationLoadAll(Project Project) throws Exception {
		List<Project> list = this.projectDao.informationLoadAll(Project);
		return list;
	}
	

	@Override
	public Integer count(Project Project) throws Exception {
		Integer count = this.projectDao.count(Project);
		return count;
	}

	@Override
	public Project informationLoadOne(Project Project) throws Exception {
			Project = this.projectDao.informationLoadOne(Project);
		return Project;
	}

	@Override
	public void informationDelete(Project Project) throws Exception {
			this.projectDao.informationDelete(Project);

	}

	@Override
	public void informationAdd(Project Project) throws Exception {
			Project.setId(Regular.createId());
			Project.setCreatetime(CreatDate.getDate());
			Project.setFlag(Project.getId());
			this.projectDao.informationAdd(Project);

	}

	@Override
	public void informationUpade(Project Project) throws Exception {
			this.projectDao.informationUpdate(Project);
	}

}
