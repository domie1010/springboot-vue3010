package com.yjkj.framework.rbac.project.model;

import java.math.BigDecimal;

import com.yjkj.framework.base.basemodel.BaseModel;


public class Project extends BaseModel{
	
	private BigDecimal price;
	private Integer count_complete;
	private Integer count_uncomplete;

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getCount_complete() {
		return count_complete;
	}

	public void setCount_complete(Integer count_complete) {
		this.count_complete = count_complete;
	}

	public Integer getCount_uncomplete() {
		return count_uncomplete;
	}

	public void setCount_uncomplete(Integer count_uncomplete) {
		this.count_uncomplete = count_uncomplete;
	}
	
	
}
