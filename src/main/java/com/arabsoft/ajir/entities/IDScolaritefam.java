package com.arabsoft.ajir.entities;

import java.io.Serializable;

public class IDScolaritefam implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 private String cod_soc  ;           
	 private String mat_pers ;            
	 private Long num_fam   ;           
	 private Long annee_scolaire  ;
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
	public Long getNum_fam() {
		return num_fam;
	}
	public void setNum_fam(Long num_fam) {
		this.num_fam = num_fam;
	}
	public Long getAnnee_scolaire() {
		return annee_scolaire;
	}
	public void setAnnee_scolaire(Long annee_scolaire) {
		this.annee_scolaire = annee_scolaire;
	}
	public IDScolaritefam() {
		super();
	}
	public IDScolaritefam(String cod_soc, String mat_pers, Long num_fam, Long annee_scolaire) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.num_fam = num_fam;
		this.annee_scolaire = annee_scolaire;
	}  

}
