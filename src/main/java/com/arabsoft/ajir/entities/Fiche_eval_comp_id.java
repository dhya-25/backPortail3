package com.arabsoft.ajir.entities;

import java.io.Serializable;
import java.util.Date;

public class Fiche_eval_comp_id implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String  cod_soc ;
	 private String  mat_pers ;
	 private String ref_mod  ;  
	  private Date dat_eval ;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Fiche_eval_comp_id() {
		super();
	}
	public Fiche_eval_comp_id(String cod_soc, String mat_pers, String ref_mod, Date dat_eval) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.ref_mod = ref_mod;
		this.dat_eval = dat_eval;
	}
	
	  
	  


}
