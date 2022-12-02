package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.POSSEDE;
import com.arabsoft.ajir.entities.PossedeId;

public interface PossedeDao extends JpaRepository<POSSEDE, PossedeId> {
	@Query(value = "select cod_soc,\r\n"
+ "mat_pers,\r\n" 
+ "abrv_fixe,\r\n" 
+ "date_ind,\r\n"
+ "montant,\r\n"
+ "type_par,\r\n"
+ "cod_niv,\r\n" 
+ "num_niv,\r\n"
+ "date_ind_fin,\r\n"
+ "id_possede,\r\n"
+ "cod_user\r\n"

+ "from possede\r\n"
			+ "where cod_soc = :codSoc and mat_pers = :matPers", nativeQuery = true)
	public List<POSSEDE> getPOSSEDEPers(@Param("codSoc") String codSoc, @Param("matPers") String matPers);
	
	@Query(value = "select \r\n"

			+ " p.lib_fixe \r\n" + "from  par_fixe p\r\n"

			 + "where p.abrv_fixe=:d \r\n", nativeQuery = true)
	public String getlibind(@Param("d") String x) ;

}
