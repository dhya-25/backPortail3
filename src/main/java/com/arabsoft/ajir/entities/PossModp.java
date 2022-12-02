package com.arabsoft.ajir.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@IdClass(PossModpID.class)
public class PossModp {
	
	@Id
	@JsonProperty(access = Access.WRITE_ONLY)
	private String cod_soc;
	@Id
	@JsonProperty(access = Access.WRITE_ONLY)
	private String mat_pers;
	@Id
	@JsonProperty(access = Access.READ_WRITE)
	private String cod_pay;
	@Id
	@JsonProperty(access = Access.READ_WRITE)
	private String cod_typ_bul;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date date_modp;
	private Integer id_poss_modp;
	private String cod_user;
	@Column(insertable = false, updatable = false)

	private String lib_bul;
	
	
	public PossModp(String cod_soc, String mat_pers, String cod_pay, String cod_typ_bul, Date date_modp,
			Integer id_poss_modp, String cod_user, String lib_bul, List<ComptePers> comptes_pers) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.cod_pay = cod_pay;
		this.cod_typ_bul = cod_typ_bul;
		this.date_modp = date_modp;
		this.id_poss_modp = id_poss_modp;
		this.cod_user = cod_user;
		this.lib_bul = lib_bul;
		this.comptes_pers = comptes_pers;
	}
	public String getLib_bul() {
		return lib_bul;
	}
	public void setLib_bul(String lib_bul) {
		this.lib_bul = lib_bul;
	}
	@Transient
	private List<ComptePers> comptes_pers;
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
	public String getCod_pay() {
		return cod_pay;
	}
	public void setCod_pay(String cod_pay) {
		this.cod_pay = cod_pay;
	}
	public String getCod_typ_bul() {
		return cod_typ_bul;
	}
	public void setCod_typ_bul(String cod_typ_bul) {
		this.cod_typ_bul = cod_typ_bul;
	}
	public Date getDate_modp() {
		return date_modp;
	}
	public void setDate_modp(Date date_modp) {
		this.date_modp = date_modp;
	}
	public Integer getId_poss_modp() {
		return id_poss_modp;
	}
	public void setId_poss_modp(Integer id_poss_modp) {
		this.id_poss_modp = id_poss_modp;
	}
	public String getCod_user() {
		return cod_user;
	}
	public void setCod_user(String cod_user) {
		this.cod_user = cod_user;
	}
	
	public List<ComptePers> getComptes_pers() {
		return comptes_pers;
	}
	
	
	
	public void setComptes_pers(List<ComptePers> comptes_pers) {
		this.comptes_pers = comptes_pers;
	}
	public PossModp(String cod_soc, String mat_pers, String cod_pay, String cod_typ_bul, Date date_modp,
			Integer id_poss_modp, String cod_user,List<ComptePers> comptes_pers) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.cod_pay = cod_pay;
		this.cod_typ_bul = cod_typ_bul;
		this.date_modp = date_modp;
		this.id_poss_modp = id_poss_modp;
		this.cod_user = cod_user;
		this.comptes_pers = comptes_pers;
	}
	public PossModp() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PossModp {cod_soc=" + cod_soc + ", mat_pers=" + mat_pers + "}";
	}
}
