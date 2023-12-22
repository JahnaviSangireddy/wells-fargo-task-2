package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Client {
	
	@Id
	@GeneratedValue
	private int clientId;
	
	@Column(nullable = false)
	private String clientName;
	
	@Column(nullable = false)
	private String clientEmail;
	
	@OneToOne
	private int protofolioId;
	
	@ManyToOne
	private int advisorId;
	
	public Client(int client_Id, String client_name, String client_email, int protofolioId) {
		super();
		this.clientId = client_Id;
		this.clientName = client_name;
		this.clientEmail = client_email;
		this.protofolioId = protofolioId;
	}

	public int getClient_Id() {
		return clientId;
	}

	public void setClient_Id(int client_Id) {
		this.clientId = client_Id;
	}

	public String getClient_name() {
		return clientName;
	}

	public void setClient_name(String client_name) {
		this.clientName = client_name;
	}

	public String getClient_email() {
		return clientEmail;
	}

	public void setClient_email(String client_email) {
		this.clientEmail = client_email;
	}

	public int getProtofolioID() {
		return protofolioId;
	}

	public void setProtofolioID(int protofolioId) {
		this.protofolioId = protofolioId;
	}
}
