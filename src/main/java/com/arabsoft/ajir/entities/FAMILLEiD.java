package com.arabsoft.ajir.entities;

import java.io.Serializable;

public class FAMILLEiD implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cod_soc;
	private String mat_pers;
	private long num_fam;
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
	public long getNum_fam() {
		return num_fam;
	}
	public void setNum_fam(long num_fam) {
		this.num_fam = num_fam;
	}
	public FAMILLEiD(String cod_soc, String mat_pers, long num_fam) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.num_fam = num_fam;
	}
	public FAMILLEiD() {
		super();
	}
	
	

}
