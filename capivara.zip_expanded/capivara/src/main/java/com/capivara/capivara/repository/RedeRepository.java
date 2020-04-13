package com.capivara.capivara.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.capivara.capivara.model.Rede;


public interface RedeRepository extends JpaRepository<Rede,Integer>{
	Rede findById(int id);
	
}
