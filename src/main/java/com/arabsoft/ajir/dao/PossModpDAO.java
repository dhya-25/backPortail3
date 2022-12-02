package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.PossModp;
import com.arabsoft.ajir.entities.PossModpID;

public interface PossModpDAO extends JpaRepository<PossModp, PossModpID>{
	
	@Query(value="select cod_soc,\r\n"
			+ "		   mat_pers,\r\n"
			+ "		   cod_pay,\r\n"
			+ "		   cod_typ_bul,\r\n"
			+ "		   date_modp,\r\n"
			+ "		   id_poss_modp,\r\n"
			+ "		   cod_user,\r\n"
			+ "(pk_get_lib.GET_TYP_BULLET$LIB_BULL(cod_typ_bul)) lib_bul\r\n"
			+ "	from poss_modp\r\n"
			+ "	where cod_soc = :codSoc and mat_pers = :matPers",nativeQuery = true)
	public List<PossModp> getModPay(@Param("codSoc") String codSoc,@Param("matPers") String matPers);	

}
