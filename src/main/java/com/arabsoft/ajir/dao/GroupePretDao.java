package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.arabsoft.ajir.entities.Groupe_pret;
import com.arabsoft.ajir.entities.Groupe_pretPK;

public interface GroupePretDao extends JpaRepository<Groupe_pret, Groupe_pretPK>{
	
	@Query(value="select COD_SOC,COD_GRP_PRET,LIB_GRP_PRET,TYP_GROUPE,LIB_GRP_PRET_A,TYPE_PRET,POURC_BUDG,ID_GROUPE_PRET "
			+ "from GROUPE_PRET",nativeQuery = true)
	public List<Groupe_pret> getGroupePret();

	
	

}
