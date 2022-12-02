package com.arabsoft.ajir.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.arabsoft.ajir.entities.CleLigCession;
import com.arabsoft.ajir.entities.LigCession;


@Repository
public interface LigCessionRep extends JpaRepository<LigCession, CleLigCession>{
	@Query(value="  Select cod_soc ,\r\n"
			+ "  mat_pers,        \r\n"
			+ "  cod_pret,        \r\n"
			+ "  l_pret,          \r\n"
			+ "  cod_typ_bul,     \r\n"
			+ "  mois_pret_prevu,\r\n"
			+ "  mois_pret,  \r\n"
			+ "  mnt_period,      \r\n"
			+ "  cap_rest,       \r\n"
			+ "  val_pret,       \r\n"
			+ "  reg_pret,         \r\n"
			+ "  nature_etat_pret,\r\n"
			+ "  id_lig_cession  ,\r\n"
			+ "  pk_get_lib.GET_TYP_BULLET$LIB_BULL(cod_typ_bul) lib_bulletin \r\n"
			+ "  from lig_cession\r\n"
			+ "  where cod_soc = :codSoc and mat_pers = :matPers",nativeQuery=true)
	public List<LigCession> getLigCession(@Param("codSoc") String codSoc,@Param("matPers") String matPers);

	@Query(value="  Select cod_soc ,\r\n"
			+ "  mat_pers,        \r\n"
			+ "  cod_pret,        \r\n"
			+ "  l_pret,          \r\n"
			+ "  cod_typ_bul,     \r\n"
			+ "  mois_pret_prevu,\r\n"
			+ "  mois_pret,  \r\n"
			+ "  mnt_period,      \r\n"
			+ "  cap_rest,       \r\n"
			+ "  val_pret,       \r\n"
			+ "  reg_pret,         \r\n"
			+ "  nature_etat_pret,\r\n"
			+ "  id_lig_cession  ,\r\n"
			+ "  pk_get_lib.GET_TYP_BULLET$LIB_BULL(cod_typ_bul) lib_bulletin \r\n"
			+ "  from lig_cession\r\n"
			+ "  where cod_soc = :codSoc and mat_pers = :matPers and cod_pret = :codPret",nativeQuery=true)
	public List<LigCession> getLigCessionPret(@Param("codSoc") String codSoc,@Param("matPers") String matPers,@Param("codPret") Integer codPret );
	@Query(value="  Select cod_soc ,\r\n"
			+ "  mat_pers,        \r\n"
			+ "  cod_pret,        \r\n"
			+ "  l_pret,          \r\n"
			+ "  cod_typ_bul,     \r\n"
			+ "  mois_pret_prevu,\r\n"
			+ "  mois_pret,  \r\n"
			+ "  mnt_period,      \r\n"
			+ "  cap_rest,       \r\n"
			+ "  val_pret,       \r\n"
			+ "  reg_pret,         \r\n"
			+ "  nature_etat_pret,\r\n"
			+ "  id_lig_cession  ,\r\n"
			+ "  pk_get_lib.GET_TYP_BULLET$LIB_BULL(cod_typ_bul) lib_bulletin \r\n"
			+ "  from lig_cession\r\n"
			+ "  where cod_soc = :codSoc and mat_pers = :matPers and cod_pret = :codPret and l_pret = :lPret",nativeQuery=true)
	public List<LigCession> getLigCessionLPret(@Param("codSoc") String codSoc,@Param("matPers") String matPers,@Param("codPret") Integer codPret,@Param("lPret") Long lPret );

}
