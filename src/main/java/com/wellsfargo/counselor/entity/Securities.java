package com.wellsfargo.counselor.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Securities {
	
	@Id
	@GeneratedValue
	private int securityId;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String category;
	
	@Column(nullable = false)
	private LocalDate purchaseDate;
	
	@Column(nullable = false)
	private double purchasePrice;
	
	@Column(nullable = false)
	private int quantity;
	
	@ManyToOne
	private int protofolioId;
	
	
	public Securities(int securityId, String name, String category, LocalDate purchaseDate, double purchasePrice,
			int quantity) {
		super();
		this.securityId = securityId;
		this.name = name;
		this.category = category;
		this.purchaseDate = purchaseDate;
		this.purchasePrice = purchasePrice;
		this.quantity = quantity;
	}

	public int getSecurityId() {
		return securityId;
	}

	public void setSecurityId(int securityId) {
		this.securityId = securityId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
