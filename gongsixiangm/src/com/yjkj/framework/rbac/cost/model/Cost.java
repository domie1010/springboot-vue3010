package com.yjkj.framework.rbac.cost.model;

import java.math.BigDecimal;

import com.yjkj.framework.base.basemodel.BaseModel;
import com.yjkj.framework.rbac.project.model.Project;


public class Cost extends BaseModel{
	
	private String p_id;
	private String content;
	private BigDecimal price;
	private Project project;
	
	public String getP_id() {
		return p_id;
	}

	public void setP_id(String p_id) {
		this.p_id = p_id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}
	
	
}
