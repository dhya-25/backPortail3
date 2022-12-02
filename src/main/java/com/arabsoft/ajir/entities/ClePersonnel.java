package com.arabsoft.ajir.entities;

import java.io.Serializable;


public class ClePersonnel  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	public String cod_soc;
	public String mat_pers;
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
	
	
	public ClePersonnel(String cod_soc, String mat_pers) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
	}
	
	public ClePersonnel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Personnel {cod_soc=" + cod_soc + ", mat_pers=" + mat_pers + "}";
	}
	
}
