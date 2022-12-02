package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.arabsoft.ajir.entities.Type_autorisation;

public interface TypeAutorisationDao extends JpaRepository<Type_autorisation, Long>{
	
	@Query(value="select t.COD_TYP_AUT,t.LIB_TYP_AUT,t.LIB_TYP_AUT_A,t.NAT_TYP_AUT,t.PLAF_PAY from TYP_AUTORISATION t ",nativeQuery = true)
	public List<Type_autorisation> getTypeAutorisation( );

}
