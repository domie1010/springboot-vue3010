package com.yjkj.framework.rbac.mission.model;


import com.yjkj.framework.base.basemodel.BaseModel;
import com.yjkj.framework.rbac.project.model.Project;
import com.yjkj.framework.rbac.userInfo.model.UserInfo;


public class Mission extends BaseModel{
	
	private String p_id;
	private String user_id;
	private String content;
	private String status;
	private Project project;
	private UserInfo userInfo;
	public String getP_id() {
		return p_id;
	}
	public void setP_id(String p_id) {
		this.p_id = p_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
		
	
}
