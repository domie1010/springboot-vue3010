package com.yjkj.framework.rbac.deposit.web;




import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yjkj.framework.base.pager.Pager;
import com.yjkj.framework.rbac.deposit.model.Deposit;
import com.yjkj.framework.rbac.deposit.service.impl.DepositServiceImpl;
import com.yjkj.framework.rbac.deposit.service.inte.DepositService;

@Controller
@RequestMapping("/deposit")
public class DepositController {
	
	@Autowired
	private DepositService depositService = new DepositServiceImpl();
	

	@RequestMapping("/informationLoad")
	public String informationLoad(Pager pager,Model model,Deposit Deposit,HttpSession session) {
		try {
		pager = this.depositService.informationLoad(pager,Deposit,session);
		model.addAttribute("depositList", pager);
		model.addAttribute("deposit", Deposit);
		return "jsp/DepositTable";
		}catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("message", e.getMessage());
			return "jsp/Failed";
		}
	}
	
	@RequestMapping("/informationLoadOne")
	public String informationLoadOne(Deposit Deposit,Model model) {
		
		try {
			Deposit = this.depositService.informationLoadOne(Deposit);
			model.addAttribute("deposit", Deposit);
			return "jsp/Deposit";
		}catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
	@RequestMapping("/informationAdd")
	public String informationAdd(Deposit Deposit,Model model) {
		
		try {
			
			this.depositService.informationAdd(Deposit);
			return "jsp/Success";
		}catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
	@RequestMapping("/informationDelete")
	public String informationDelete(Deposit Deposit,Model model) {
		
		try {
			this.depositService.informationDelete(Deposit);
			return "jsp/Success";
		}catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
	@RequestMapping("/informationUpdate")
	public String informationUpdate(Deposit Deposit,Model model) {
		
		try {
			this.depositService.informationUpade(Deposit);
			return "jsp/Success";
		} catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
}
