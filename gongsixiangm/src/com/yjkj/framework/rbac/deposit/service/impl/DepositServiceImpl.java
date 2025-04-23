package com.yjkj.framework.rbac.deposit.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.yjkj.framework.base.basemodel.BaseService;
import com.yjkj.framework.base.pager.Pager;
import com.yjkj.framework.base.regular.Regular;
import com.yjkj.framework.base.regular.date.CreatDate;
import com.yjkj.framework.rbac.deposit.model.Deposit;
import com.yjkj.framework.rbac.deposit.service.inte.DepositService;
@Service
public class DepositServiceImpl extends BaseService implements DepositService {

	
	@Override
	public Pager informationLoad(Pager pager,Deposit Deposit,HttpSession session) throws Exception{
		Map<String,Object> map = new HashMap<>();
		map.put("pager", pager);
		map.put("deposit", Deposit);
		List<Deposit> list = this.depositDao.informationLoad(map);
		pager.setDatas(list);
		pager.setTotalCount(this.count(Deposit));
		return pager;
	}

	@Override
	public List<Deposit> informationLoadAll(Deposit Deposit) throws Exception {
		List<Deposit> list = this.depositDao.informationLoadAll(Deposit);
		return list;
	}
	

	@Override
	public Integer count(Deposit Deposit) throws Exception {
		Integer count = this.depositDao.count(Deposit);
		return count;
	}

	@Override
	public Deposit informationLoadOne(Deposit Deposit) throws Exception {
			Deposit = this.depositDao.informationLoadOne(Deposit);
		return Deposit;
	}

	@Override
	public void informationDelete(Deposit Deposit) throws Exception {
			this.depositDao.informationDelete(Deposit);

	}

	@Override
	public void informationAdd(Deposit Deposit) throws Exception {
			Deposit.setId(Regular.createId());
			Deposit.setCreatetime(CreatDate.getDate());
			this.depositDao.informationAdd(Deposit);

	}

	@Override
	public void informationUpade(Deposit Deposit) throws Exception {
			this.depositDao.informationUpdate(Deposit);
	}

}
