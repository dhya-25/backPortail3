package com.arabsoft.ajir.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.Libre_demandeBis;

public interface LibreDemandeBisDao extends JpaRepository<Libre_demandeBis, Long>{
	
	
	@Query("select a from Libre_demandeBis a where a.idlibredemande=:x ")
	 public Libre_demandeBis gettByid(@Param("x") Long mat);
}
