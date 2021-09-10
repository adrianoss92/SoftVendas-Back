package com.softvendas.dsvendas.dto;

import java.io.Serializable;

import com.softvendas.dsvendas.entities.Seller;

public class SaleSumDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String salerName;
	private Double sum;
	
	public SaleSumDTO(Seller seller, Double sum) {
		super();
		this.salerName = seller.getName();
		this.sum = sum;
	}

	public SaleSumDTO() {

	}

	public String getSalerName() {
		return salerName;
	}

	public void setSalerName(String salerName) {
		this.salerName = salerName;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}
	
	
	
}
