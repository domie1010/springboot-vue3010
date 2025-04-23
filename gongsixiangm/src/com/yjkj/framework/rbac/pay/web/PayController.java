package com.yjkj.framework.rbac.pay.web;




import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yjkj.framework.base.pager.Pager;
import com.yjkj.framework.rbac.pay.model.Pay;
import com.yjkj.framework.rbac.pay.service.impl.PayServiceImpl;
import com.yjkj.framework.rbac.pay.service.inte.PayService;

@Controller
@RequestMapping("/pay")
public class PayController {
	
	@Autowired
	private PayService payService = new PayServiceImpl();
	

	@RequestMapping("/informationLoad")
	public String informationLoad(Pager pager,Model model,Pay Pay,HttpSession session) {
		try {
		pager = this.payService.informationLoad(pager,Pay,session);
		model.addAttribute("payList", pager);
		model.addAttribute("pay", Pay);
		return "jsp/PayTable";
		}catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("message", e.getMessage());
			return "jsp/Failed";
		}
	}
	
	@RequestMapping("/informationLoadOne")
	public String informationLoadOne(Pay Pay,Model model) {
		
		try {
			Pay = this.payService.informationLoadOne(Pay);
			model.addAttribute("pay", Pay);
			return "jsp/Pay";
		}catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
	@RequestMapping("/informationAdd")
	public String informationAdd(Pay Pay,Model model) {
		
		try {
			
			this.payService.informationAdd(Pay);
			return "jsp/Success";
		}catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
	@RequestMapping("/informationDelete")
	public String informationDelete(Pay Pay,Model model) {
		
		try {
			this.payService.informationDelete(Pay);
			return "jsp/Success";
		}catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
	@RequestMapping("/informationUpdate")
	public String informationUpdate(Pay Pay,Model model) {
		
		try {
			this.payService.informationUpade(Pay);
			return "jsp/Success";
		} catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
}
