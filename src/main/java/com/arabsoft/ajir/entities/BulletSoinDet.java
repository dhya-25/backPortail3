package com.arabsoft.ajir.entities;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
@Entity
public class BulletSoinDet {
	@Id
	  private String cod_soc;
	   private String mat_pers;
	   @Transient
	   private String nom_prenom;
	   private Long num_soins;
	   private Date dat_soins;
	   private String cod_etablis;
	   private String num_bord_etablis;
	   private Long num_bord;
	   private Long annee_envoi;
	   private Long num_fam_bult;
	   private String num_ass;
	   private String cod_prestataire;
	   private String typ_parent;
	   private Date date_recp;
	   private  String    etat_bult;
	   private  String    observ;
	   private  String    nature_bs;
	   private Date  dat_avance_agent;
	   private Date  dat_avance_etablis;
	   private  String    mode_avanc_agent;
	   private  String    mode_avanc_etablis;
	   private  Long    mnt_avance_agent;
	   private  Long    mnt_avance_etablis;
	   private Date  dat_entree_etablis;
	   private Date  dat_sortie_etablis;
	   private  String    valide;
	   private Date  dat_valide;
	   private Long tot_honor;
	   private Long tot_net;
	   private  Long    nbr_pieces;
	   private String num_ass_conj;
	   private  String    mat_pers_conj;
	   private  String    mode_remb;
	   private Date  dat_saisie;
	   private  String    p_charge;
	   private Date  dat_p_charge;
	   private  Long    num_p_charge;
	   private  Long    nbr_jours;
	   private  String    num_piece;
	   private  String    mode_pay;
	   private  Long    annee_bord;
	   private  Long    num_bord_assur;
	   private  String    etat_avance_agent;
	   private  String    etat_avance_conj;
	   private Date  dat_avance_conj;
	   private  Long    mnt_avance_conj;
	   private  String    typ_bult;
	   private  Long    tot_honor_star;
	   private  Long    tot_net_star;
	   private  Long    tot_mnt_etablis;
	   private  Long    mnt_caa;
	   private  String    mod_remb_recup;
	   private  String    mod_pay_av_agent;
	   private  String    obs_avance_agent;
	   private  String    obs_avance_etablis;
	   private  String    lib_bord_pc;
	   private  String    id_bord_pc;
	   private  String    etat_avance_etablis;
	   private  Long    num_resume_agent;
	   private  Long    num_resume_etablis;
	   private  String   cod_motif;
	   @Transient
	   private  String    position;
	   private  String   cod_serv;
	   @Transient
	   private  String    affectation;
	   private  Long    annee_pec;
	   private  Long    id_bult_soin;
	public String getCod_soc() {
		return cod_soc;
	}
	public void setCod_soc(String cod_soc) {
		this.cod_soc = cod_soc;
	}
	public String getMat_pers() {
		return mat_pers;
	}
	public void setMat_pers(String mat_pers) {
		this.mat_pers = mat_pers;
	}
	public String getNom_prenom() {
		return nom_prenom;
	}
	public void setNom_prenom(String nom_prenom) {
		this.nom_prenom = nom_prenom;
	}
	public Long getNum_soins() {
		return num_soins;
	}
	public void setNum_soins(Long num_soins) {
		this.num_soins = num_soins;
	}
	public Date getDat_soins() {
		return dat_soins;
	}
	public void setDat_soins(Date dat_soins) {
		this.dat_soins = dat_soins;
	}
	public String getCod_etablis() {
		return cod_etablis;
	}
	public void setCod_etablis(String cod_etablis) {
		this.cod_etablis = cod_etablis;
	}
	public String getNum_bord_etablis() {
		return num_bord_etablis;
	}
	public void setNum_bord_etablis(String num_bord_etablis) {
		this.num_bord_etablis = num_bord_etablis;
	}
	public Long getNum_bord() {
		return num_bord;
	}
	public void setNum_bord(Long num_bord) {
		this.num_bord = num_bord;
	}
	public Long getAnnee_envoi() {
		return annee_envoi;
	}
	public void setAnnee_envoi(Long annee_envoi) {
		this.annee_envoi = annee_envoi;
	}
	public Long getNum_fam_bult() {
		return num_fam_bult;
	}
	public void setNum_fam_bult(Long num_fam_bult) {
		this.num_fam_bult = num_fam_bult;
	}
	public String getNum_ass() {
		return num_ass;
	}
	public void setNum_ass(String num_ass) {
		this.num_ass = num_ass;
	}
	public String getCod_prestataire() {
		return cod_prestataire;
	}
	public void setCod_prestataire(String cod_prestataire) {
		this.cod_prestataire = cod_prestataire;
	}
	public String getTyp_parent() {
		return typ_parent;
	}
	public void setTyp_parent(String typ_parent) {
		this.typ_parent = typ_parent;
	}
	public Date getDate_recp() {
		return date_recp;
	}
	public void setDate_recp(Date date_recp) {
		this.date_recp = date_recp;
	}
	public String getEtat_bult() {
		return etat_bult;
	}
	public void setEtat_bult(String etat_bult) {
		this.etat_bult = etat_bult;
	}
	public String getObserv() {
		return observ;
	}
	public void setObserv(String observ) {
		this.observ = observ;
	}
	public String getNature_bs() {
		return nature_bs;
	}
	public void setNature_bs(String nature_bs) {
		this.nature_bs = nature_bs;
	}
	public Date getDat_avance_agent() {
		return dat_avance_agent;
	}
	public void setDat_avance_agent(Date dat_avance_agent) {
		this.dat_avance_agent = dat_avance_agent;
	}
	public Date getDat_avance_etablis() {
		return dat_avance_etablis;
	}
	public void setDat_avance_etablis(Date dat_avance_etablis) {
		this.dat_avance_etablis = dat_avance_etablis;
	}
	public String getMode_avanc_agent() {
		return mode_avanc_agent;
	}
	public void setMode_avanc_agent(String mode_avanc_agent) {
		this.mode_avanc_agent = mode_avanc_agent;
	}
	public String getMode_avanc_etablis() {
		return mode_avanc_etablis;
	}
	public void setMode_avanc_etablis(String mode_avanc_etablis) {
		this.mode_avanc_etablis = mode_avanc_etablis;
	}
	public Long getMnt_avance_agent() {
		return mnt_avance_agent;
	}
	public void setMnt_avance_agent(Long mnt_avance_agent) {
		this.mnt_avance_agent = mnt_avance_agent;
	}
	public Long getMnt_avance_etablis() {
		return mnt_avance_etablis;
	}
	public void setMnt_avance_etablis(Long mnt_avance_etablis) {
		this.mnt_avance_etablis = mnt_avance_etablis;
	}
	public Date getDat_entree_etablis() {
		return dat_entree_etablis;
	}
	public void setDat_entree_etablis(Date dat_entree_etablis) {
		this.dat_entree_etablis = dat_entree_etablis;
	}
	public Date getDat_sortie_etablis() {
		return dat_sortie_etablis;
	}
	public void setDat_sortie_etablis(Date dat_sortie_etablis) {
		this.dat_sortie_etablis = dat_sortie_etablis;
	}
	public String getValide() {
		return valide;
	}
	public void setValide(String valide) {
		this.valide = valide;
	}
	public Date getDat_valide() {
		return dat_valide;
	}
	public void setDat_valide(Date dat_valide) {
		this.dat_valide = dat_valide;
	}
	public Long getTot_honor() {
		return tot_honor;
	}
	public void setTot_honor(Long tot_honor) {
		this.tot_honor = tot_honor;
	}
	public Long getTot_net() {
		return tot_net;
	}
	public void setTot_net(Long tot_net) {
		this.tot_net = tot_net;
	}
	public Long getNbr_pieces() {
		return nbr_pieces;
	}
	public void setNbr_pieces(Long nbr_pieces) {
		this.nbr_pieces = nbr_pieces;
	}
	public String getNum_ass_conj() {
		return num_ass_conj;
	}
	public void setNum_ass_conj(String num_ass_conj) {
		this.num_ass_conj = num_ass_conj;
	}
	public String getMat_pers_conj() {
		return mat_pers_conj;
	}
	public void setMat_pers_conj(String mat_pers_conj) {
		this.mat_pers_conj = mat_pers_conj;
	}
	public String getMode_remb() {
		return mode_remb;
	}
	public void setMode_remb(String mode_remb) {
		this.mode_remb = mode_remb;
	}
	public Date getDat_saisie() {
		return dat_saisie;
	}
	public void setDat_saisie(Date dat_saisie) {
		this.dat_saisie = dat_saisie;
	}
	public String getP_charge() {
		return p_charge;
	}
	public void setP_charge(String p_charge) {
		this.p_charge = p_charge;
	}
	public Date getDat_p_charge() {
		return dat_p_charge;
	}
	public void setDat_p_charge(Date dat_p_charge) {
		this.dat_p_charge = dat_p_charge;
	}
	public Long getNum_p_charge() {
		return num_p_charge;
	}
	public void setNum_p_charge(Long num_p_charge) {
		this.num_p_charge = num_p_charge;
	}
	public Long getNbr_jours() {
		return nbr_jours;
	}
	public void setNbr_jours(Long nbr_jours) {
		this.nbr_jours = nbr_jours;
	}
	public String getNum_piece() {
		return num_piece;
	}
	public void setNum_piece(String num_piece) {
		this.num_piece = num_piece;
	}
	public String getMode_pay() {
		return mode_pay;
	}
	public void setMode_pay(String mode_pay) {
		this.mode_pay = mode_pay;
	}
	public Long getAnnee_bord() {
		return annee_bord;
	}
	public void setAnnee_bord(Long annee_bord) {
		this.annee_bord = annee_bord;
	}
	public Long getNum_bord_assur() {
		return num_bord_assur;
	}
	public void setNum_bord_assur(Long num_bord_assur) {
		this.num_bord_assur = num_bord_assur;
	}
	public String getEtat_avance_agent() {
		return etat_avance_agent;
	}
	public void setEtat_avance_agent(String etat_avance_agent) {
		this.etat_avance_agent = etat_avance_agent;
	}
	public String getEtat_avance_conj() {
		return etat_avance_conj;
	}
	public void setEtat_avance_conj(String etat_avance_conj) {
		this.etat_avance_conj = etat_avance_conj;
	}
	public Date getDat_avance_conj() {
		return dat_avance_conj;
	}
	public void setDat_avance_conj(Date dat_avance_conj) {
		this.dat_avance_conj = dat_avance_conj;
	}
	public Long getMnt_avance_conj() {
		return mnt_avance_conj;
	}
	public void setMnt_avance_conj(Long mnt_avance_conj) {
		this.mnt_avance_conj = mnt_avance_conj;
	}
	public String getTyp_bult() {
		return typ_bult;
	}
	public void setTyp_bult(String typ_bult) {
		this.typ_bult = typ_bult;
	}
	public Long getTot_honor_star() {
		return tot_honor_star;
	}
	public void setTot_honor_star(Long tot_honor_star) {
		this.tot_honor_star = tot_honor_star;
	}
	public Long getTot_net_star() {
		return tot_net_star;
	}
	public void setTot_net_star(Long tot_net_star) {
		this.tot_net_star = tot_net_star;
	}
	public Long getTot_mnt_etablis() {
		return tot_mnt_etablis;
	}
	public void setTot_mnt_etablis(Long tot_mnt_etablis) {
		this.tot_mnt_etablis = tot_mnt_etablis;
	}
	public Long getMnt_caa() {
		return mnt_caa;
	}
	public void setMnt_caa(Long mnt_caa) {
		this.mnt_caa = mnt_caa;
	}
	public String getMod_remb_recup() {
		return mod_remb_recup;
	}
	public void setMod_remb_recup(String mod_remb_recup) {
		this.mod_remb_recup = mod_remb_recup;
	}
	public String getMod_pay_av_agent() {
		return mod_pay_av_agent;
	}
	public void setMod_pay_av_agent(String mod_pay_av_agent) {
		this.mod_pay_av_agent = mod_pay_av_agent;
	}
	public String getObs_avance_agent() {
		return obs_avance_agent;
	}
	public void setObs_avance_agent(String obs_avance_agent) {
		this.obs_avance_agent = obs_avance_agent;
	}
	public String getObs_avance_etablis() {
		return obs_avance_etablis;
	}
	public void setObs_avance_etablis(String obs_avance_etablis) {
		this.obs_avance_etablis = obs_avance_etablis;
	}
	public String getLib_bord_pc() {
		return lib_bord_pc;
	}
	public void setLib_bord_pc(String lib_bord_pc) {
		this.lib_bord_pc = lib_bord_pc;
	}
	public String getId_bord_pc() {
		return id_bord_pc;
	}
	public void setId_bord_pc(String id_bord_pc) {
		this.id_bord_pc = id_bord_pc;
	}
	public String getEtat_avance_etablis() {
		return etat_avance_etablis;
	}
	public void setEtat_avance_etablis(String etat_avance_etablis) {
		this.etat_avance_etablis = etat_avance_etablis;
	}
	public Long getNum_resume_agent() {
		return num_resume_agent;
	}
	public void setNum_resume_agent(Long num_resume_agent) {
		this.num_resume_agent = num_resume_agent;
	}
	public Long getNum_resume_etablis() {
		return num_resume_etablis;
	}
	public void setNum_resume_etablis(Long num_resume_etablis) {
		this.num_resume_etablis = num_resume_etablis;
	}
	public String getCod_motif() {
		return cod_motif;
	}
	public void setCod_motif(String cod_motif) {
		this.cod_motif = cod_motif;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getCod_serv() {
		return cod_serv;
	}
	public void setCod_serv(String cod_serv) {
		this.cod_serv = cod_serv;
	}
	public String getAffectation() {
		return affectation;
	}
	public void setAffectation(String affectation) {
		this.affectation = affectation;
	}
	public Long getAnnee_pec() {
		return annee_pec;
	}
	public void setAnnee_pec(Long annee_pec) {
		this.annee_pec = annee_pec;
	}
	public Long getId_bult_soin() {
		return id_bult_soin;
	}
	public void setId_bult_soin(Long id_bult_soin) {
		this.id_bult_soin = id_bult_soin;
	}
	public BulletSoinDet(String cod_soc, String mat_pers, String nom_prenom, Long num_soins, Date dat_soins,
			String cod_etablis, String num_bord_etablis, Long num_bord, Long annee_envoi, Long num_fam_bult,
			String num_ass, String cod_prestataire, String typ_parent, Date date_recp, String etat_bult, String observ,
			String nature_bs, Date dat_avance_agent, Date dat_avance_etablis, String mode_avanc_agent,
			String mode_avanc_etablis, Long mnt_avance_agent, Long mnt_avance_etablis, Date dat_entree_etablis,
			Date dat_sortie_etablis, String valide, Date dat_valide, Long tot_honor, Long tot_net, Long nbr_pieces,
			String num_ass_conj, String mat_pers_conj, String mode_remb, Date dat_saisie, String p_charge,
			Date dat_p_charge, Long num_p_charge, Long nbr_jours, String num_piece, String mode_pay, Long annee_bord,
			Long num_bord_assur, String etat_avance_agent, String etat_avance_conj, Date dat_avance_conj,
			Long mnt_avance_conj, String typ_bult, Long tot_honor_star, Long tot_net_star, Long tot_mnt_etablis,
			Long mnt_caa, String mod_remb_recup, String mod_pay_av_agent, String obs_avance_agent,
			String obs_avance_etablis, String lib_bord_pc, String id_bord_pc, String etat_avance_etablis,
			Long num_resume_agent, Long num_resume_etablis, String cod_motif, String position, String cod_serv,
			String affectation, Long annee_pec, Long id_bult_soin) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.nom_prenom = nom_prenom;
		this.num_soins = num_soins;
		this.dat_soins = dat_soins;
		this.cod_etablis = cod_etablis;
		this.num_bord_etablis = num_bord_etablis;
		this.num_bord = num_bord;
		this.annee_envoi = annee_envoi;
		this.num_fam_bult = num_fam_bult;
		this.num_ass = num_ass;
		this.cod_prestataire = cod_prestataire;
		this.typ_parent = typ_parent;
		this.date_recp = date_recp;
		this.etat_bult = etat_bult;
		this.observ = observ;
		this.nature_bs = nature_bs;
		this.dat_avance_agent = dat_avance_agent;
		this.dat_avance_etablis = dat_avance_etablis;
		this.mode_avanc_agent = mode_avanc_agent;
		this.mode_avanc_etablis = mode_avanc_etablis;
		this.mnt_avance_agent = mnt_avance_agent;
		this.mnt_avance_etablis = mnt_avance_etablis;
		this.dat_entree_etablis = dat_entree_etablis;
		this.dat_sortie_etablis = dat_sortie_etablis;
		this.valide = valide;
		this.dat_valide = dat_valide;
		this.tot_honor = tot_honor;
		this.tot_net = tot_net;
		this.nbr_pieces = nbr_pieces;
		this.num_ass_conj = num_ass_conj;
		this.mat_pers_conj = mat_pers_conj;
		this.mode_remb = mode_remb;
		this.dat_saisie = dat_saisie;
		this.p_charge = p_charge;
		this.dat_p_charge = dat_p_charge;
		this.num_p_charge = num_p_charge;
		this.nbr_jours = nbr_jours;
		this.num_piece = num_piece;
		this.mode_pay = mode_pay;
		this.annee_bord = annee_bord;
		this.num_bord_assur = num_bord_assur;
		this.etat_avance_agent = etat_avance_agent;
		this.etat_avance_conj = etat_avance_conj;
		this.dat_avance_conj = dat_avance_conj;
		this.mnt_avance_conj = mnt_avance_conj;
		this.typ_bult = typ_bult;
		this.tot_honor_star = tot_honor_star;
		this.tot_net_star = tot_net_star;
		this.tot_mnt_etablis = tot_mnt_etablis;
		this.mnt_caa = mnt_caa;
		this.mod_remb_recup = mod_remb_recup;
		this.mod_pay_av_agent = mod_pay_av_agent;
		this.obs_avance_agent = obs_avance_agent;
		this.obs_avance_etablis = obs_avance_etablis;
		this.lib_bord_pc = lib_bord_pc;
		this.id_bord_pc = id_bord_pc;
		this.etat_avance_etablis = etat_avance_etablis;
		this.num_resume_agent = num_resume_agent;
		this.num_resume_etablis = num_resume_etablis;
		this.cod_motif = cod_motif;
		this.position = position;
		this.cod_serv = cod_serv;
		this.affectation = affectation;
		this.annee_pec = annee_pec;
		this.id_bult_soin = id_bult_soin;
	}
	public BulletSoinDet() {
		super();
		// TODO Auto-generated constructor stub
	}
	   
	   
	   
}
