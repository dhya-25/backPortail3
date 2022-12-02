package com.arabsoft.ajir.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@IdClass(Fiche_eval_comp_id.class)

public class FICHE_EVAL_COMP {
	@Id
	private String  cod_soc ;
	@Id
	 private String  mat_pers ;
	@Id
	 private String ref_mod  ;           
	 private String cod_metier;          
	 private String cod_post  ;   
	@JsonFormat( pattern = "dd/MM/yyyy") 
	@Id
	  private Date dat_eval ;
	  private String  cod_typ_eval;   ; 
	  private String  cod_soc_evaluateur ; 
	  private String mat_pers_evaluateur ;
	  private String observation  ;       
	  private 	Long y_anciennete;
	 private Long  m_anciennete;
	 private Long j_anciennete;
	 private String cod_typ_prom;
	 private Long annee;
	 private Long num_dem;
	 private String cod_nat ;            
	 private String avis_evaluateur ;
	 private Long id_fiche_eval_comp  ;
		@Column(insertable = false, updatable = false)

	 private String libpost;
		@Column(insertable = false, updatable = false)
		private String libprenomevaluateur;
		@Column(insertable = false, updatable = false)
		private String libmod;
		
		
	public FICHE_EVAL_COMP(String cod_soc, String mat_pers, String ref_mod, String cod_metier, String cod_post,
				Date dat_eval, String cod_typ_eval, String cod_soc_evaluateur, String mat_pers_evaluateur,
				String observation, Long y_anciennete, Long m_anciennete, Long j_anciennete, String cod_typ_prom,
				Long annee, Long num_dem, String cod_nat, String avis_evaluateur, Long id_fiche_eval_comp,
				String libpost, String libprenomevaluateur, String libmod) {
			super();
			this.cod_soc = cod_soc;
			this.mat_pers = mat_pers;
			this.ref_mod = ref_mod;
			this.cod_metier = cod_metier;
			this.cod_post = cod_post;
			this.dat_eval = dat_eval;
			this.cod_typ_eval = cod_typ_eval;
			this.cod_soc_evaluateur = cod_soc_evaluateur;
			this.mat_pers_evaluateur = mat_pers_evaluateur;
			this.observation = observation;
			this.y_anciennete = y_anciennete;
			this.m_anciennete = m_anciennete;
			this.j_anciennete = j_anciennete;
			this.cod_typ_prom = cod_typ_prom;
			this.annee = annee;
			this.num_dem = num_dem;
			this.cod_nat = cod_nat;
			this.avis_evaluateur = avis_evaluateur;
			this.id_fiche_eval_comp = id_fiche_eval_comp;
			this.libpost = libpost;
			this.libprenomevaluateur = libprenomevaluateur;
			this.libmod = libmod;
		}
	public String getLibpost() {
			return libpost;
		}
		public void setLibpost(String libpost) {
			this.libpost = libpost;
		}
		public String getLibprenomevaluateur() {
			return libprenomevaluateur;
		}
		public void setLibprenomevaluateur(String libprenomevaluateur) {
			this.libprenomevaluateur = libprenomevaluateur;
		}
		public String getLibmod() {
			return libmod;
		}
		public void setLibmod(String libmod) {
			this.libmod = libmod;
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
	public String getRef_mod() {
		return ref_mod;
	}
	public void setRef_mod(String ref_mod) {
		this.ref_mod = ref_mod;
	}
	public String getCod_metier() {
		return cod_metier;
	}
	public void setCod_metier(String cod_metier) {
		this.cod_metier = cod_metier;
	}
	public String getCod_post() {
		return cod_post;
	}
	public void setCod_post(String cod_post) {
		this.cod_post = cod_post;
	}
	public Date getDat_eval() {
		return dat_eval;
	}
	public void setDat_eval(Date dat_eval) {
		this.dat_eval = dat_eval;
	}
	public String getCod_typ_eval() {
		return cod_typ_eval;
	}
	public void setCod_typ_eval(String cod_typ_eval) {
		this.cod_typ_eval = cod_typ_eval;
	}
	public String getCod_soc_evaluateur() {
		return cod_soc_evaluateur;
	}
	public void setCod_soc_evaluateur(String cod_soc_evaluateur) {
		this.cod_soc_evaluateur = cod_soc_evaluateur;
	}
	public String getMat_pers_evaluateur() {
		return mat_pers_evaluateur;
	}
	public void setMat_pers_evaluateur(String mat_pers_evaluateur) {
		this.mat_pers_evaluateur = mat_pers_evaluateur;
	}
	public String getObservation() {
		return observation;
	}
	public void setObservation(String observation) {
		this.observation = observation;
	}
	public Long getY_anciennete() {
		return y_anciennete;
	}
	public void setY_anciennete(Long y_anciennete) {
		this.y_anciennete = y_anciennete;
	}
	public Long getM_anciennete() {
		return m_anciennete;
	}
	public void setM_anciennete(Long m_anciennete) {
		this.m_anciennete = m_anciennete;
	}
	public Long getJ_anciennete() {
		return j_anciennete;
	}
	public void setJ_anciennete(Long j_anciennete) {
		this.j_anciennete = j_anciennete;
	}
	public String getCod_typ_prom() {
		return cod_typ_prom;
	}
	public void setCod_typ_prom(String cod_typ_prom) {
		this.cod_typ_prom = cod_typ_prom;
	}
	public Long getAnnee() {
		return annee;
	}
	public void setAnnee(Long annee) {
		this.annee = annee;
	}
	public Long getNum_dem() {
		return num_dem;
	}
	public void setNum_dem(Long num_dem) {
		this.num_dem = num_dem;
	}
	public String getCod_nat() {
		return cod_nat;
	}
	public void setCod_nat(String cod_nat) {
		this.cod_nat = cod_nat;
	}
	public String getAvis_evaluateur() {
		return avis_evaluateur;
	}
	public void setAvis_evaluateur(String avis_evaluateur) {
		this.avis_evaluateur = avis_evaluateur;
	}
	public Long getId_fiche_eval_comp() {
		return id_fiche_eval_comp;
	}
	public void setId_fiche_eval_comp(Long id_fiche_eval_comp) {
		this.id_fiche_eval_comp = id_fiche_eval_comp;
	}
	public FICHE_EVAL_COMP() {
		super();
	}
	public FICHE_EVAL_COMP(String cod_soc, String mat_pers, String ref_mod, String cod_metier, String cod_post,
			Date dat_eval, String cod_typ_eval, String cod_soc_evaluateur, String mat_pers_evaluateur,
			String observation, Long y_anciennete, Long m_anciennete, Long j_anciennete, String cod_typ_prom,
			Long annee, Long num_dem, String cod_nat, String avis_evaluateur, Long id_fiche_eval_comp) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.ref_mod = ref_mod;
		this.cod_metier = cod_metier;
		this.cod_post = cod_post;
		this.dat_eval = dat_eval;
		this.cod_typ_eval = cod_typ_eval;
		this.cod_soc_evaluateur = cod_soc_evaluateur;
		this.mat_pers_evaluateur = mat_pers_evaluateur;
		this.observation = observation;
		this.y_anciennete = y_anciennete;
		this.m_anciennete = m_anciennete;
		this.j_anciennete = j_anciennete;
		this.cod_typ_prom = cod_typ_prom;
		this.annee = annee;
		this.num_dem = num_dem;
		this.cod_nat = cod_nat;
		this.avis_evaluateur = avis_evaluateur;
		this.id_fiche_eval_comp = id_fiche_eval_comp;
	}
	 
	 
	 

}
