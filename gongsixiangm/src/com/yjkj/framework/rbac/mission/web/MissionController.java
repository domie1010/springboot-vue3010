package com.yjkj.framework.rbac.mission.web;




import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yjkj.framework.base.pager.Pager;
import com.yjkj.framework.rbac.mission.model.Mission;
import com.yjkj.framework.rbac.mission.service.impl.MissionServiceImpl;
import com.yjkj.framework.rbac.mission.service.inte.MissionService;

@Controller
@RequestMapping("/mission")
public class MissionController {
	
	@Autowired
	private MissionService missionService = new MissionServiceImpl();
	

	@RequestMapping("/informationLoad")
	public String informationLoad(Pager pager,Model model,Mission Mission,HttpSession session) {
		try {
		pager = this.missionService.informationLoad(pager,Mission,session);
		model.addAttribute("missionList", pager);
		model.addAttribute("mission", Mission);
		return "jsp/MissionTable";
		}catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("message", e.getMessage());
			return "jsp/Failed";
		}
	}
	@RequestMapping("/informationLoadMy")
	public String informationLoadMy(Pager pager,Model model,Mission Mission,HttpSession session) {
		try {
		pager = this.missionService.informationLoad(pager,Mission,session);
		model.addAttribute("missionList", pager);
		model.addAttribute("mission", Mission);
		return "jsp/MyMissionTable";
		}catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("message", e.getMessage());
			return "jsp/Failed";
		}
	}
	
	@RequestMapping("/informationLoadOne")
	public String informationLoadOne(Mission Mission,Model model) {
		
		try {
			Mission = this.missionService.informationLoadOne(Mission);
			model.addAttribute("mission", Mission);
			return "jsp/Mission";
		}catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
	@RequestMapping("/informationAdd")
	public String informationAdd(Mission Mission,Model model) {
		
		try {
			
			this.missionService.informationAdd(Mission);
			return "jsp/Success";
		}catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
	@RequestMapping("/informationDelete")
	public String informationDelete(Mission Mission,Model model) {
		
		try {
			this.missionService.informationDelete(Mission);
			return "jsp/Success";
		}catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
	@RequestMapping("/informationUpdate")
	public String informationUpdate(Mission Mission,Model model) {
		
		try {
			this.missionService.informationUpade(Mission);
			return "jsp/Success";
		} catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
}
