package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.arabsoft.ajir.entities.BultSoin;
import com.arabsoft.ajir.entities.CleBultSoin;

	
@Repository
public interface BultSoinRep extends JpaRepository<BultSoin, CleBultSoin>{
	
	@Query(value="select  cod_soc, \r\n"
			+ "  mat_pers,\r\n"
			+ "  num_soins,\r\n"
			+ "  dat_soins,\r\n"
			+ "  (pk_get_lib.Get_personnel$NomPrenom(cod_soc,mat_pers)) nPers, \r\n"
			+ "  cod_etablis ,\r\n"
			+ "  num_bord_etablis,\r\n"
			+ "  num_bord,\r\n"
			+ "  annee_envoi,\r\n"
			+ "  num_fam_bult,\r\n"
			+ "  num_ass, \r\n"
			+ "  cod_prestataire ,\r\n"
			+ "  typ_parent,  \r\n"
			+ "  date_recp, \r\n"
			+ "  etat_bult,\r\n"
			+ "  observ,  \r\n"
			+ "  nature_bs,\r\n"
			+ "  dat_avance_agent,\r\n"
			+ "  dat_avance_etablis,\r\n"
			+ "  mode_avanc_agent,\r\n"
			+ "  mode_avanc_etablis,  \r\n"
			+ "  mnt_avance_agent,   \r\n"
			+ "  mnt_avance_etablis, \r\n"
			+ "  dat_entree_etablis,\r\n"
			+ "  dat_sortie_etablis,\r\n"
			+ "  valide,  \r\n"
			+ "  dat_valide,\r\n"
			+ "  tot_honor,  \r\n"
			+ "  tot_net,\r\n"
			+ "  nbr_pieces, \r\n"
			+ "  num_ass_conj,\r\n"
			+ "  mat_pers_conj,   \r\n"
			+ "  mode_remb,\r\n"
			+ "  dat_saisie,\r\n"
			+ "  p_charge,\r\n"
			+ "  dat_p_charge,  \r\n"
			+ "  num_p_charge,   \r\n"
			+ "  nbr_jours, \r\n"
			+ "  num_piece,\r\n"
			+ "  mode_pay,\r\n"
			+ "  annee_bord, \r\n"
			+ "  num_bord_assur,  \r\n"
			+ "  etat_avance_agent,   \r\n"
			+ "  etat_avance_conj,\r\n"
			+ "  dat_avance_conj,\r\n"
			+ "  mnt_avance_conj,\r\n"
			+ "  typ_bult,\r\n"
			+ "  tot_honor_star, \r\n"
			+ "  tot_net_star,   \r\n"
			+ "  tot_mnt_etablis,\r\n"
			+ "  mnt_caa,\r\n"
			+ "  mod_remb_recup,  \r\n"
			+ "  mod_pay_av_agent,\r\n"
			+ "  obs_avance_agent,\r\n"
			+ "  obs_avance_etablis,  \r\n"
			+ "  lib_bord_pc, \r\n"
			+ "  id_bord_pc,  \r\n"
			+ "  etat_avance_etablis, \r\n"
			+ "  num_resume_agent,   \r\n"
			+ "  num_resume_etablis, \r\n"
			+ "  cod_motif,\r\n"
			+ "  mat_agent,  \r\n"
			+ "  docteur, \r\n"
			+ "  cod_user,\r\n"
			+ "  cod_serv,\r\n"
			+ "  cod_dept,\r\n"
			+ "  annee_pec,  \r\n"
			+ "  id_bult_soin\r\n"
			+ "from bult_soin\r\n"
			+ "where cod_soc = :codSoc and mat_pers = :matPers and num_soins = :numSoins",nativeQuery = true)
	public List<BultSoin> getBultSoins(@Param("codSoc") String codSoc,@Param("matPers") String matPers,@Param("numSoins") Integer numSoins);

}
