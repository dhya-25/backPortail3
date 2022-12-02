package com.arabsoft.ajir.entities;

import java.io.Serializable;
import java.util.Date;



public class Pk_ValeurFicheEval implements Serializable {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cod_soc;
	 private String  mat_pers;
	 private String ref_mod;
	  private Date dat_eval;
	  private String  cod_nat_comp ;
	  private String cod_comp;
	  private String cod_crit_comp;
	  private String cod_val;
	public Pk_ValeurFicheEval() {
		super();
	}
	public Pk_ValeurFicheEval(String cod_soc, String mat_pers, String ref_mod, Date dat_eval, String cod_nat_comp,
			String cod_comp, String cod_crit_comp, String cod_val) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.ref_mod = ref_mod;
		this.dat_eval = dat_eval;
		this.cod_nat_comp = cod_nat_comp;
		this.cod_comp = cod_comp;
		this.cod_crit_comp = cod_crit_comp;
		this.cod_val = cod_val;
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
	public String getCod_nat_comp() {
		return cod_nat_comp;
	}
	public void setCod_nat_comp(String cod_nat_comp) {
		this.cod_nat_comp = cod_nat_comp;
	}
	public String getCod_comp() {
		return cod_comp;
	}
	public void setCod_comp(String cod_comp) {
		this.cod_comp = cod_comp;
	}
	public String getCod_crit_comp() {
		return cod_crit_comp;
	}
	public void setCod_crit_comp(String cod_crit_comp) {
		this.cod_crit_comp = cod_crit_comp;
	}
	public String getCod_val() {
		return cod_val;
	}
	public void setCod_val(String cod_val) {
		this.cod_val = cod_val;
	}
	  

}
