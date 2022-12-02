package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.arabsoft.ajir.entities.CleLigBult;
import com.arabsoft.ajir.entities.LigBult;




@Repository
public interface LigBultRep extends JpaRepository<LigBult, CleLigBult>{
	
	@Query(value="  select\r\n"
			+ "   type_act           ,\r\n"
			+ "  abrv_act           ,\r\n"
			+ "  cod_soc            ,\r\n"
			+ "  mat_pers          ,\r\n"
			+ "  num_soins          ,\r\n"
			+ "  dat_soins          ,\r\n"
			+ "  num_lig            ,\r\n"
			+ "  cod_trait         ,\r\n"
			+ "  cod_mld            ,\r\n"
			+ "  num_ass            ,\r\n"
			+ "  cod_prestataire    ,\r\n"
			+ "  dat_acte           ,\r\n"
			+ "  tot_honor          ,\r\n"
			+ "  tot_net            ,\r\n"
			+ "  indice_propos      ,\r\n"
			+ "  indice             ,\r\n"
			+ "  mld                ,\r\n"
			+ "  mnt_rembourse      ,\r\n"
			+ "  nbr_piece          ,\r\n"
			+ "  obs_lig_bult       ,\r\n"
			+ "  num_dent_lim1      ,\r\n"
			+ "  pos_dent_lim1      ,\r\n"
			+ "  num_dent_lim2      ,\r\n"
			+ "  pos_dent_lim2      ,\r\n"
			+ "  mode_remb          ,\r\n"
			+ "  num_ass_conj       ,\r\n"
			+ "  mat_pers_conj      ,\r\n"
			+ "  typ_praticien      ,\r\n"
			+ "  abrv_act_acc       ,\r\n"
			+ "  tot_net_conj       ,\r\n"
			+ "  typ_trait          ,\r\n"
			+ "  nbr_vign           ,\r\n"
			+ "  num_fam_bult       ,\r\n"
			+ "  typ_parent         ,\r\n"
			+ "  dat_rembourse      ,\r\n"
			+ "  annee_bord         ,\r\n"
			+ "  num_bord_assur     ,\r\n"
			+ "  etat_avanc_etablis ,\r\n"
			+ "  mnt_eng_star       ,\r\n"
			+ "  indice__star       ,\r\n"
			+ "  tot_honor_star     ,\r\n"
			+ "  tot_net_star       ,\r\n"
			+ "  abrv_act_star      ,\r\n"
			+ "  num_av_etablis     ,\r\n"
			+ "  num_bord_etablis   ,\r\n"
			+ "  cod_etablis        ,\r\n"
			+ "  cod_user           ,\r\n"
			+ "  tot_remb_comp      ,\r\n"
			+ "  tot_honor_comp     ,\r\n"
			+ "  mnt_etab_conv      ,\r\n"
			+ "  id_lig_bult        ,\r\n"
			+ "  pk_get_lib.GET_ACTE$LIB_ACT(type_act,abrv_act) libcact ,\r\n"
			+ "  (pk_get_lib.GET_PARAM_ORGA$LIB_ORG(cod_etablis,'ETAB_SANIT')) liborg \r\n"
			+ "  from lig_bult \r\n"
			+ "where cod_soc = :codSoc and mat_pers = :matPers and num_soins = :numSoins ",nativeQuery = true)
	public List<LigBult> getLigBult(@Param("codSoc") String codSoc,@Param("matPers") String matPers,@Param("numSoins") Integer numSoins);
	
	
	@Query(value="select num_soins\r\n"
			+ "from\r\n"
			+ " BULT_SOIN\r\n"
			+ "where cod_soc = :codSoc and mat_pers = :matPers and num_soins = :numSoins \r\n"
			,nativeQuery=true)
	public List<String> getNumSoinParam(@Param("codSoc") String codSoc,@Param("matPers") String matPers,@Param("numSoins") Integer numSoins);

}
