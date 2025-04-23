package com.yjkj.framework.rbac.cost.web;




import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yjkj.framework.base.pager.Pager;
import com.yjkj.framework.rbac.cost.model.Cost;
import com.yjkj.framework.rbac.cost.service.impl.CostServiceImpl;
import com.yjkj.framework.rbac.cost.service.inte.CostService;

@Controller
@RequestMapping("/cost")
public class CostController {
	
	@Autowired
	private CostService costService = new CostServiceImpl();
	

	@RequestMapping("/informationLoad")
	public String informationLoad(Pager pager,Model model,Cost Cost,HttpSession session) {
		try {
		pager = this.costService.informationLoad(pager,Cost,session);
		model.addAttribute("costList", pager);
		model.addAttribute("cost", Cost);
		return "jsp/CostTable";
		}catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("message", e.getMessage());
			return "jsp/Failed";
		}
	}
	
	@RequestMapping("/informationLoadOne")
	public String informationLoadOne(Cost Cost,Model model) {
		
		try {
			Cost = this.costService.informationLoadOne(Cost);
			model.addAttribute("cost", Cost);
			return "jsp/Cost";
		}catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
	@RequestMapping("/informationAdd")
	public String informationAdd(Cost Cost,Model model) {
		
		try {
			
			this.costService.informationAdd(Cost);
			return "jsp/Success";
		}catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
	@RequestMapping("/informationDelete")
	public String informationDelete(Cost Cost,Model model) {
		
		try {
			this.costService.informationDelete(Cost);
			return "jsp/Success";
		}catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
	@RequestMapping("/informationUpdate")
	public String informationUpdate(Cost Cost,Model model) {
		
		try {
			this.costService.informationUpade(Cost);
			return "jsp/Success";
		} catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
}
