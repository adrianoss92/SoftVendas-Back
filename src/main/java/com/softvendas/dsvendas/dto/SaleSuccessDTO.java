package com.softvendas.dsvendas.dto;

import java.io.Serializable;

import com.softvendas.dsvendas.entities.Seller;

public class SaleSuccessDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String salerName;
	private Long visited;
	private Long deals;
	
	public SaleSuccessDTO(Seller seller, Long visited, Long deals) {

		salerName = seller.getName();
		this.visited = visited;
		this.deals = deals;
	}

	public SaleSuccessDTO() {

	}

	public String getSalerName() {
		return salerName;
	}

	public void setSalerName(String salerName) {
		this.salerName = salerName;
	}

	public Long getVisited() {
		return visited;
	}

	public void setVisited(Long visited) {
		this.visited = visited;
	}

	public Long getDeals() {
		return deals;
	}

	public void setDeals(Long deals) {
		this.deals = deals;
	}

}
