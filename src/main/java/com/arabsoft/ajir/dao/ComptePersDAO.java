package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.ComptePers;
import com.arabsoft.ajir.entities.ComptePersID;

public interface ComptePersDAO extends JpaRepository<ComptePers, ComptePersID>{
	
	@Query(value="select 	cod_soc,\r\n"
			+ "		mat_pers,\r\n"
			+ "		cod_typ_bul,\r\n"
			+ "		cpt_banq_pers,\r\n"
			+ "		(pk_get_lib.GET_TYP_BULLET$LIB_BULL(cod_typ_bul)) lib_bul,\r\n"
			+ "		cod_banq,\r\n"
			+ "		(pk_get_lib.GET_BANQUE$LIB_BANQ(cod_banq)) lib_banq,\r\n"
			+ "		cod_agc,\r\n"
			+ "		(pk_get_lib.GET_AGENCE$LIB_AGC(cod_banq,cod_agc)) lib_agc,\r\n"
			+ "		etat_dom,\r\n"
			+ "		num_dom,\r\n"
			+ "		compt_cou,\r\n"
			+ "		cod_banq_soc,\r\n"
			+ "		cod_agc_soc,\r\n"
			+ "		id_compte_pers,\r\n"
			+ "		dat_dom\r\n"
			+ "from compte_pers\r\n"
			+ "where cod_soc = :codSoc and mat_pers = :matPers and cod_typ_bul = :codTypBul",nativeQuery = true)
	public List<ComptePers> getComptePers2(@Param("codSoc") String codSoc,@Param("matPers") String matPers,@Param("codTypBul") String codTypBul);
	
	
	
	@Query(value="select 	cod_soc,\r\n"
			+ "		mat_pers,\r\n"
			+ "		cod_typ_bul,\r\n"
			+ "		cpt_banq_pers,\r\n"
			+ "		(pk_get_lib.GET_TYP_BULLET$LIB_BULL(cod_typ_bul)) lib_bul,\r\n"
			+ "		cod_banq,\r\n"
			+ "		(pk_get_lib.GET_BANQUE$LIB_BANQ(cod_banq)) lib_banq,\r\n"
			+ "		cod_agc,\r\n"
			+ "		(pk_get_lib.GET_AGENCE$LIB_AGC(cod_banq,cod_agc)) lib_agc,\r\n"
			+ "		etat_dom,\r\n"
			+ "		num_dom,\r\n"
			+ "		compt_cou,\r\n"
			+ "		cod_banq_soc,\r\n"
			+ "		cod_agc_soc,\r\n"
			+ "		id_compte_pers,\r\n"
			+ "		dat_dom\r\n"
			+ "from compte_pers\r\n"
			+ "where cod_soc = :codSoc and mat_pers = :matPers and cod_typ_bul = :codTypBul",nativeQuery = true)
	public List<ComptePers> getComptePers(@Param("codSoc") String codSoc,@Param("matPers") String matPers,@Param("codTypBul") String codTypBul);

}
