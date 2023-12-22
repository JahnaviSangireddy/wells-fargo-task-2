package com.wellsfargo.counselor.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wellsfargo.counselor.entity.Protofolio;

public interface ProtofolioRepository extends JpaRepository<Protofolio, Integer>{

	public Protofolio findByClientId(int clientId);
}
