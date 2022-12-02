package com.arabsoft.ajir.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@IdClass(Pk_ValeurFicheEval.class)
public class VALEUR_FICHE_EVAL {
	@Id
	 private String cod_soc;
	@Id
	 private String  mat_pers;
	@Id
	 private String ref_mod;
	@JsonFormat( pattern = "dd/MM/yyyy") 

	@Id
	  private Date dat_eval;
	@Id
	  private String  cod_nat_comp ;
	@Id
	  private String cod_comp;
	@Id
	  private String cod_crit_comp;
	@Id
	  private String cod_val;
	  private String commentaires ;
	   private Long nbr_point;
	   private String acquis;
	 private Long id_valeur_fiche_eval ;
		@Column(insertable = false, updatable = false)

	 private String lib_competence;
		@Column(insertable = false, updatable = false)

	 private String lib_critere;
		@Column(insertable = false, updatable = false)

	 private String libval;
		@Column(insertable = false, updatable = false)

	 private String Aquis_O_N;
		@Column(insertable = false, updatable = false)

		
		 private String libapp;
		
	 
	 
	public VALEUR_FICHE_EVAL(String cod_soc, String mat_pers, String ref_mod, Date dat_eval, String cod_nat_comp,
				String cod_comp, String cod_crit_comp, String cod_val, String commentaires, Long nbr_point,
				String acquis, Long id_valeur_fiche_eval, String lib_competence, String lib_critere, String libval,
				String aquis_O_N, String libapp) {
			super();
			this.cod_soc = cod_soc;
			this.mat_pers = mat_pers;
			this.ref_mod = ref_mod;
			this.dat_eval = dat_eval;
			this.cod_nat_comp = cod_nat_comp;
			this.cod_comp = cod_comp;
			this.cod_crit_comp = cod_crit_comp;
			this.cod_val = cod_val;
			this.commentaires = commentaires;
			this.nbr_point = nbr_point;
			this.acquis = acquis;
			this.id_valeur_fiche_eval = id_valeur_fiche_eval;
			this.lib_competence = lib_competence;
			this.lib_critere = lib_critere;
			this.libval = libval;
			Aquis_O_N = aquis_O_N;
			this.libapp = libapp;
		}
	public String getLibapp() {
			return libapp;
		}
		public void setLibapp(String libapp) {
			this.libapp = libapp;
		}
	public VALEUR_FICHE_EVAL(String cod_soc, String mat_pers, String ref_mod, Date dat_eval, String cod_nat_comp,
			String cod_comp, String cod_crit_comp, String cod_val, String commentaires, Long nbr_point, String acquis,
			Long id_valeur_fiche_eval, String lib_competence, String lib_critere, String libval, String aquis_O_N) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.ref_mod = ref_mod;
		this.dat_eval = dat_eval;
		this.cod_nat_comp = cod_nat_comp;
		this.cod_comp = cod_comp;
		this.cod_crit_comp = cod_crit_comp;
		this.cod_val = cod_val;
		this.commentaires = commentaires;
		this.nbr_point = nbr_point;
		this.acquis = acquis;
		this.id_valeur_fiche_eval = id_valeur_fiche_eval;
		this.lib_competence = lib_competence;
		this.lib_critere = lib_critere;
		this.libval = libval;
		Aquis_O_N = aquis_O_N;
	}
	public String getLib_competence() {
		return lib_competence;
	}
	public void setLib_competence(String lib_competence) {
		this.lib_competence = lib_competence;
	}
	public String getLib_critere() {
		return lib_critere;
	}
	public void setLib_critere(String lib_critere) {
		this.lib_critere = lib_critere;
	}
	public String getLibval() {
		return libval;
	}
	public void setLibval(String libval) {
		this.libval = libval;
	}
	public String getAquis_O_N() {
		return Aquis_O_N;
	}
	public void setAquis_O_N(String aquis_O_N) {
		Aquis_O_N = aquis_O_N;
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
	public Date getDat_eval() {
		return dat_eval;
	}
	public void setDat_eval(Date dat_eval) {
		this.dat_eval = dat_eval;
	}
	public String getCod_nat_comp() {
		return cod_nat_comp;
	}
	public void setCod_nat_comp(String cod_nat_comp) {
		this.cod_nat_comp = cod_nat_comp;
	}
	public String getCod_comp() {
		return cod_comp;
	}
	public void setCod_comp(String cod_comp) {
		this.cod_comp = cod_comp;
	}
	public String getCod_crit_comp() {
		return cod_crit_comp;
	}
	public void setCod_crit_comp(String cod_crit_comp) {
		this.cod_crit_comp = cod_crit_comp;
	}
	public String getCod_val() {
		return cod_val;
	}
	public void setCod_val(String cod_val) {
		this.cod_val = cod_val;
	}
	public String getCommentaires() {
		return commentaires;
	}
	public void setCommentaires(String commentaires) {
		this.commentaires = commentaires;
	}
	public Long getNbr_point() {
		return nbr_point;
	}
	public void setNbr_point(Long nbr_point) {
		this.nbr_point = nbr_point;
	}
	public String getAcquis() {
		return acquis;
	}
	public void setAcquis(String acquis) {
		this.acquis = acquis;
	}
	public Long getId_valeur_fiche_eval() {
		return id_valeur_fiche_eval;
	}
	public void setId_valeur_fiche_eval(Long id_valeur_fiche_eval) {
		this.id_valeur_fiche_eval = id_valeur_fiche_eval;
	}
	public VALEUR_FICHE_EVAL() {
		super();
	}
	public VALEUR_FICHE_EVAL(String cod_soc, String mat_pers, String ref_mod, Date dat_eval, String cod_nat_comp,
			String cod_comp, String cod_crit_comp, String cod_val, String commentaires, Long nbr_point, String acquis,
			Long id_valeur_fiche_eval) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.ref_mod = ref_mod;
		this.dat_eval = dat_eval;
		this.cod_nat_comp = cod_nat_comp;
		this.cod_comp = cod_comp;
		this.cod_crit_comp = cod_crit_comp;
		this.cod_val = cod_val;
		this.commentaires = commentaires;
		this.nbr_point = nbr_point;
		this.acquis = acquis;
		this.id_valeur_fiche_eval = id_valeur_fiche_eval;
	}
	 

}
