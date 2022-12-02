package com.arabsoft.ajir.entities;

import java.io.Serializable;

public class ComptePersID implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String cod_soc;
	private String mat_pers;
	private String cod_typ_bul;
	private String cpt_banq_pers;
	public ComptePersID(String cod_soc, String mat_pers, String cod_typ_bul, String cpt_banq_pers) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.cod_typ_bul = cod_typ_bul;
		this.cpt_banq_pers = cpt_banq_pers;
	}
	public ComptePersID() {
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
	public String getCod_typ_bul() {
		return cod_typ_bul;
	}
	public void setCod_typ_bul(String cod_typ_bul) {
		this.cod_typ_bul = cod_typ_bul;
	}
	public String getCpt_banq_pers() {
		return cpt_banq_pers;
	}
	public void setCpt_banq_pers(String cpt_banq_pers) {
		this.cpt_banq_pers = cpt_banq_pers;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
