package com.arabsoft.ajir.entities;

import java.io.Serializable;


public class CleCessionPers implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cod_soc;
	
	private String mat_pers;
	
	private Integer cod_pret;
		
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
	public Integer getCod_pret() {
		return cod_pret;
	}
	public void setCod_pret(Integer cod_pret) {
		this.cod_pret = cod_pret;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public CleCessionPers(String cod_soc, String mat_pers, Integer cod_pret) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.cod_pret = cod_pret;
	}
	public CleCessionPers() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Personnel {cod_soc=" + cod_soc + ", mat_pers=" + mat_pers + "}";
	}
	
}

