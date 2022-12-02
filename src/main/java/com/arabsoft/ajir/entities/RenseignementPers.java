package com.arabsoft.ajir.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@IdClass(RenseignementPersID.class)
public class RenseignementPers {
	
	@Id
	@JsonProperty(access = Access.WRITE_ONLY)
	private String cod_soc;
	@Id
	@JsonProperty(access = Access.WRITE_ONLY)
	private String mat_pers;
	private String reg_cng;
	private String cod_cycl;
	private String sal_neg;
	private String taux_imp;
	private String regime_trav;
	private Integer droit_lait;
	private String cod_reg;
	private String nat_reg;
	private String comp_cng;
	private String code_comp_cng;
	private String reg_post;
	private String cod_equip;
	private String pointe;
	private Integer anc_pers;
	private Integer regime_heur;
	private String pers_clog;
	private String pers_celec;
	private String pers_cvoit;
	private String pers_ceau;
	private String code_cchauf;
	private String code_residence;
	private String prim_adm_para;
	private String code_pelerinage;
	private String coef_ptrim;
	private Float taux_imp_ptrim;
	private String art40;
	private String cod_grp;
	private String cod_sgrp;
	private String ind_domest;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dat_art40;
	private String uniform;
	private Integer anc_pers_tit;
	private String cod_group;
	private String num_pointeuse;
	private String pointe_libre;
	private String cod_grp_point;
	private String signature;
	private String cod_bareme;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dat_deb_assur;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dat_fin_assur;
	private String f_mojhd_chehid;
	private Integer iep_mojhd_chehid;
	private Integer iep_hors_bea;
	private String contrat_fidelite;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dt_deb_fidelite;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dt_fin_fidelite;
	private String cod_memb;
	private Float mnt_param;
	private String bon_rest;
	private String compte_proced_judic;
	private String benef_proced_judic;
	private String benef;
	private String compte_herit;
	private String nom_pers_cnss;
	private Integer avc;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dat_avq;
	private Integer avq;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dat_avc;
	private String trs;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dat_trs;
	private String cod_excep;
	private String cod_pay;
	private String sit_cheq;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dat_sit_cheq;
	private String cod_bat;
	private String cod_bur;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dat_encad;
	private String fonct;
	private Integer id_renseignement_pers;
	private Integer cod_etab_det;
	private Integer cod_etab_org;
	private String cod_sec;
	private String cod_user;
	@Column(insertable = false, updatable = false)
	private String lib_regime;
	@Column(insertable = false, updatable = false)

	private String lib_regimecng;
	@Column(insertable = false, updatable = false)

	private String deb_cycle;
	@Column(insertable = false, updatable = false)

	private String fin_cycle;
	@Column(insertable = false, updatable = false)

	private String lib_residence;
	@Column(insertable = false, updatable = false)

	private String lib_lait;
	@Column(insertable = false, updatable = false)

	private String lib_CCHAUF;
	@Column(insertable = false, updatable = false)

	private String lib_eau;
	@Column(insertable = false, updatable = false)

	private String lib_cvoit;
	@Column(insertable = false, updatable = false)

	private String lib_clog;
	@Column(insertable = false, updatable = false)

	private String lib_celec;
	@Column(insertable = false, updatable = false)

	private String lib_dom ;
	@Column(insertable = false, updatable = false)

	private String lib_uniform;
	
	
	
	
	
	
	
	
	
	public RenseignementPers(String cod_soc, String mat_pers, String reg_cng, String cod_cycl, String sal_neg,
			String taux_imp, String regime_trav, Integer droit_lait, String cod_reg, String nat_reg, String comp_cng,
			String code_comp_cng, String reg_post, String cod_equip, String pointe, Integer anc_pers,
			Integer regime_heur, String pers_clog, String pers_celec, String pers_cvoit, String pers_ceau,
			String code_cchauf, String code_residence, String prim_adm_para, String code_pelerinage, String coef_ptrim,
			Float taux_imp_ptrim, String art40, String cod_grp, String cod_sgrp, String ind_domest, Date dat_art40,
			String uniform, Integer anc_pers_tit, String cod_group, String num_pointeuse, String pointe_libre,
			String cod_grp_point, String signature, String cod_bareme, Date dat_deb_assur, Date dat_fin_assur,
			String f_mojhd_chehid, Integer iep_mojhd_chehid, Integer iep_hors_bea, String contrat_fidelite,
			Date dt_deb_fidelite, Date dt_fin_fidelite, String cod_memb, Float mnt_param, String bon_rest,
			String compte_proced_judic, String benef_proced_judic, String benef, String compte_herit,
			String nom_pers_cnss, Integer avc, Date dat_avq, Integer avq, Date dat_avc, String trs, Date dat_trs,
			String cod_excep, String cod_pay, String sit_cheq, Date dat_sit_cheq, String cod_bat, String cod_bur,
			Date dat_encad, String fonct, Integer id_renseignement_pers, Integer cod_etab_det, Integer cod_etab_org,
			String cod_sec, String cod_user, String lib_regime, String lib_regimecng, String deb_cycle,
			String fin_cycle, String lib_residence, String lib_lait, String lib_CCHAUF, String lib_eau,
			String lib_cvoit, String lib_clog, String lib_celec, String lib_dom, String lib_uniform) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.reg_cng = reg_cng;
		this.cod_cycl = cod_cycl;
		this.sal_neg = sal_neg;
		this.taux_imp = taux_imp;
		this.regime_trav = regime_trav;
		this.droit_lait = droit_lait;
		this.cod_reg = cod_reg;
		this.nat_reg = nat_reg;
		this.comp_cng = comp_cng;
		this.code_comp_cng = code_comp_cng;
		this.reg_post = reg_post;
		this.cod_equip = cod_equip;
		this.pointe = pointe;
		this.anc_pers = anc_pers;
		this.regime_heur = regime_heur;
		this.pers_clog = pers_clog;
		this.pers_celec = pers_celec;
		this.pers_cvoit = pers_cvoit;
		this.pers_ceau = pers_ceau;
		this.code_cchauf = code_cchauf;
		this.code_residence = code_residence;
		this.prim_adm_para = prim_adm_para;
		this.code_pelerinage = code_pelerinage;
		this.coef_ptrim = coef_ptrim;
		this.taux_imp_ptrim = taux_imp_ptrim;
		this.art40 = art40;
		this.cod_grp = cod_grp;
		this.cod_sgrp = cod_sgrp;
		this.ind_domest = ind_domest;
		this.dat_art40 = dat_art40;
		this.uniform = uniform;
		this.anc_pers_tit = anc_pers_tit;
		this.cod_group = cod_group;
		this.num_pointeuse = num_pointeuse;
		this.pointe_libre = pointe_libre;
		this.cod_grp_point = cod_grp_point;
		this.signature = signature;
		this.cod_bareme = cod_bareme;
		this.dat_deb_assur = dat_deb_assur;
		this.dat_fin_assur = dat_fin_assur;
		this.f_mojhd_chehid = f_mojhd_chehid;
		this.iep_mojhd_chehid = iep_mojhd_chehid;
		this.iep_hors_bea = iep_hors_bea;
		this.contrat_fidelite = contrat_fidelite;
		this.dt_deb_fidelite = dt_deb_fidelite;
		this.dt_fin_fidelite = dt_fin_fidelite;
		this.cod_memb = cod_memb;
		this.mnt_param = mnt_param;
		this.bon_rest = bon_rest;
		this.compte_proced_judic = compte_proced_judic;
		this.benef_proced_judic = benef_proced_judic;
		this.benef = benef;
		this.compte_herit = compte_herit;
		this.nom_pers_cnss = nom_pers_cnss;
		this.avc = avc;
		this.dat_avq = dat_avq;
		this.avq = avq;
		this.dat_avc = dat_avc;
		this.trs = trs;
		this.dat_trs = dat_trs;
		this.cod_excep = cod_excep;
		this.cod_pay = cod_pay;
		this.sit_cheq = sit_cheq;
		this.dat_sit_cheq = dat_sit_cheq;
		this.cod_bat = cod_bat;
		this.cod_bur = cod_bur;
		this.dat_encad = dat_encad;
		this.fonct = fonct;
		this.id_renseignement_pers = id_renseignement_pers;
		this.cod_etab_det = cod_etab_det;
		this.cod_etab_org = cod_etab_org;
		this.cod_sec = cod_sec;
		this.cod_user = cod_user;
		this.lib_regime = lib_regime;
		this.lib_regimecng = lib_regimecng;
		this.deb_cycle = deb_cycle;
		this.fin_cycle = fin_cycle;
		this.lib_residence = lib_residence;
		this.lib_lait = lib_lait;
		this.lib_CCHAUF = lib_CCHAUF;
		this.lib_eau = lib_eau;
		this.lib_cvoit = lib_cvoit;
		this.lib_clog = lib_clog;
		this.lib_celec = lib_celec;
		this.lib_dom = lib_dom;
		this.lib_uniform = lib_uniform;
	}

	public String getLib_uniform() {
		return lib_uniform;
	}

	public void setLib_uniform(String lib_uniform) {
		this.lib_uniform = lib_uniform;
	}

	public RenseignementPers(String cod_soc, String mat_pers, String reg_cng, String cod_cycl, String sal_neg,
			String taux_imp, String regime_trav, Integer droit_lait, String cod_reg, String nat_reg, String comp_cng,
			String code_comp_cng, String reg_post, String cod_equip, String pointe, Integer anc_pers,
			Integer regime_heur, String pers_clog, String pers_celec, String pers_cvoit, String pers_ceau,
			String code_cchauf, String code_residence, String prim_adm_para, String code_pelerinage, String coef_ptrim,
			Float taux_imp_ptrim, String art40, String cod_grp, String cod_sgrp, String ind_domest, Date dat_art40,
			String uniform, Integer anc_pers_tit, String cod_group, String num_pointeuse, String pointe_libre,
			String cod_grp_point, String signature, String cod_bareme, Date dat_deb_assur, Date dat_fin_assur,
			String f_mojhd_chehid, Integer iep_mojhd_chehid, Integer iep_hors_bea, String contrat_fidelite,
			Date dt_deb_fidelite, Date dt_fin_fidelite, String cod_memb, Float mnt_param, String bon_rest,
			String compte_proced_judic, String benef_proced_judic, String benef, String compte_herit,
			String nom_pers_cnss, Integer avc, Date dat_avq, Integer avq, Date dat_avc, String trs, Date dat_trs,
			String cod_excep, String cod_pay, String sit_cheq, Date dat_sit_cheq, String cod_bat, String cod_bur,
			Date dat_encad, String fonct, Integer id_renseignement_pers, Integer cod_etab_det, Integer cod_etab_org,
			String cod_sec, String cod_user, String lib_regime, String lib_regimecng, String deb_cycle,
			String fin_cycle, String lib_residence, String lib_lait, String lib_CCHAUF, String lib_eau,
			String lib_cvoit, String lib_clog, String lib_celec, String lib_dom) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.reg_cng = reg_cng;
		this.cod_cycl = cod_cycl;
		this.sal_neg = sal_neg;
		this.taux_imp = taux_imp;
		this.regime_trav = regime_trav;
		this.droit_lait = droit_lait;
		this.cod_reg = cod_reg;
		this.nat_reg = nat_reg;
		this.comp_cng = comp_cng;
		this.code_comp_cng = code_comp_cng;
		this.reg_post = reg_post;
		this.cod_equip = cod_equip;
		this.pointe = pointe;
		this.anc_pers = anc_pers;
		this.regime_heur = regime_heur;
		this.pers_clog = pers_clog;
		this.pers_celec = pers_celec;
		this.pers_cvoit = pers_cvoit;
		this.pers_ceau = pers_ceau;
		this.code_cchauf = code_cchauf;
		this.code_residence = code_residence;
		this.prim_adm_para = prim_adm_para;
		this.code_pelerinage = code_pelerinage;
		this.coef_ptrim = coef_ptrim;
		this.taux_imp_ptrim = taux_imp_ptrim;
		this.art40 = art40;
		this.cod_grp = cod_grp;
		this.cod_sgrp = cod_sgrp;
		this.ind_domest = ind_domest;
		this.dat_art40 = dat_art40;
		this.uniform = uniform;
		this.anc_pers_tit = anc_pers_tit;
		this.cod_group = cod_group;
		this.num_pointeuse = num_pointeuse;
		this.pointe_libre = pointe_libre;
		this.cod_grp_point = cod_grp_point;
		this.signature = signature;
		this.cod_bareme = cod_bareme;
		this.dat_deb_assur = dat_deb_assur;
		this.dat_fin_assur = dat_fin_assur;
		this.f_mojhd_chehid = f_mojhd_chehid;
		this.iep_mojhd_chehid = iep_mojhd_chehid;
		this.iep_hors_bea = iep_hors_bea;
		this.contrat_fidelite = contrat_fidelite;
		this.dt_deb_fidelite = dt_deb_fidelite;
		this.dt_fin_fidelite = dt_fin_fidelite;
		this.cod_memb = cod_memb;
		this.mnt_param = mnt_param;
		this.bon_rest = bon_rest;
		this.compte_proced_judic = compte_proced_judic;
		this.benef_proced_judic = benef_proced_judic;
		this.benef = benef;
		this.compte_herit = compte_herit;
		this.nom_pers_cnss = nom_pers_cnss;
		this.avc = avc;
		this.dat_avq = dat_avq;
		this.avq = avq;
		this.dat_avc = dat_avc;
		this.trs = trs;
		this.dat_trs = dat_trs;
		this.cod_excep = cod_excep;
		this.cod_pay = cod_pay;
		this.sit_cheq = sit_cheq;
		this.dat_sit_cheq = dat_sit_cheq;
		this.cod_bat = cod_bat;
		this.cod_bur = cod_bur;
		this.dat_encad = dat_encad;
		this.fonct = fonct;
		this.id_renseignement_pers = id_renseignement_pers;
		this.cod_etab_det = cod_etab_det;
		this.cod_etab_org = cod_etab_org;
		this.cod_sec = cod_sec;
		this.cod_user = cod_user;
		this.lib_regime = lib_regime;
		this.lib_regimecng = lib_regimecng;
		this.deb_cycle = deb_cycle;
		this.fin_cycle = fin_cycle;
		this.lib_residence = lib_residence;
		this.lib_lait = lib_lait;
		this.lib_CCHAUF = lib_CCHAUF;
		this.lib_eau = lib_eau;
		this.lib_cvoit = lib_cvoit;
		this.lib_clog = lib_clog;
		this.lib_celec = lib_celec;
		this.lib_dom = lib_dom;
	}
	
	public String getLib_dom() {
		return lib_dom;
	}
	public void setLib_dom(String lib_dom) {
		this.lib_dom = lib_dom;
	}
	public String getLib_celec() {
		return lib_celec;
	}
	public void setLib_celec(String lib_celec) {
		this.lib_celec = lib_celec;
	}
	public RenseignementPers(String cod_soc, String mat_pers, String reg_cng, String cod_cycl, String sal_neg,
			String taux_imp, String regime_trav, Integer droit_lait, String cod_reg, String nat_reg, String comp_cng,
			String code_comp_cng, String reg_post, String cod_equip, String pointe, Integer anc_pers,
			Integer regime_heur, String pers_clog, String pers_celec, String pers_cvoit, String pers_ceau,
			String code_cchauf, String code_residence, String prim_adm_para, String code_pelerinage, String coef_ptrim,
			Float taux_imp_ptrim, String art40, String cod_grp, String cod_sgrp, String ind_domest, Date dat_art40,
			String uniform, Integer anc_pers_tit, String cod_group, String num_pointeuse, String pointe_libre,
			String cod_grp_point, String signature, String cod_bareme, Date dat_deb_assur, Date dat_fin_assur,
			String f_mojhd_chehid, Integer iep_mojhd_chehid, Integer iep_hors_bea, String contrat_fidelite,
			Date dt_deb_fidelite, Date dt_fin_fidelite, String cod_memb, Float mnt_param, String bon_rest,
			String compte_proced_judic, String benef_proced_judic, String benef, String compte_herit,
			String nom_pers_cnss, Integer avc, Date dat_avq, Integer avq, Date dat_avc, String trs, Date dat_trs,
			String cod_excep, String cod_pay, String sit_cheq, Date dat_sit_cheq, String cod_bat, String cod_bur,
			Date dat_encad, String fonct, Integer id_renseignement_pers, Integer cod_etab_det, Integer cod_etab_org,
			String cod_sec, String cod_user, String lib_regime, String lib_regimecng, String deb_cycle,
			String fin_cycle, String lib_residence, String lib_lait, String lib_CCHAUF, String lib_eau,
			String lib_cvoit, String lib_clog) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.reg_cng = reg_cng;
		this.cod_cycl = cod_cycl;
		this.sal_neg = sal_neg;
		this.taux_imp = taux_imp;
		this.regime_trav = regime_trav;
		this.droit_lait = droit_lait;
		this.cod_reg = cod_reg;
		this.nat_reg = nat_reg;
		this.comp_cng = comp_cng;
		this.code_comp_cng = code_comp_cng;
		this.reg_post = reg_post;
		this.cod_equip = cod_equip;
		this.pointe = pointe;
		this.anc_pers = anc_pers;
		this.regime_heur = regime_heur;
		this.pers_clog = pers_clog;
		this.pers_celec = pers_celec;
		this.pers_cvoit = pers_cvoit;
		this.pers_ceau = pers_ceau;
		this.code_cchauf = code_cchauf;
		this.code_residence = code_residence;
		this.prim_adm_para = prim_adm_para;
		this.code_pelerinage = code_pelerinage;
		this.coef_ptrim = coef_ptrim;
		this.taux_imp_ptrim = taux_imp_ptrim;
		this.art40 = art40;
		this.cod_grp = cod_grp;
		this.cod_sgrp = cod_sgrp;
		this.ind_domest = ind_domest;
		this.dat_art40 = dat_art40;
		this.uniform = uniform;
		this.anc_pers_tit = anc_pers_tit;
		this.cod_group = cod_group;
		this.num_pointeuse = num_pointeuse;
		this.pointe_libre = pointe_libre;
		this.cod_grp_point = cod_grp_point;
		this.signature = signature;
		this.cod_bareme = cod_bareme;
		this.dat_deb_assur = dat_deb_assur;
		this.dat_fin_assur = dat_fin_assur;
		this.f_mojhd_chehid = f_mojhd_chehid;
		this.iep_mojhd_chehid = iep_mojhd_chehid;
		this.iep_hors_bea = iep_hors_bea;
		this.contrat_fidelite = contrat_fidelite;
		this.dt_deb_fidelite = dt_deb_fidelite;
		this.dt_fin_fidelite = dt_fin_fidelite;
		this.cod_memb = cod_memb;
		this.mnt_param = mnt_param;
		this.bon_rest = bon_rest;
		this.compte_proced_judic = compte_proced_judic;
		this.benef_proced_judic = benef_proced_judic;
		this.benef = benef;
		this.compte_herit = compte_herit;
		this.nom_pers_cnss = nom_pers_cnss;
		this.avc = avc;
		this.dat_avq = dat_avq;
		this.avq = avq;
		this.dat_avc = dat_avc;
		this.trs = trs;
		this.dat_trs = dat_trs;
		this.cod_excep = cod_excep;
		this.cod_pay = cod_pay;
		this.sit_cheq = sit_cheq;
		this.dat_sit_cheq = dat_sit_cheq;
		this.cod_bat = cod_bat;
		this.cod_bur = cod_bur;
		this.dat_encad = dat_encad;
		this.fonct = fonct;
		this.id_renseignement_pers = id_renseignement_pers;
		this.cod_etab_det = cod_etab_det;
		this.cod_etab_org = cod_etab_org;
		this.cod_sec = cod_sec;
		this.cod_user = cod_user;
		this.lib_regime = lib_regime;
		this.lib_regimecng = lib_regimecng;
		this.deb_cycle = deb_cycle;
		this.fin_cycle = fin_cycle;
		this.lib_residence = lib_residence;
		this.lib_lait = lib_lait;
		this.lib_CCHAUF = lib_CCHAUF;
		this.lib_eau = lib_eau;
		this.lib_cvoit = lib_cvoit;
		this.lib_clog = lib_clog;
	}
	public String getLib_cvoit() {
		return lib_cvoit;
	}
	public void setLib_cvoit(String lib_cvoit) {
		this.lib_cvoit = lib_cvoit;
	}
	public String getLib_clog() {
		return lib_clog;
	}
	public void setLib_clog(String lib_clog) {
		this.lib_clog = lib_clog;
	}
	public RenseignementPers(String cod_soc, String mat_pers, String reg_cng, String cod_cycl, String sal_neg,
			String taux_imp, String regime_trav, Integer droit_lait, String cod_reg, String nat_reg, String comp_cng,
			String code_comp_cng, String reg_post, String cod_equip, String pointe, Integer anc_pers,
			Integer regime_heur, String pers_clog, String pers_celec, String pers_cvoit, String pers_ceau,
			String code_cchauf, String code_residence, String prim_adm_para, String code_pelerinage, String coef_ptrim,
			Float taux_imp_ptrim, String art40, String cod_grp, String cod_sgrp, String ind_domest, Date dat_art40,
			String uniform, Integer anc_pers_tit, String cod_group, String num_pointeuse, String pointe_libre,
			String cod_grp_point, String signature, String cod_bareme, Date dat_deb_assur, Date dat_fin_assur,
			String f_mojhd_chehid, Integer iep_mojhd_chehid, Integer iep_hors_bea, String contrat_fidelite,
			Date dt_deb_fidelite, Date dt_fin_fidelite, String cod_memb, Float mnt_param, String bon_rest,
			String compte_proced_judic, String benef_proced_judic, String benef, String compte_herit,
			String nom_pers_cnss, Integer avc, Date dat_avq, Integer avq, Date dat_avc, String trs, Date dat_trs,
			String cod_excep, String cod_pay, String sit_cheq, Date dat_sit_cheq, String cod_bat, String cod_bur,
			Date dat_encad, String fonct, Integer id_renseignement_pers, Integer cod_etab_det, Integer cod_etab_org,
			String cod_sec, String cod_user, String lib_regime, String lib_regimecng, String deb_cycle,
			String fin_cycle, String lib_residence, String lib_lait, String lib_CCHAUF, String lib_eau) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.reg_cng = reg_cng;
		this.cod_cycl = cod_cycl;
		this.sal_neg = sal_neg;
		this.taux_imp = taux_imp;
		this.regime_trav = regime_trav;
		this.droit_lait = droit_lait;
		this.cod_reg = cod_reg;
		this.nat_reg = nat_reg;
		this.comp_cng = comp_cng;
		this.code_comp_cng = code_comp_cng;
		this.reg_post = reg_post;
		this.cod_equip = cod_equip;
		this.pointe = pointe;
		this.anc_pers = anc_pers;
		this.regime_heur = regime_heur;
		this.pers_clog = pers_clog;
		this.pers_celec = pers_celec;
		this.pers_cvoit = pers_cvoit;
		this.pers_ceau = pers_ceau;
		this.code_cchauf = code_cchauf;
		this.code_residence = code_residence;
		this.prim_adm_para = prim_adm_para;
		this.code_pelerinage = code_pelerinage;
		this.coef_ptrim = coef_ptrim;
		this.taux_imp_ptrim = taux_imp_ptrim;
		this.art40 = art40;
		this.cod_grp = cod_grp;
		this.cod_sgrp = cod_sgrp;
		this.ind_domest = ind_domest;
		this.dat_art40 = dat_art40;
		this.uniform = uniform;
		this.anc_pers_tit = anc_pers_tit;
		this.cod_group = cod_group;
		this.num_pointeuse = num_pointeuse;
		this.pointe_libre = pointe_libre;
		this.cod_grp_point = cod_grp_point;
		this.signature = signature;
		this.cod_bareme = cod_bareme;
		this.dat_deb_assur = dat_deb_assur;
		this.dat_fin_assur = dat_fin_assur;
		this.f_mojhd_chehid = f_mojhd_chehid;
		this.iep_mojhd_chehid = iep_mojhd_chehid;
		this.iep_hors_bea = iep_hors_bea;
		this.contrat_fidelite = contrat_fidelite;
		this.dt_deb_fidelite = dt_deb_fidelite;
		this.dt_fin_fidelite = dt_fin_fidelite;
		this.cod_memb = cod_memb;
		this.mnt_param = mnt_param;
		this.bon_rest = bon_rest;
		this.compte_proced_judic = compte_proced_judic;
		this.benef_proced_judic = benef_proced_judic;
		this.benef = benef;
		this.compte_herit = compte_herit;
		this.nom_pers_cnss = nom_pers_cnss;
		this.avc = avc;
		this.dat_avq = dat_avq;
		this.avq = avq;
		this.dat_avc = dat_avc;
		this.trs = trs;
		this.dat_trs = dat_trs;
		this.cod_excep = cod_excep;
		this.cod_pay = cod_pay;
		this.sit_cheq = sit_cheq;
		this.dat_sit_cheq = dat_sit_cheq;
		this.cod_bat = cod_bat;
		this.cod_bur = cod_bur;
		this.dat_encad = dat_encad;
		this.fonct = fonct;
		this.id_renseignement_pers = id_renseignement_pers;
		this.cod_etab_det = cod_etab_det;
		this.cod_etab_org = cod_etab_org;
		this.cod_sec = cod_sec;
		this.cod_user = cod_user;
		this.lib_regime = lib_regime;
		this.lib_regimecng = lib_regimecng;
		this.deb_cycle = deb_cycle;
		this.fin_cycle = fin_cycle;
		this.lib_residence = lib_residence;
		this.lib_lait = lib_lait;
		this.lib_CCHAUF = lib_CCHAUF;
		this.lib_eau = lib_eau;
	}
	public String getLib_eau() {
		return lib_eau;
	}
	public void setLib_eau(String lib_eau) {
		this.lib_eau = lib_eau;
	}
	public RenseignementPers(String cod_soc, String mat_pers, String reg_cng, String cod_cycl, String sal_neg,
			String taux_imp, String regime_trav, Integer droit_lait, String cod_reg, String nat_reg, String comp_cng,
			String code_comp_cng, String reg_post, String cod_equip, String pointe, Integer anc_pers,
			Integer regime_heur, String pers_clog, String pers_celec, String pers_cvoit, String pers_ceau,
			String code_cchauf, String code_residence, String prim_adm_para, String code_pelerinage, String coef_ptrim,
			Float taux_imp_ptrim, String art40, String cod_grp, String cod_sgrp, String ind_domest, Date dat_art40,
			String uniform, Integer anc_pers_tit, String cod_group, String num_pointeuse, String pointe_libre,
			String cod_grp_point, String signature, String cod_bareme, Date dat_deb_assur, Date dat_fin_assur,
			String f_mojhd_chehid, Integer iep_mojhd_chehid, Integer iep_hors_bea, String contrat_fidelite,
			Date dt_deb_fidelite, Date dt_fin_fidelite, String cod_memb, Float mnt_param, String bon_rest,
			String compte_proced_judic, String benef_proced_judic, String benef, String compte_herit,
			String nom_pers_cnss, Integer avc, Date dat_avq, Integer avq, Date dat_avc, String trs, Date dat_trs,
			String cod_excep, String cod_pay, String sit_cheq, Date dat_sit_cheq, String cod_bat, String cod_bur,
			Date dat_encad, String fonct, Integer id_renseignement_pers, Integer cod_etab_det, Integer cod_etab_org,
			String cod_sec, String cod_user, String lib_regime, String lib_regimecng, String deb_cycle,
			String fin_cycle, String lib_residence, String lib_lait, String lib_CCHAUF) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.reg_cng = reg_cng;
		this.cod_cycl = cod_cycl;
		this.sal_neg = sal_neg;
		this.taux_imp = taux_imp;
		this.regime_trav = regime_trav;
		this.droit_lait = droit_lait;
		this.cod_reg = cod_reg;
		this.nat_reg = nat_reg;
		this.comp_cng = comp_cng;
		this.code_comp_cng = code_comp_cng;
		this.reg_post = reg_post;
		this.cod_equip = cod_equip;
		this.pointe = pointe;
		this.anc_pers = anc_pers;
		this.regime_heur = regime_heur;
		this.pers_clog = pers_clog;
		this.pers_celec = pers_celec;
		this.pers_cvoit = pers_cvoit;
		this.pers_ceau = pers_ceau;
		this.code_cchauf = code_cchauf;
		this.code_residence = code_residence;
		this.prim_adm_para = prim_adm_para;
		this.code_pelerinage = code_pelerinage;
		this.coef_ptrim = coef_ptrim;
		this.taux_imp_ptrim = taux_imp_ptrim;
		this.art40 = art40;
		this.cod_grp = cod_grp;
		this.cod_sgrp = cod_sgrp;
		this.ind_domest = ind_domest;
		this.dat_art40 = dat_art40;
		this.uniform = uniform;
		this.anc_pers_tit = anc_pers_tit;
		this.cod_group = cod_group;
		this.num_pointeuse = num_pointeuse;
		this.pointe_libre = pointe_libre;
		this.cod_grp_point = cod_grp_point;
		this.signature = signature;
		this.cod_bareme = cod_bareme;
		this.dat_deb_assur = dat_deb_assur;
		this.dat_fin_assur = dat_fin_assur;
		this.f_mojhd_chehid = f_mojhd_chehid;
		this.iep_mojhd_chehid = iep_mojhd_chehid;
		this.iep_hors_bea = iep_hors_bea;
		this.contrat_fidelite = contrat_fidelite;
		this.dt_deb_fidelite = dt_deb_fidelite;
		this.dt_fin_fidelite = dt_fin_fidelite;
		this.cod_memb = cod_memb;
		this.mnt_param = mnt_param;
		this.bon_rest = bon_rest;
		this.compte_proced_judic = compte_proced_judic;
		this.benef_proced_judic = benef_proced_judic;
		this.benef = benef;
		this.compte_herit = compte_herit;
		this.nom_pers_cnss = nom_pers_cnss;
		this.avc = avc;
		this.dat_avq = dat_avq;
		this.avq = avq;
		this.dat_avc = dat_avc;
		this.trs = trs;
		this.dat_trs = dat_trs;
		this.cod_excep = cod_excep;
		this.cod_pay = cod_pay;
		this.sit_cheq = sit_cheq;
		this.dat_sit_cheq = dat_sit_cheq;
		this.cod_bat = cod_bat;
		this.cod_bur = cod_bur;
		this.dat_encad = dat_encad;
		this.fonct = fonct;
		this.id_renseignement_pers = id_renseignement_pers;
		this.cod_etab_det = cod_etab_det;
		this.cod_etab_org = cod_etab_org;
		this.cod_sec = cod_sec;
		this.cod_user = cod_user;
		this.lib_regime = lib_regime;
		this.lib_regimecng = lib_regimecng;
		this.deb_cycle = deb_cycle;
		this.fin_cycle = fin_cycle;
		this.lib_residence = lib_residence;
		this.lib_lait = lib_lait;
		this.lib_CCHAUF = lib_CCHAUF;
	}
	public String getLib_CCHAUF() {
		return lib_CCHAUF;
	}
	public void setLib_CCHAUF(String lib_CCHAUF) {
		this.lib_CCHAUF = lib_CCHAUF;
	}
	public String getLib_lait() {
		return lib_lait;
	}
	public void setLib_lait(String lib_lait) {
		this.lib_lait = lib_lait;
	}
	
	public RenseignementPers(String cod_soc, String mat_pers, String reg_cng, String cod_cycl, String sal_neg,
			String taux_imp, String regime_trav, Integer droit_lait, String cod_reg, String nat_reg, String comp_cng,
			String code_comp_cng, String reg_post, String cod_equip, String pointe, Integer anc_pers,
			Integer regime_heur, String pers_clog, String pers_celec, String pers_cvoit, String pers_ceau,
			String code_cchauf, String code_residence, String prim_adm_para, String code_pelerinage, String coef_ptrim,
			Float taux_imp_ptrim, String art40, String cod_grp, String cod_sgrp, String ind_domest, Date dat_art40,
			String uniform, Integer anc_pers_tit, String cod_group, String num_pointeuse, String pointe_libre,
			String cod_grp_point, String signature, String cod_bareme, Date dat_deb_assur, Date dat_fin_assur,
			String f_mojhd_chehid, Integer iep_mojhd_chehid, Integer iep_hors_bea, String contrat_fidelite,
			Date dt_deb_fidelite, Date dt_fin_fidelite, String cod_memb, Float mnt_param, String bon_rest,
			String compte_proced_judic, String benef_proced_judic, String benef, String compte_herit,
			String nom_pers_cnss, Integer avc, Date dat_avq, Integer avq, Date dat_avc, String trs, Date dat_trs,
			String cod_excep, String cod_pay, String sit_cheq, Date dat_sit_cheq, String cod_bat, String cod_bur,
			Date dat_encad, String fonct, Integer id_renseignement_pers, Integer cod_etab_det, Integer cod_etab_org,
			String cod_sec, String cod_user, String lib_regime, String lib_regimecng, String deb_cycle,
			String fin_cycle, String lib_residence, String lib_lait) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.reg_cng = reg_cng;
		this.cod_cycl = cod_cycl;
		this.sal_neg = sal_neg;
		this.taux_imp = taux_imp;
		this.regime_trav = regime_trav;
		this.droit_lait = droit_lait;
		this.cod_reg = cod_reg;
		this.nat_reg = nat_reg;
		this.comp_cng = comp_cng;
		this.code_comp_cng = code_comp_cng;
		this.reg_post = reg_post;
		this.cod_equip = cod_equip;
		this.pointe = pointe;
		this.anc_pers = anc_pers;
		this.regime_heur = regime_heur;
		this.pers_clog = pers_clog;
		this.pers_celec = pers_celec;
		this.pers_cvoit = pers_cvoit;
		this.pers_ceau = pers_ceau;
		this.code_cchauf = code_cchauf;
		this.code_residence = code_residence;
		this.prim_adm_para = prim_adm_para;
		this.code_pelerinage = code_pelerinage;
		this.coef_ptrim = coef_ptrim;
		this.taux_imp_ptrim = taux_imp_ptrim;
		this.art40 = art40;
		this.cod_grp = cod_grp;
		this.cod_sgrp = cod_sgrp;
		this.ind_domest = ind_domest;
		this.dat_art40 = dat_art40;
		this.uniform = uniform;
		this.anc_pers_tit = anc_pers_tit;
		this.cod_group = cod_group;
		this.num_pointeuse = num_pointeuse;
		this.pointe_libre = pointe_libre;
		this.cod_grp_point = cod_grp_point;
		this.signature = signature;
		this.cod_bareme = cod_bareme;
		this.dat_deb_assur = dat_deb_assur;
		this.dat_fin_assur = dat_fin_assur;
		this.f_mojhd_chehid = f_mojhd_chehid;
		this.iep_mojhd_chehid = iep_mojhd_chehid;
		this.iep_hors_bea = iep_hors_bea;
		this.contrat_fidelite = contrat_fidelite;
		this.dt_deb_fidelite = dt_deb_fidelite;
		this.dt_fin_fidelite = dt_fin_fidelite;
		this.cod_memb = cod_memb;
		this.mnt_param = mnt_param;
		this.bon_rest = bon_rest;
		this.compte_proced_judic = compte_proced_judic;
		this.benef_proced_judic = benef_proced_judic;
		this.benef = benef;
		this.compte_herit = compte_herit;
		this.nom_pers_cnss = nom_pers_cnss;
		this.avc = avc;
		this.dat_avq = dat_avq;
		this.avq = avq;
		this.dat_avc = dat_avc;
		this.trs = trs;
		this.dat_trs = dat_trs;
		this.cod_excep = cod_excep;
		this.cod_pay = cod_pay;
		this.sit_cheq = sit_cheq;
		this.dat_sit_cheq = dat_sit_cheq;
		this.cod_bat = cod_bat;
		this.cod_bur = cod_bur;
		this.dat_encad = dat_encad;
		this.fonct = fonct;
		this.id_renseignement_pers = id_renseignement_pers;
		this.cod_etab_det = cod_etab_det;
		this.cod_etab_org = cod_etab_org;
		this.cod_sec = cod_sec;
		this.cod_user = cod_user;
		this.lib_regime = lib_regime;
		this.lib_regimecng = lib_regimecng;
		this.deb_cycle = deb_cycle;
		this.fin_cycle = fin_cycle;
		this.lib_residence = lib_residence;
		this.lib_lait = lib_lait;
	}
	public RenseignementPers(String cod_soc, String mat_pers, String reg_cng, String cod_cycl, String sal_neg,
			String taux_imp, String regime_trav, Integer droit_lait, String cod_reg, String nat_reg, String comp_cng,
			String code_comp_cng, String reg_post, String cod_equip, String pointe, Integer anc_pers,
			Integer regime_heur, String pers_clog, String pers_celec, String pers_cvoit, String pers_ceau,
			String code_cchauf, String code_residence, String prim_adm_para, String code_pelerinage, String coef_ptrim,
			Float taux_imp_ptrim, String art40, String cod_grp, String cod_sgrp, String ind_domest, Date dat_art40,
			String uniform, Integer anc_pers_tit, String cod_group, String num_pointeuse, String pointe_libre,
			String cod_grp_point, String signature, String cod_bareme, Date dat_deb_assur, Date dat_fin_assur,
			String f_mojhd_chehid, Integer iep_mojhd_chehid, Integer iep_hors_bea, String contrat_fidelite,
			Date dt_deb_fidelite, Date dt_fin_fidelite, String cod_memb, Float mnt_param, String bon_rest,
			String compte_proced_judic, String benef_proced_judic, String benef, String compte_herit,
			String nom_pers_cnss, Integer avc, Date dat_avq, Integer avq, Date dat_avc, String trs, Date dat_trs,
			String cod_excep, String cod_pay, String sit_cheq, Date dat_sit_cheq, String cod_bat, String cod_bur,
			Date dat_encad, String fonct, Integer id_renseignement_pers, Integer cod_etab_det, Integer cod_etab_org,
			String cod_sec, String cod_user, String lib_regime, String lib_regimecng, String deb_cycle,
			String fin_cycle, String lib_residence) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.reg_cng = reg_cng;
		this.cod_cycl = cod_cycl;
		this.sal_neg = sal_neg;
		this.taux_imp = taux_imp;
		this.regime_trav = regime_trav;
		this.droit_lait = droit_lait;
		this.cod_reg = cod_reg;
		this.nat_reg = nat_reg;
		this.comp_cng = comp_cng;
		this.code_comp_cng = code_comp_cng;
		this.reg_post = reg_post;
		this.cod_equip = cod_equip;
		this.pointe = pointe;
		this.anc_pers = anc_pers;
		this.regime_heur = regime_heur;
		this.pers_clog = pers_clog;
		this.pers_celec = pers_celec;
		this.pers_cvoit = pers_cvoit;
		this.pers_ceau = pers_ceau;
		this.code_cchauf = code_cchauf;
		this.code_residence = code_residence;
		this.prim_adm_para = prim_adm_para;
		this.code_pelerinage = code_pelerinage;
		this.coef_ptrim = coef_ptrim;
		this.taux_imp_ptrim = taux_imp_ptrim;
		this.art40 = art40;
		this.cod_grp = cod_grp;
		this.cod_sgrp = cod_sgrp;
		this.ind_domest = ind_domest;
		this.dat_art40 = dat_art40;
		this.uniform = uniform;
		this.anc_pers_tit = anc_pers_tit;
		this.cod_group = cod_group;
		this.num_pointeuse = num_pointeuse;
		this.pointe_libre = pointe_libre;
		this.cod_grp_point = cod_grp_point;
		this.signature = signature;
		this.cod_bareme = cod_bareme;
		this.dat_deb_assur = dat_deb_assur;
		this.dat_fin_assur = dat_fin_assur;
		this.f_mojhd_chehid = f_mojhd_chehid;
		this.iep_mojhd_chehid = iep_mojhd_chehid;
		this.iep_hors_bea = iep_hors_bea;
		this.contrat_fidelite = contrat_fidelite;
		this.dt_deb_fidelite = dt_deb_fidelite;
		this.dt_fin_fidelite = dt_fin_fidelite;
		this.cod_memb = cod_memb;
		this.mnt_param = mnt_param;
		this.bon_rest = bon_rest;
		this.compte_proced_judic = compte_proced_judic;
		this.benef_proced_judic = benef_proced_judic;
		this.benef = benef;
		this.compte_herit = compte_herit;
		this.nom_pers_cnss = nom_pers_cnss;
		this.avc = avc;
		this.dat_avq = dat_avq;
		this.avq = avq;
		this.dat_avc = dat_avc;
		this.trs = trs;
		this.dat_trs = dat_trs;
		this.cod_excep = cod_excep;
		this.cod_pay = cod_pay;
		this.sit_cheq = sit_cheq;
		this.dat_sit_cheq = dat_sit_cheq;
		this.cod_bat = cod_bat;
		this.cod_bur = cod_bur;
		this.dat_encad = dat_encad;
		this.fonct = fonct;
		this.id_renseignement_pers = id_renseignement_pers;
		this.cod_etab_det = cod_etab_det;
		this.cod_etab_org = cod_etab_org;
		this.cod_sec = cod_sec;
		this.cod_user = cod_user;
		this.lib_regime = lib_regime;
		this.lib_regimecng = lib_regimecng;
		this.deb_cycle = deb_cycle;
		this.fin_cycle = fin_cycle;
		this.lib_residence = lib_residence;
	}
	public String getLib_residence() {
		return lib_residence;
	}
	public void setLib_residence(String lib_residence) {
		this.lib_residence = lib_residence;
	}
	public String getLib_regimecng() {
		return lib_regimecng;
	}
	public void setLib_regimecng(String lib_regimecng) {
		this.lib_regimecng = lib_regimecng;
	}
	
	public String getDeb_cycle() {
		return deb_cycle;
	}
	public void setDeb_cycle(String deb_cycle) {
		this.deb_cycle = deb_cycle;
	}
	public String getFin_cycle() {
		return fin_cycle;
	}
	public void setFin_cycle(String fin_cycle) {
		this.fin_cycle = fin_cycle;
	}
	public RenseignementPers(String cod_soc, String mat_pers, String reg_cng, String cod_cycl, String sal_neg,
			String taux_imp, String regime_trav, Integer droit_lait, String cod_reg, String nat_reg, String comp_cng,
			String code_comp_cng, String reg_post, String cod_equip, String pointe, Integer anc_pers,
			Integer regime_heur, String pers_clog, String pers_celec, String pers_cvoit, String pers_ceau,
			String code_cchauf, String code_residence, String prim_adm_para, String code_pelerinage, String coef_ptrim,
			Float taux_imp_ptrim, String art40, String cod_grp, String cod_sgrp, String ind_domest, Date dat_art40,
			String uniform, Integer anc_pers_tit, String cod_group, String num_pointeuse, String pointe_libre,
			String cod_grp_point, String signature, String cod_bareme, Date dat_deb_assur, Date dat_fin_assur,
			String f_mojhd_chehid, Integer iep_mojhd_chehid, Integer iep_hors_bea, String contrat_fidelite,
			Date dt_deb_fidelite, Date dt_fin_fidelite, String cod_memb, Float mnt_param, String bon_rest,
			String compte_proced_judic, String benef_proced_judic, String benef, String compte_herit,
			String nom_pers_cnss, Integer avc, Date dat_avq, Integer avq, Date dat_avc, String trs, Date dat_trs,
			String cod_excep, String cod_pay, String sit_cheq, Date dat_sit_cheq, String cod_bat, String cod_bur,
			Date dat_encad, String fonct, Integer id_renseignement_pers, Integer cod_etab_det, Integer cod_etab_org,
			String cod_sec, String cod_user, String lib_regime, String lib_regimecng, String deb_cycle,
			String fin_cycle) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.reg_cng = reg_cng;
		this.cod_cycl = cod_cycl;
		this.sal_neg = sal_neg;
		this.taux_imp = taux_imp;
		this.regime_trav = regime_trav;
		this.droit_lait = droit_lait;
		this.cod_reg = cod_reg;
		this.nat_reg = nat_reg;
		this.comp_cng = comp_cng;
		this.code_comp_cng = code_comp_cng;
		this.reg_post = reg_post;
		this.cod_equip = cod_equip;
		this.pointe = pointe;
		this.anc_pers = anc_pers;
		this.regime_heur = regime_heur;
		this.pers_clog = pers_clog;
		this.pers_celec = pers_celec;
		this.pers_cvoit = pers_cvoit;
		this.pers_ceau = pers_ceau;
		this.code_cchauf = code_cchauf;
		this.code_residence = code_residence;
		this.prim_adm_para = prim_adm_para;
		this.code_pelerinage = code_pelerinage;
		this.coef_ptrim = coef_ptrim;
		this.taux_imp_ptrim = taux_imp_ptrim;
		this.art40 = art40;
		this.cod_grp = cod_grp;
		this.cod_sgrp = cod_sgrp;
		this.ind_domest = ind_domest;
		this.dat_art40 = dat_art40;
		this.uniform = uniform;
		this.anc_pers_tit = anc_pers_tit;
		this.cod_group = cod_group;
		this.num_pointeuse = num_pointeuse;
		this.pointe_libre = pointe_libre;
		this.cod_grp_point = cod_grp_point;
		this.signature = signature;
		this.cod_bareme = cod_bareme;
		this.dat_deb_assur = dat_deb_assur;
		this.dat_fin_assur = dat_fin_assur;
		this.f_mojhd_chehid = f_mojhd_chehid;
		this.iep_mojhd_chehid = iep_mojhd_chehid;
		this.iep_hors_bea = iep_hors_bea;
		this.contrat_fidelite = contrat_fidelite;
		this.dt_deb_fidelite = dt_deb_fidelite;
		this.dt_fin_fidelite = dt_fin_fidelite;
		this.cod_memb = cod_memb;
		this.mnt_param = mnt_param;
		this.bon_rest = bon_rest;
		this.compte_proced_judic = compte_proced_judic;
		this.benef_proced_judic = benef_proced_judic;
		this.benef = benef;
		this.compte_herit = compte_herit;
		this.nom_pers_cnss = nom_pers_cnss;
		this.avc = avc;
		this.dat_avq = dat_avq;
		this.avq = avq;
		this.dat_avc = dat_avc;
		this.trs = trs;
		this.dat_trs = dat_trs;
		this.cod_excep = cod_excep;
		this.cod_pay = cod_pay;
		this.sit_cheq = sit_cheq;
		this.dat_sit_cheq = dat_sit_cheq;
		this.cod_bat = cod_bat;
		this.cod_bur = cod_bur;
		this.dat_encad = dat_encad;
		this.fonct = fonct;
		this.id_renseignement_pers = id_renseignement_pers;
		this.cod_etab_det = cod_etab_det;
		this.cod_etab_org = cod_etab_org;
		this.cod_sec = cod_sec;
		this.cod_user = cod_user;
		this.lib_regime = lib_regime;
		this.lib_regimecng = lib_regimecng;
		this.deb_cycle = deb_cycle;
		this.fin_cycle = fin_cycle;
	}
	public String getLib_regime() {
		return lib_regime;
	}
	public void setLib_regime(String lib_regime) {
		this.lib_regime = lib_regime;
	}
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
	public String getReg_cng() {
		return reg_cng;
	}
	public void setReg_cng(String reg_cng) {
		this.reg_cng = reg_cng;
	}
	public String getCod_cycl() {
		return cod_cycl;
	}
	public void setCod_cycl(String cod_cycl) {
		this.cod_cycl = cod_cycl;
	}
	public String getSal_neg() {
		return sal_neg;
	}
	public void setSal_neg(String sal_neg) {
		this.sal_neg = sal_neg;
	}
	public String getTaux_imp() {
		return taux_imp;
	}
	public void setTaux_imp(String taux_imp) {
		this.taux_imp = taux_imp;
	}
	public String getRegime_trav() {
		return regime_trav;
	}
	public void setRegime_trav(String regime_trav) {
		this.regime_trav = regime_trav;
	}
	public Integer getDroit_lait() {
		return droit_lait;
	}
	public void setDroit_lait(Integer droit_lait) {
		this.droit_lait = droit_lait;
	}
	public String getCod_reg() {
		return cod_reg;
	}
	public void setCod_reg(String cod_reg) {
		this.cod_reg = cod_reg;
	}
	public String getNat_reg() {
		return nat_reg;
	}
	public void setNat_reg(String nat_reg) {
		this.nat_reg = nat_reg;
	}
	public String getComp_cng() {
		return comp_cng;
	}
	public void setComp_cng(String comp_cng) {
		this.comp_cng = comp_cng;
	}
	public String getCode_comp_cng() {
		return code_comp_cng;
	}
	public void setCode_comp_cng(String code_comp_cng) {
		this.code_comp_cng = code_comp_cng;
	}
	public String getReg_post() {
		return reg_post;
	}
	public void setReg_post(String reg_post) {
		this.reg_post = reg_post;
	}
	public String getCod_equip() {
		return cod_equip;
	}
	public void setCod_equip(String cod_equip) {
		this.cod_equip = cod_equip;
	}
	public String getPointe() {
		return pointe;
	}
	public void setPointe(String pointe) {
		this.pointe = pointe;
	}
	public Integer getAnc_pers() {
		return anc_pers;
	}
	public void setAnc_pers(Integer anc_pers) {
		this.anc_pers = anc_pers;
	}
	public Integer getRegime_heur() {
		return regime_heur;
	}
	public void setRegime_heur(Integer regime_heur) {
		this.regime_heur = regime_heur;
	}
	public String getPers_clog() {
		return pers_clog;
	}
	public void setPers_clog(String pers_clog) {
		this.pers_clog = pers_clog;
	}
	public String getPers_celec() {
		return pers_celec;
	}
	public void setPers_celec(String pers_celec) {
		this.pers_celec = pers_celec;
	}
	public String getPers_cvoit() {
		return pers_cvoit;
	}
	public void setPers_cvoit(String pers_cvoit) {
		this.pers_cvoit = pers_cvoit;
	}
	public String getPers_ceau() {
		return pers_ceau;
	}
	public void setPers_ceau(String pers_ceau) {
		this.pers_ceau = pers_ceau;
	}
	public String getCode_cchauf() {
		return code_cchauf;
	}
	public void setCode_cchauf(String code_cchauf) {
		this.code_cchauf = code_cchauf;
	}
	public String getCode_residence() {
		return code_residence;
	}
	public void setCode_residence(String code_residence) {
		this.code_residence = code_residence;
	}
	public String getPrim_adm_para() {
		return prim_adm_para;
	}
	public void setPrim_adm_para(String prim_adm_para) {
		this.prim_adm_para = prim_adm_para;
	}
	public String getCode_pelerinage() {
		return code_pelerinage;
	}
	public void setCode_pelerinage(String code_pelerinage) {
		this.code_pelerinage = code_pelerinage;
	}
	public String getCoef_ptrim() {
		return coef_ptrim;
	}
	public void setCoef_ptrim(String coef_ptrim) {
		this.coef_ptrim = coef_ptrim;
	}
	public Float getTaux_imp_ptrim() {
			return taux_imp_ptrim;
	}
	public void setTaux_imp_ptrim(Float taux_imp_ptrim) {
		this.taux_imp_ptrim = taux_imp_ptrim;
	}
	public String getArt40() {
		return art40;
	}
	public void setArt40(String art40) {
		this.art40 = art40;
	}
	public String getCod_grp() {
		return cod_grp;
	}
	public void setCod_grp(String cod_grp) {
		this.cod_grp = cod_grp;
	}
	public String getCod_sgrp() {
		return cod_sgrp;
	}
	public void setCod_sgrp(String cod_sgrp) {
		this.cod_sgrp = cod_sgrp;
	}
	public String getInd_domest() {
		return ind_domest;
	}
	public void setInd_domest(String ind_domest) {
		this.ind_domest = ind_domest;
	}
	public Date getDat_art40() {
		return dat_art40;
	}
	public void setDat_art40(Date dat_art40) {
		this.dat_art40 = dat_art40;
	}
	public String getUniform() {
		return uniform;
	}
	public void setUniform(String uniform) {
		this.uniform = uniform;
	}
	public Integer getAnc_pers_tit() {
		return anc_pers_tit;
	}
	public void setAnc_pers_tit(Integer anc_pers_tit) {
		this.anc_pers_tit = anc_pers_tit;
	}
	public String getCod_group() {
		return cod_group;
	}
	public void setCod_group(String cod_group) {
		this.cod_group = cod_group;
	}
	public String getNum_pointeuse() {
		return num_pointeuse;
	}
	public void setNum_pointeuse(String num_pointeuse) {
		this.num_pointeuse = num_pointeuse;
	}
	public String getPointe_libre() {
		return pointe_libre;
	}
	public void setPointe_libre(String pointe_libre) {
		this.pointe_libre = pointe_libre;
	}
	public String getCod_grp_point() {
		return cod_grp_point;
	}
	public void setCod_grp_point(String cod_grp_point) {
		this.cod_grp_point = cod_grp_point;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public String getCod_bareme() {
		return cod_bareme;
	}
	public void setCod_bareme(String cod_bareme) {
		this.cod_bareme = cod_bareme;
	}
	public Date getDat_deb_assur() {
		return dat_deb_assur;
	}
	public void setDat_deb_assur(Date dat_deb_assur) {
		this.dat_deb_assur = dat_deb_assur;
	}
	public Date getDat_fin_assur() {
		return dat_fin_assur;
	}
	public void setDat_fin_assur(Date dat_fin_assur) {
		this.dat_fin_assur = dat_fin_assur;
	}
	public String getF_mojhd_chehid() {
		return f_mojhd_chehid;
	}
	public void setF_mojhd_chehid(String f_mojhd_chehid) {
		this.f_mojhd_chehid = f_mojhd_chehid;
	}
	public Integer getIep_mojhd_chehid() {
		return iep_mojhd_chehid;
	}
	public void setIep_mojhd_chehid(Integer iep_mojhd_chehid) {
		this.iep_mojhd_chehid = iep_mojhd_chehid;
	}
	public Integer getIep_hors_bea() {
		return iep_hors_bea;
	}
	public void setIep_hors_bea(Integer iep_hors_bea) {
		this.iep_hors_bea = iep_hors_bea;
	}
	public String getContrat_fidelite() {
		return contrat_fidelite;
	}
	public void setContrat_fidelite(String contrat_fidelite) {
		this.contrat_fidelite = contrat_fidelite;
	}
	public Date getDt_deb_fidelite() {
		return dt_deb_fidelite;
	}
	public void setDt_deb_fidelite(Date dt_deb_fidelite) {
		this.dt_deb_fidelite = dt_deb_fidelite;
	}
	public Date getDt_fin_fidelite() {
		return dt_fin_fidelite;
	}
	public void setDt_fin_fidelite(Date dt_fin_fidelite) {
		this.dt_fin_fidelite = dt_fin_fidelite;
	}
	public String getCod_memb() {
		return cod_memb;
	}
	public void setCod_memb(String cod_memb) {
		this.cod_memb = cod_memb;
	}
	public Float getMnt_param() {
		return mnt_param;
	}
	public void setMnt_param(Float mnt_param) {
		this.mnt_param = mnt_param;
	}
	public String getBon_rest() {
		return bon_rest;
	}
	public void setBon_rest(String bon_rest) {
		this.bon_rest = bon_rest;
	}
	public String getCompte_proced_judic() {
		return compte_proced_judic;
	}
	public void setCompte_proced_judic(String compte_proced_judic) {
		this.compte_proced_judic = compte_proced_judic;
	}
	public String getBenef_proced_judic() {
		return benef_proced_judic;
	}
	public void setBenef_proced_judic(String benef_proced_judic) {
		this.benef_proced_judic = benef_proced_judic;
	}
	public String getBenef() {
		return benef;
	}
	public void setBenef(String benef) {
		this.benef = benef;
	}
	public String getCompte_herit() {
		return compte_herit;
	}
	public void setCompte_herit(String compte_herit) {
		this.compte_herit = compte_herit;
	}
	public String getNom_pers_cnss() {
		return nom_pers_cnss;
	}
	public void setNom_pers_cnss(String nom_pers_cnss) {
		this.nom_pers_cnss = nom_pers_cnss;
	}
	public Integer getAvc() {
		return avc;
	}
	public void setAvc(Integer avc) {
		this.avc = avc;
	}
	public Date getDat_avq() {
		return dat_avq;
	}
	public void setDat_avq(Date dat_avq) {
		this.dat_avq = dat_avq;
	}
	public Integer getAvq() {
		return avq;
	}
	public void setAvq(Integer avq) {
		this.avq = avq;
	}
	public Date getDat_avc() {
		return dat_avc;
	}
	public void setDat_avc(Date dat_avc) {
		this.dat_avc = dat_avc;
	}
	public String getTrs() {
		return trs;
	}
	public void setTrs(String trs) {
		this.trs = trs;
	}
	public Date getDat_trs() {
		return dat_trs;
	}
	public void setDat_trs(Date dat_trs) {
		this.dat_trs = dat_trs;
	}
	public String getCod_excep() {
		return cod_excep;
	}
	public void setCod_excep(String cod_excep) {
		this.cod_excep = cod_excep;
	}
	public String getCod_pay() {
		return cod_pay;
	}
	public void setCod_pay(String cod_pay) {
		this.cod_pay = cod_pay;
	}
	public String getSit_cheq() {
		return sit_cheq;
	}
	public void setSit_cheq(String sit_cheq) {
		this.sit_cheq = sit_cheq;
	}
	public Date getDat_sit_cheq() {
		return dat_sit_cheq;
	}
	public void setDat_sit_cheq(Date dat_sit_cheq) {
		this.dat_sit_cheq = dat_sit_cheq;
	}
	public String getCod_bat() {
		return cod_bat;
	}
	public void setCod_bat(String cod_bat) {
		this.cod_bat = cod_bat;
	}
	public String getCod_bur() {
		return cod_bur;
	}
	public void setCod_bur(String cod_bur) {
		this.cod_bur = cod_bur;
	}
	public Date getDat_encad() {
		return dat_encad;
	}
	public void setDat_encad(Date dat_encad) {
		this.dat_encad = dat_encad;
	}
	public String getFonct() {
		return fonct;
	}
	public void setFonct(String fonct) {
		this.fonct = fonct;
	}
	public Integer getId_renseignement_pers() {
		return id_renseignement_pers;
	}
	public void setId_renseignement_pers(Integer id_renseignement_pers) {
		this.id_renseignement_pers = id_renseignement_pers;
	}
	public Integer getCod_etab_det() {
		return cod_etab_det;
	}
	public void setCod_etab_det(Integer cod_etab_det) {
		this.cod_etab_det = cod_etab_det;
	}
	public Integer getCod_etab_org() {
		return cod_etab_org;
	}
	public void setCod_etab_org(Integer cod_etab_org) {
		this.cod_etab_org = cod_etab_org;
	}
	public String getCod_sec() {
		return cod_sec;
	}
	public void setCod_sec(String cod_sec) {
		this.cod_sec = cod_sec;
	}
	public String getCod_user() {
		return cod_user;
	}
	public void setCod_user(String cod_user) {
		this.cod_user = cod_user;
	}
	public RenseignementPers(String cod_soc, String mat_pers, String reg_cng, String cod_cycl, String sal_neg,
			String taux_imp, String regime_trav, Integer droit_lait, String cod_reg, String nat_reg, String comp_cng,
			String code_comp_cng, String reg_post, String cod_equip, String pointe, Integer anc_pers,
			Integer regime_heur, String pers_clog, String pers_celec, String pers_cvoit, String pers_ceau,
			String code_cchauf, String code_residence, String prim_adm_para, String code_pelerinage, String coef_ptrim,
			Float taux_imp_ptrim, String art40, String cod_grp, String cod_sgrp, String ind_domest, Date dat_art40,
			String uniform, Integer anc_pers_tit, String cod_group, String num_pointeuse, String pointe_libre,
			String cod_grp_point, String signature, String cod_bareme, Date dat_deb_assur, Date dat_fin_assur,
			String f_mojhd_chehid, Integer iep_mojhd_chehid, Integer iep_hors_bea, String contrat_fidelite,
			Date dt_deb_fidelite, Date dt_fin_fidelite, String cod_memb, Float mnt_param, String bon_rest,
			String compte_proced_judic, String benef_proced_judic, String benef, String compte_herit,
			String nom_pers_cnss, Integer avc, Date dat_avq, Integer avq, Date dat_avc, String trs, Date dat_trs,
			String cod_excep, String cod_pay, String sit_cheq, Date dat_sit_cheq, String cod_bat, String cod_bur,
			Date dat_encad, String fonct, Integer id_renseignement_pers, Integer cod_etab_det, Integer cod_etab_org,
			String cod_sec, String cod_user) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.reg_cng = reg_cng;
		this.cod_cycl = cod_cycl;
		this.sal_neg = sal_neg;
		this.taux_imp = taux_imp;
		this.regime_trav = regime_trav;
		this.droit_lait = droit_lait;
		this.cod_reg = cod_reg;
		this.nat_reg = nat_reg;
		this.comp_cng = comp_cng;
		this.code_comp_cng = code_comp_cng;
		this.reg_post = reg_post;
		this.cod_equip = cod_equip;
		this.pointe = pointe;
		this.anc_pers = anc_pers;
		this.regime_heur = regime_heur;
		this.pers_clog = pers_clog;
		this.pers_celec = pers_celec;
		this.pers_cvoit = pers_cvoit;
		this.pers_ceau = pers_ceau;
		this.code_cchauf = code_cchauf;
		this.code_residence = code_residence;
		this.prim_adm_para = prim_adm_para;
		this.code_pelerinage = code_pelerinage;
		this.coef_ptrim = coef_ptrim;
		this.taux_imp_ptrim = taux_imp_ptrim;
		this.art40 = art40;
		this.cod_grp = cod_grp;
		this.cod_sgrp = cod_sgrp;
		this.ind_domest = ind_domest;
		this.dat_art40 = dat_art40;
		this.uniform = uniform;
		this.anc_pers_tit = anc_pers_tit;
		this.cod_group = cod_group;
		this.num_pointeuse = num_pointeuse;
		this.pointe_libre = pointe_libre;
		this.cod_grp_point = cod_grp_point;
		this.signature = signature;
		this.cod_bareme = cod_bareme;
		this.dat_deb_assur = dat_deb_assur;
		this.dat_fin_assur = dat_fin_assur;
		this.f_mojhd_chehid = f_mojhd_chehid;
		this.iep_mojhd_chehid = iep_mojhd_chehid;
		this.iep_hors_bea = iep_hors_bea;
		this.contrat_fidelite = contrat_fidelite;
		this.dt_deb_fidelite = dt_deb_fidelite;
		this.dt_fin_fidelite = dt_fin_fidelite;
		this.cod_memb = cod_memb;
		this.mnt_param = mnt_param;
		this.bon_rest = bon_rest;
		this.compte_proced_judic = compte_proced_judic;
		this.benef_proced_judic = benef_proced_judic;
		this.benef = benef;
		this.compte_herit = compte_herit;
		this.nom_pers_cnss = nom_pers_cnss;
		this.avc = avc;
		this.dat_avq = dat_avq;
		this.avq = avq;
		this.dat_avc = dat_avc;
		this.trs = trs;
		this.dat_trs = dat_trs;
		this.cod_excep = cod_excep;
		this.cod_pay = cod_pay;
		this.sit_cheq = sit_cheq;
		this.dat_sit_cheq = dat_sit_cheq;
		this.cod_bat = cod_bat;
		this.cod_bur = cod_bur;
		this.dat_encad = dat_encad;
		this.fonct = fonct;
		this.id_renseignement_pers = id_renseignement_pers;
		this.cod_etab_det = cod_etab_det;
		this.cod_etab_org = cod_etab_org;
		this.cod_sec = cod_sec;
		this.cod_user = cod_user;
	}
	public RenseignementPers() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "RenseignementPers {cod_soc=" + cod_soc + ", mat_pers=" + mat_pers + "}";
	}
	

}
