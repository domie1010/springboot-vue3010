package com.yjkj.framework.rbac.cost.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.yjkj.framework.base.basemodel.BaseService;
import com.yjkj.framework.base.pager.Pager;
import com.yjkj.framework.base.regular.Regular;
import com.yjkj.framework.base.regular.date.CreatDate;
import com.yjkj.framework.rbac.cost.model.Cost;
import com.yjkj.framework.rbac.cost.service.inte.CostService;
@Service
public class CostServiceImpl extends BaseService implements CostService {

	
	@Override
	public Pager informationLoad(Pager pager,Cost Cost,HttpSession session) throws Exception{
		Map<String,Object> map = new HashMap<>();
		map.put("pager", pager);
		map.put("cost", Cost);
		List<Cost> list = this.costDao.informationLoad(map);
		pager.setDatas(list);
		pager.setTotalCount(this.count(Cost));
		return pager;
	}

	@Override
	public List<Cost> informationLoadAll(Cost Cost) throws Exception {
		List<Cost> list = this.costDao.informationLoadAll(Cost);
		return list;
	}
	

	@Override
	public Integer count(Cost Cost) throws Exception {
		Integer count = this.costDao.count(Cost);
		return count;
	}

	@Override
	public Cost informationLoadOne(Cost Cost) throws Exception {
			Cost = this.costDao.informationLoadOne(Cost);
		return Cost;
	}

	@Override
	public void informationDelete(Cost Cost) throws Exception {
			this.costDao.informationDelete(Cost);

	}

	@Override
	public void informationAdd(Cost Cost) throws Exception {
			Cost.setId(Regular.createId());
			Cost.setCreatetime(CreatDate.getDate());
			this.costDao.informationAdd(Cost);

	}

	@Override
	public void informationUpade(Cost Cost) throws Exception {
			this.costDao.informationUpdate(Cost);
	}

}
