package com.yjkj.framework.rbac.company.web;




import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yjkj.framework.base.pager.Pager;
import com.yjkj.framework.rbac.company.model.Company;
import com.yjkj.framework.rbac.company.service.impl.CompanyServiceImpl;
import com.yjkj.framework.rbac.company.service.inte.CompanyService;

@Controller
@RequestMapping("/company")
public class CompanyController {
	
	@Autowired
	private CompanyService companyService = new CompanyServiceImpl();
	

	@RequestMapping("/informationLoad")
	public String informationLoad(Pager pager,Model model,Company Company,HttpSession session) {
		try {
		pager = this.companyService.informationLoad(pager,Company,session);
		model.addAttribute("companyList", pager);
		model.addAttribute("company", Company);
		return "jsp/CompanyTable";
		}catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("message", e.getMessage());
			return "jsp/Failed";
		}
	}
	
	@RequestMapping("/informationLoadOne")
	public String informationLoadOne(Company Company,Model model) {
		
		try {
			Company = this.companyService.informationLoadOne(Company);
			model.addAttribute("company", Company);
			return "jsp/Company";
		}catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
	@RequestMapping("/informationAdd")
	public String informationAdd(Company Company,Model model) {
		
		try {
			
			this.companyService.informationAdd(Company);
			return "jsp/Success";
		}catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
	@RequestMapping("/informationDelete")
	public String informationDelete(Company Company,Model model) {
		
		try {
			this.companyService.informationDelete(Company);
			return "jsp/Success";
		}catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
	@RequestMapping("/informationUpdate")
	public String informationUpdate(Company Company,Model model) {
		
		try {
			this.companyService.informationUpade(Company);
			return "jsp/Success";
		} catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
	@RequestMapping("/exportExcel")
	public String exportExcel(Company company,Model model,HttpServletRequest request,HttpServletResponse response,HttpSession session) {
		
		try {
			this.companyService.exceptExcel(company, request, response, session);
			return "jsp/Success";
		} catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
}
