package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.arabsoft.ajir.entities.Retard;
import com.arabsoft.ajir.entities.RetardPK;

public interface RetardDAO extends JpaRepository<Retard, RetardPK>{

	@Query("select r from Retard r where r.id.cod_soc=:x and r.id.mat_pers=:y")
	public List<Retard> getRetard(@Param("x")String codSoc,@Param("y")String mat);
}
