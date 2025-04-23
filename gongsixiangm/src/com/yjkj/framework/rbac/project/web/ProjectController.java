package com.yjkj.framework.rbac.project.web;




import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yjkj.framework.base.pager.Pager;
import com.yjkj.framework.rbac.project.model.Project;
import com.yjkj.framework.rbac.project.service.impl.ProjectServiceImpl;
import com.yjkj.framework.rbac.project.service.inte.ProjectService;

@Controller
@RequestMapping("/project")
public class ProjectController {
	
	@Autowired
	private ProjectService projectService = new ProjectServiceImpl();
	

	@RequestMapping("/informationLoad")
	public String informationLoad(Pager pager,Model model,Project Project,HttpSession session) {
		try {
		pager = this.projectService.informationLoad(pager,Project,session);
		model.addAttribute("projectList", pager);
		model.addAttribute("project", Project);
		return "jsp/ProjectTable";
		}catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("message", e.getMessage());
			return "jsp/Failed";
		}
	}
	
	@RequestMapping("/informationLoadOne")
	public String informationLoadOne(Project Project,Model model) {
		
		try {
			Project = this.projectService.informationLoadOne(Project);
			model.addAttribute("project", Project);
			return "jsp/Project";
		}catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
	@RequestMapping("/informationAdd")
	public String informationAdd(Project Project,Model model) {
		
		try {
			
			this.projectService.informationAdd(Project);
			return "jsp/Success";
		}catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
	@RequestMapping("/informationDelete")
	public String informationDelete(Project Project,Model model) {
		
		try {
			this.projectService.informationDelete(Project);
			return "jsp/Success";
		}catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
	@RequestMapping("/informationUpdate")
	public String informationUpdate(Project Project,Model model) {
		
		try {
			this.projectService.informationUpade(Project);
			return "jsp/Success";
		} catch (Exception e) {
			e.printStackTrace();
			return "jsp/Failed";
		}
		
	}
	
}
