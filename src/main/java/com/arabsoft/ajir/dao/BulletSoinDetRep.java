package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.arabsoft.ajir.entities.BulletSoinDet;



@Repository
public interface BulletSoinDetRep extends JpaRepository<BulletSoinDet, String>{

		@Query(nativeQuery=true,value="select s.cod_soc,s.mat_pers,p.nom_pers||' '||p.pren_pers nom_prenom,num_soins,dat_soins,cod_etablis,num_bord_etablis,num_bord,annee_envoi,\r\n"
				+ "num_fam_bult,num_ass,cod_prestataire,typ_parent,date_recp,etat_bult,observ,nature_bs,dat_avance_agent,dat_avance_etablis,mode_avanc_agent,\r\n"
				+ "mode_avanc_etablis,mnt_avance_agent,mnt_avance_etablis,dat_entree_etablis,dat_sortie_etablis,valide,dat_valide,tot_honor,\r\n"
				+ "tot_net,nbr_pieces,num_ass_conj,mat_pers_conj,mode_remb,dat_saisie,p_charge,dat_p_charge,num_p_charge,nbr_jours,num_piece,\r\n"
				+ "mode_pay,annee_bord,num_bord_assur,etat_avance_agent,etat_avance_conj,dat_avance_conj,mnt_avance_conj,typ_bult,tot_honor_star,\r\n"
				+ "tot_net_star,tot_mnt_etablis,mnt_caa,mod_remb_recup,mod_pay_av_agent,obs_avance_agent,obs_avance_etablis,lib_bord_pc,id_bord_pc,\r\n"
				+ "etat_avance_etablis,num_resume_agent,num_resume_etablis\r\n"
				+ ",p.cod_motif,pk_get_lib.GET_MOTIF_SORT$LIB_MOTIF(p.cod_motif) position\r\n"
				+ "  ,p.cod_serv,pk_get_lib.GET_SERVICE$LIB_SERV(p.cod_soc,p.cod_serv) affectation,\r\n"
				+ "     annee_pec,id_bult_soin\r\n"
				+ " from bult_soin s,personnel p\r\n"
				+ " where s.cod_soc = p.cod_soc\r\n"
				+ "   and s.mat_pers = p.mat_pers")
			public List<BulletSoinDet> get();

	}