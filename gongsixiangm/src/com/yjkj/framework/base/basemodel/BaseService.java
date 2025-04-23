package com.yjkj.framework.base.basemodel;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yjkj.framework.rbac.company.dao.CompanyDao;
import com.yjkj.framework.rbac.cost.dao.CostDao;
import com.yjkj.framework.rbac.deposit.dao.DepositDao;
import com.yjkj.framework.rbac.mission.dao.MissionDao;
import com.yjkj.framework.rbac.notice.dao.NoticeDao;
import com.yjkj.framework.rbac.pay.dao.PayDao;
import com.yjkj.framework.rbac.project.dao.ProjectDao;
@Service
public class BaseService {
	
	
	
	
	
	@Autowired
	public NoticeDao noticeDao;
	
	@Autowired
	public CompanyDao companyDao;
	
	@Autowired
	public ProjectDao projectDao;
	
	@Autowired
	public CostDao costDao;
	
	@Autowired
	public DepositDao depositDao;
	
	@Autowired
	public PayDao payDao;
	
	@Autowired
	public MissionDao missionDao;
	

}
