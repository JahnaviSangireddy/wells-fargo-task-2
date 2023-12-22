package com.wellsfargo.counselor.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wellsfargo.counselor.entity.Securities;

public interface SecuritiesRepository extends JpaRepository<Securities, Integer>{

}
