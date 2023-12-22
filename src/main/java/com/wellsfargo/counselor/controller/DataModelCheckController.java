package com.wellsfargo.counselor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wellsfargo.counselor.entity.Advisor;
import com.wellsfargo.counselor.entity.Client;
import com.wellsfargo.counselor.entity.Protofolio;
import com.wellsfargo.counselor.entity.Securities;
import com.wellsfargo.counselor.repo.AdvisorRepository;
import com.wellsfargo.counselor.repo.ClientRepository;
import com.wellsfargo.counselor.repo.ProtofolioRepository;
import com.wellsfargo.counselor.repo.SecuritiesRepository;

//@RestController
public class DataModelCheckController {
	
	private AdvisorRepository advisorRepo;
	private ClientRepository clientRepo;
	private ProtofolioRepository protoRepo;
	private SecuritiesRepository secuRepo;
	
	public DataModelCheckController(AdvisorRepository advisorRepo, ClientRepository clientRepo,
			ProtofolioRepository protoRepo, SecuritiesRepository secuRepo) {
		super();
		this.advisorRepo = advisorRepo;
		this.clientRepo = clientRepo;
		this.protoRepo = protoRepo;
		this.secuRepo = secuRepo;
	}
	
	@GetMapping("/getAdvisorDetails")
	public List<Advisor> getAdvisorDetails() {
		
		return advisorRepo.findAll();
	}
	
	@GetMapping("/getClientDetails")
	public List<Client> getClientDetails(){
		
		return clientRepo.findAll();
	}
	
	@GetMapping("/getProtofolioDetails/{clientId}")
	public Protofolio getProtofolioDetailsOfClient(@RequestParam int clientId) {
		
		return protoRepo.findByClientId(clientId);
	}
	
	public List<Securities> getSecurityDetails(){
		
		return secuRepo.findAll();
	}

}
