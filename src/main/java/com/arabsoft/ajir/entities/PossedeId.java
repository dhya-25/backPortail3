package com.arabsoft.ajir.entities;

import java.io.Serializable;

public class PossedeId implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cod_soc;
	private String mat_pers;
	private String abrv_fixe;
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
	public String getAbrv_fixe() {
		return abrv_fixe;
	}
	public void setAbrv_fixe(String abrv_fixe) {
		this.abrv_fixe = abrv_fixe;
	}
	public PossedeId(String cod_soc, String mat_pers, String abrv_fixe) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.abrv_fixe = abrv_fixe;
	}
	public PossedeId() {
		super();
	}
	
	

}
