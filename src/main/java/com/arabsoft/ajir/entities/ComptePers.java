package com.arabsoft.ajir.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@IdClass(ComptePersID.class)
public class ComptePers {
	
	@Id
	@JsonProperty(access = Access.WRITE_ONLY)
	private String cod_soc;
	@Id
	@JsonProperty(access = Access.WRITE_ONLY)
	private String mat_pers;
	@Id
	private String cod_typ_bul;
	@Id
	private String cpt_banq_pers;
	private String lib_bul;
	private String cod_banq;
	private String lib_banq;
	private String cod_agc;
	private String lib_agc;
	private String etat_dom;
	private String num_dom;
	private String compt_cou;
	private String cod_banq_soc;
	private String cod_agc_soc;
	private Integer id_compte_pers;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dat_dom;
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
	public String getLib_bul() {
		return lib_bul;
	}
	public void setLib_bul(String lib_bul) {
		this.lib_bul = lib_bul;
	}
	public String getCod_banq() {
		return cod_banq;
	}
	public void setCod_banq(String cod_banq) {
		this.cod_banq = cod_banq;
	}
	public String getLib_banq() {
		return lib_banq;
	}
	public void setLib_banq(String lib_banq) {
		this.lib_banq = lib_banq;
	}
	public String getCod_agc() {
		return cod_agc;
	}
	public void setCod_agc(String cod_agc) {
		this.cod_agc = cod_agc;
	}
	public String getLib_agc() {
		return lib_agc;
	}
	public void setLib_agc(String lib_agc) {
		this.lib_agc = lib_agc;
	}
	public String getEtat_dom() {
		return etat_dom;
	}
	public void setEtat_dom(String etat_dom) {
		this.etat_dom = etat_dom;
	}
	public String getNum_dom() {
		return num_dom;
	}
	public void setNum_dom(String num_dom) {
		this.num_dom = num_dom;
	}
	public String getCompt_cou() {
		return compt_cou;
	}
	public void setCompt_cou(String compt_cou) {
		this.compt_cou = compt_cou;
	}
	public String getCod_banq_soc() {
		return cod_banq_soc;
	}
	public void setCod_banq_soc(String cod_banq_soc) {
		this.cod_banq_soc = cod_banq_soc;
	}
	public String getCod_agc_soc() {
		return cod_agc_soc;
	}
	public void setCod_agc_soc(String cod_agc_soc) {
		this.cod_agc_soc = cod_agc_soc;
	}
	public Integer getId_compte_pers() {
		return id_compte_pers;
	}
	public void setId_compte_pers(Integer id_compte_pers) {
		this.id_compte_pers = id_compte_pers;
	}
	public Date getDat_dom() {
		return dat_dom;
	}
	public void setDat_dom(Date dat_dom) {
		this.dat_dom = dat_dom;
	}
	public ComptePers(String cod_soc, String mat_pers, String cod_typ_bul, String cpt_banq_pers, String lib_bul,
			String cod_banq, String lib_banq, String cod_agc, String lib_agc, String etat_dom, String num_dom,
			String compt_cou, String cod_banq_soc, String cod_agc_soc, Integer id_compte_pers, Date dat_dom) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.cod_typ_bul = cod_typ_bul;
		this.cpt_banq_pers = cpt_banq_pers;
		this.lib_bul = lib_bul;
		this.cod_banq = cod_banq;
		this.lib_banq = lib_banq;
		this.cod_agc = cod_agc;
		this.lib_agc = lib_agc;
		this.etat_dom = etat_dom;
		this.num_dom = num_dom;
		this.compt_cou = compt_cou;
		this.cod_banq_soc = cod_banq_soc;
		this.cod_agc_soc = cod_agc_soc;
		this.id_compte_pers = id_compte_pers;
		this.dat_dom = dat_dom;
	}
	public ComptePers() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ComptePers {cod_soc=" + cod_soc + ", mat_pers=" + mat_pers + "}";
	}
	
}
