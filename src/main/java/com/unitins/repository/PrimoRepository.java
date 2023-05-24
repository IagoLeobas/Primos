package com.unitins.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unitins.model.Primo;

@Repository
public interface PrimoRepository extends JpaRepository<Primo, Long>{

	
}
