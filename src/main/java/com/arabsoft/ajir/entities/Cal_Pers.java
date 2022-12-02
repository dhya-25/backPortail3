package com.arabsoft.ajir.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "CAL_PERS")
public class Cal_Pers implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	

	private CalPersPK id;
	@Column(name="COD_SOC",insertable = false,updatable = false)

	private String cod_soc   ;
	@Column(name="MAT_PERS",insertable = false,updatable = false)
private String  mat_pers ;
	@Column(name="YEARS",insertable = false,updatable = false)
private Long  years ;
	@Column(name="MONTHS",insertable = false,updatable = false)
private Long  months  ;
	@Column(name="DAYS",insertable = false,updatable = false)
private Long  days  ;
	
	@Column(name="J_SEMAINE")
private Long  j_semaine ;
	@Column(name="COD_M")
private String  cod_m ;
	@Column(name="SEMAINE")
private Long  semaine  ;
	@Column(name="PREC_COD_M")
private String  prec_cod_m ;
	@Column(name="BASE_H")
private Long  base_h  ;
	@Column(name="BASE_M")
private Long  base_m   ;
	@Column(name="PAUSE_SHIFT")
	private Long  pause_shift;
	@Column(name="MARG_SHIFT")
	private Long  marg_shift;
	@Column(name="COD_REG")
	private String  cod_reg  ;
	@Column(name="COD_SERV")
	private String  cod_serv  ;
	@Column(name="PRES_H")
	private Long  pres_h   ;
	@Column(name="PRES_M")
	private String  pres_m ;
	@Column(name="COD_FIL")
	private String  cod_fil  ;
	@Column(name="REGIME_TRAV")
	private String  regime_trav;
	@Column(name="REGIME_HEUR")
	private Long  regime_heur;
	@Column(name="DROIT_ASTR")
	private String  droit_astr;
	@JsonFormat(pattern = "dd/MM/yyyy")
	@Column(name="DT_BUL")
	private Date  dt_bul  ;
	@Column(name="COD_TYP_BUL")
	private String  cod_typ_bul ;
	@Column(name="ID_CAL_PERS")
	private Long  id_cal_pers ;
	@Column(name="UNITE")
	private String  unite   ;
	@Column(name="SEANCE")
	private String  seance ;
	@Column(insertable = false,updatable = false)

	private String dateC;
	
	@Column(insertable = false,updatable = false)

	private String lib_mot;
	@Column(insertable = false,updatable = false)

	private String fin;
	
	
	public String getFin() {
		return fin;
	}
	public void setFin(String fin) {
		this.fin = fin;
	}
	public CalPersPK getId() {
		return id;
	}
	public void setId(CalPersPK id) {
		this.id = id;
	}
	public Long getJ_semaine() {
		return j_semaine;
	}
	public void setJ_semaine(Long j_semaine) {
		this.j_semaine = j_semaine;
	}
	public String getCod_m() {
		return cod_m;
	}
	public void setCod_m(String cod_m) {
		this.cod_m = cod_m;
	}
	public Long getSemaine() {
		return semaine;
	}
	public void setSemaine(Long semaine) {
		this.semaine = semaine;
	}
	public String getPrec_cod_m() {
		return prec_cod_m;
	}
	public void setPrec_cod_m(String prec_cod_m) {
		this.prec_cod_m = prec_cod_m;
	}
	public Long getBase_h() {
		return base_h;
	}
	public void setBase_h(Long base_h) {
		this.base_h = base_h;
	}
	public Long getBase_m() {
		return base_m;
	}
	public void setBase_m(Long base_m) {
		this.base_m = base_m;
	}
	public Long getPause_shift() {
		return pause_shift;
	}
	public void setPause_shift(Long pause_shift) {
		this.pause_shift = pause_shift;
	}
	public Long getMarg_shift() {
		return marg_shift;
	}
	public void setMarg_shift(Long marg_shift) {
		this.marg_shift = marg_shift;
	}
	public String getCod_reg() {
		return cod_reg;
	}
	public void setCod_reg(String cod_reg) {
		this.cod_reg = cod_reg;
	}
	public String getCod_serv() {
		return cod_serv;
	}
	public void setCod_serv(String cod_serv) {
		this.cod_serv = cod_serv;
	}
	public Long getPres_h() {
		return pres_h;
	}
	public void setPres_h(Long pres_h) {
		this.pres_h = pres_h;
	}
	public String getPres_m() {
		return pres_m;
	}
	public void setPres_m(String pres_m) {
		this.pres_m = pres_m;
	}
	public String getCod_fil() {
		return cod_fil;
	}
	public void setCod_fil(String cod_fil) {
		this.cod_fil = cod_fil;
	}
	public String getRegime_trav() {
		return regime_trav;
	}
	public void setRegime_trav(String regime_trav) {
		this.regime_trav = regime_trav;
	}
	public Long getRegime_heur() {
		return regime_heur;
	}
	public void setRegime_heur(Long regime_heur) {
		this.regime_heur = regime_heur;
	}
	public String getDroit_astr() {
		return droit_astr;
	}
	public void setDroit_astr(String droit_astr) {
		this.droit_astr = droit_astr;
	}
	public Date getDt_bul() {
		return dt_bul;
	}
	public void setDt_bul(Date dt_bul) {
		this.dt_bul = dt_bul;
	}
	public String getCod_typ_bul() {
		return cod_typ_bul;
	}
	public void setCod_typ_bul(String cod_typ_bul) {
		this.cod_typ_bul = cod_typ_bul;
	}
	public Long getId_cal_pers() {
		return id_cal_pers;
	}
	public void setId_cal_pers(Long id_cal_pers) {
		this.id_cal_pers = id_cal_pers;
	}
	public String getUnite() {
		return unite;
	}
	public void setUnite(String unite) {
		this.unite = unite;
	}
	public String getSeance() {
		return seance;
	}
	public void setSeance(String seance) {
		this.seance = seance;
	}
	
	public String getDateC() {
		return dateC;
	}
	public void setDateC(String dateC) {
		this.dateC = dateC;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getLib_mot() {
		return lib_mot;
	}
	public void setLib_mot(String lib_mot) {
		this.lib_mot = lib_mot;
	}

}
