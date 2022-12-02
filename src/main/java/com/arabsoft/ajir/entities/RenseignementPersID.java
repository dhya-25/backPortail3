package com.arabsoft.ajir.entities;

import java.io.Serializable;

public class RenseignementPersID implements Serializable{

	private static final long serialVersionUID = 1L;
	private String cod_soc;
	private String mat_pers;
	public RenseignementPersID(String cod_soc, String mat_pers) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
	}
	public RenseignementPersID() {
		super();
		// TODO Auto-generated constructor stub
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
