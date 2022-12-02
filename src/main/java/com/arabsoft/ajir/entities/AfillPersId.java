package com.arabsoft.ajir.entities;

import java.io.Serializable;

public class AfillPersId implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cod_soc  ;    
	private String mat_pers ;
	private String  cod_affil  ;  
	private String typ_affil  ;
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
	public String getCod_affil() {
		return cod_affil;
	}
	public void setCod_affil(String cod_affil) {
		this.cod_affil = cod_affil;
	}
	public String getTyp_affil() {
		return typ_affil;
	}
	public void setTyp_affil(String typ_affil) {
		this.typ_affil = typ_affil;
	}
	public AfillPersId() {
		super();
	}
	public AfillPersId(String cod_soc, String mat_pers, String cod_affil, String typ_affil) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.cod_affil = cod_affil;
		this.typ_affil = typ_affil;
	}   
	

}
