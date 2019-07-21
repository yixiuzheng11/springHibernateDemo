package com.model;

import java.math.BigDecimal;

public class Book extends BaseModel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4760838303151372054L;

	private Integer id;
	
	private String name;
	
	private BigDecimal price;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
}
