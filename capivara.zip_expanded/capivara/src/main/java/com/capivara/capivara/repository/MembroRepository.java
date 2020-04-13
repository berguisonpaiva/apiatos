package com.capivara.capivara.repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capivara.capivara.model.Membro;



public interface MembroRepository extends JpaRepository<Membro,Integer>{
	Optional<Membro> findById(int id);
	
}
