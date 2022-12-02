package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.arabsoft.ajir.entities.CessionPers;
import com.arabsoft.ajir.entities.CleCessionPers;





@Repository
public interface CessionPersRep extends JpaRepository<CessionPers, CleCessionPers>{
	@Query(value="select * from CESSION_PERS where MAT_PERS=:matPers",nativeQuery = true)
	public List<CessionPers> get(@Param("matPers")String matPers);
	
	
	@Query(value="select cod_soc ,\r\n"
			+ "  mat_pers        ,\r\n"
			+ "  cod_pret        ,\r\n"
			+ "  (pk_get_lib.Get_personnel$NomPrenom(cod_soc,mat_pers)) npers, \r\n"
			+ "  cod_etat_pret   ,\r\n"
			+ "  typ_etat        ,\r\n"
			+ "  cod_grp_pret    ,\r\n"
			+ "  typ_pret        ,\r\n"
			+ "  abrv_fixe       ,\r\n"
			+ "  org_pret        ,\r\n"
			+ "  rib_pers        ,\r\n"
			+ "  prt_dat_dem     ,\r\n"
			+ "  prt_mnt_dem     ,\r\n"
			+ "  prt_mnt_glb     ,\r\n"
			+ "  prt_dat_deb     ,\r\n"
			+ "  prt_dat_fin     ,\r\n"
			+ "  prt_ech         ,\r\n"
			+ "  rem_men         ,\r\n"
			+ "  dern_rem_men    ,\r\n"
			+ "  prt_rendu       ,\r\n"
			+ "  nbr_retenue     ,\r\n"
			+ "  objet_pret      ,\r\n"
			+ "  objet_pret_a    ,\r\n"
			+ "  dat_saisie      ,\r\n"
			+ "  cod_user        ,\r\n"
			+ "  ordonnance      ,\r\n"
			+ "  seq_ecrt        ,\r\n"
			+ "  ref_pret        ,\r\n"
			+ "  num_lot         ,\r\n"
			+ "  id_cession_pers \r\n"
			+ "  from cession_pers\r\n"
			+ "  where cod_soc = :codSoc and mat_pers = :matPers",nativeQuery=true)
	public List<CessionPers> getCessionLigCessionPers(@Param("codSoc") String codSoc,@Param("matPers") String matPers);
	
	@Query(value="select cod_soc ,\r\n"
			+ "  mat_pers        ,\r\n"
			+ "  cod_pret        ,\r\n"
			+ "  (pk_get_lib.Get_personnel$NomPrenom(cod_soc,mat_pers)) npers, \r\n"
			+ "  cod_etat_pret   ,\r\n"
			+ "  typ_etat        ,\r\n"
			+ "  cod_grp_pret    ,\r\n"
			+ "  typ_pret        ,\r\n"
			+ "  abrv_fixe       ,\r\n"
			+ "  org_pret        ,\r\n"
			+ "  rib_pers        ,\r\n"
			+ "  prt_dat_dem     ,\r\n"
			+ "  prt_mnt_dem     ,\r\n"
			+ "  prt_mnt_glb     ,\r\n"
			+ "  prt_dat_deb     ,\r\n"
			+ "  prt_dat_fin     ,\r\n"
			+ "  prt_ech         ,\r\n"
			+ "  rem_men         ,\r\n"
			+ "  dern_rem_men    ,\r\n"
			+ "  prt_rendu       ,\r\n"
			+ "  nbr_retenue     ,\r\n"
			+ "  objet_pret      ,\r\n"
			+ "  objet_pret_a    ,\r\n"
			+ "  dat_saisie      ,\r\n"
			+ "  cod_user        ,\r\n"
			+ "  ordonnance      ,\r\n"
			+ "  seq_ecrt        ,\r\n"
			+ "  ref_pret        ,\r\n"
			+ "  num_lot         ,\r\n"
			+ "  id_cession_pers \r\n"
			+ "  from cession_pers\r\n"
			+ "  where cod_soc = :codSoc and mat_pers = :matPers and cod_pret = :codPret",nativeQuery=true)
	public List<CessionPers> getCessionLigCessionPersPret(@Param("codSoc") String codSoc,@Param("matPers") String matPers,@Param("codPret") Integer codPret);
	@Query(value="select cod_pret from cession_pers \r\n"
			+ "where cod_soc = :codSoc and mat_pers = :matPers ",nativeQuery=true)
	public List<String> getCessionPersCode(@Param("codSoc") String codSoc,@Param("matPers") String matPers);

	
}
