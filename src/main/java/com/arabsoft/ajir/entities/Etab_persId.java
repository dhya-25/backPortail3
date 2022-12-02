package com.arabsoft.ajir.entities;

import java.io.Serializable;

public class Etab_persId implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cod_soc;
	private String mat_pers;
	private long num_etablis;
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
	public long getNum_etablis() {
		return num_etablis;
	}
	public void setNum_etablis(long num_etablis) {
		this.num_etablis = num_etablis;
	}
	public Etab_persId(String cod_soc, String mat_pers, long num_etablis) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.num_etablis = num_etablis;
	}
	public Etab_persId() {
		super();
	}

}
