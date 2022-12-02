package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.FAMILLEiD;
import com.arabsoft.ajir.entities.Famille;

public interface FamilleDao extends JpaRepository<Famille, FAMILLEiD> {
//	@Query(value="select cod_soc,\r\n"
//			+ "		   mat_pers,\r\n"
//			+ "		   num_etablis,\r\n"
//			+ "		   parente_act,\r\n"
//			+ "		   cod_activite,\r\n"
//			+ "		   prenom,\r\n"
//			+ "		   parente,\r\n"
//			+ "		   pardat_marente,\r\n"
//			+ "		   nom_jf,\r\n"
//			+ "		   dat_naiss,\r\n"
//			+ "		   sexe,\r\n"
//			+ "		   benef,\r\n"
//			+ "		   regime_conj,\r\n"
//			+ "		   dat_dece,\r\n"
//			+ "		   mat_conj,\r\n"
//			+ "		   plaf_tot_remb,\r\n"
//			+ "		   lieu_naiss,\r\n"
//			+ "		   ass_conj,\r\n"
//			+ "		   profession,\r\n"
//			+ "		   employeur,\r\n"
//			+ "		   boursier,\r\n"
//			+ "		   cod_sit,\r\n"
//			+ "		   num_ass_conj,\r\n"
//			+ "		   dat_engag_parent,\r\n"
//			+ "		   dat_e_sais,\r\n"
//			+ "		   date_validation,\r\n"
//			+ "		   declar_all,\r\n"
//			+ "		   proced_judic,\r\n"
//			+ "		   pension,\r\n"
//			+ "		   etat_fam,\r\n"
//			+ "		   mere,\r\n"
//			+ "		   grp_sang,\r\n"
//			+ "		   prenom_a,\r\n"
//			+ "		   nom_jf_a,\r\n"
//			+ "		   etat_valid,\r\n"
//			+ "		   pec,\r\n"
//			+ "		   cin,\r\n"
//			+ "		   mnt_pension,\r\n"
//			+ "		   dat_divorce,\r\n"
//			+ "		   dat_divorce,\r\n"
//
//
//
//
//
//			+ "(pk_get_lib.GET_TYP_BULLET$LIB_BULL(cod_typ_bul)) lib_bul\r\n"
//			+ "	from poss_modp\r\n"
//			+ "	where cod_soc = :codSoc and mat_pers = :matPers",nativeQuery = true)
//	public List<Famille> getfambycodsocandmatpers(@Param("codSoc") String codSoc,@Param("matPers") String matPers);
	@Query("select f from Famille f where f.cod_soc=:x and f.mat_pers=:y and f.parente='C'")
	public List<Famille> getbymatandsoc(@Param("x") String x,@Param("y") String y);
	@Query("select f from Famille f where f.cod_soc=:x and f.mat_pers=:y and f.parente='E'")
	public List<Famille> getbymatandsocbyenfant(@Param("x") String x,@Param("y") String y);


}
