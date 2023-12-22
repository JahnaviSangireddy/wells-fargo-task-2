package com.wellsfargo.counselor.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Protofolio {
	
	@Id
	@GeneratedValue
	private int protofolioId;
	
	@OneToOne
	private int clientId;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="protofolioId")
	private List<Securities> securities;
	
	public Protofolio(int protofolioId, List<Securities> securities) {
		super();
		this.protofolioId = protofolioId;
		this.securities = securities;
	}

	public int getProtofolioId() {
		return protofolioId;
	}

	public void setProtofolioId(int protofolioId) {
		this.protofolioId = protofolioId;
	}

	public List<Securities> getSecurities() {
		return securities;
	}

	public void setSecurities(List<Securities> securities) {
		this.securities = securities;
	}
}
