package com.arabsoft.ajir.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@IdClass(PossedeId.class)
public class POSSEDE {
	@Id
	private String cod_soc;
	@Id
	private String mat_pers;
	@Id
	private String abrv_fixe;
	@JsonFormat(pattern = "dd/MM/yyyy")

	private Date date_ind;
	private Long montant;
	private String type_par;
	private Long cod_niv;
	private Long num_niv;
	@JsonFormat(pattern = "dd/MM/yyyy")

	private Date date_ind_fin;
	private Long id_possede;
	private String cod_user;
	@Column(insertable = false, updatable = false)
@Transient
	private String lib_ind;
	


	
	public POSSEDE(String cod_soc, String mat_pers, String abrv_fixe, Date date_ind, Long montant, String type_par,
			Long cod_niv, Long num_niv, Date date_ind_fin, Long id_possede, String cod_user, String lib_ind) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.abrv_fixe = abrv_fixe;
		this.date_ind = date_ind;
		this.montant = montant;
		this.type_par = type_par;
		this.cod_niv = cod_niv;
		this.num_niv = num_niv;
		this.date_ind_fin = date_ind_fin;
		this.id_possede = id_possede;
		this.cod_user = cod_user;
		this.lib_ind = lib_ind;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public String getLib_ind() {
		return lib_ind;
	}

	public void setLib_ind(String lib_ind) {
		this.lib_ind = lib_ind;
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

	public String getAbrv_fixe() {
		return abrv_fixe;
	}

	public void setAbrv_fixe(String abrv_fixe) {
		this.abrv_fixe = abrv_fixe;
	}

	public Date getDate_ind() {
		return date_ind;
	}

	public void setDate_ind(Date date_ind) {
		this.date_ind = date_ind;
	}

	public Long getMontant() {
		return montant;
	}

	public void setMontant(Long montant) {
		this.montant = montant;
	}

	public String getType_par() {
		return type_par;
	}

	public void setType_par(String type_par) {
		this.type_par = type_par;
	}

	public Long getCod_niv() {
		return cod_niv;
	}

	public void setCod_niv(Long cod_niv) {
		this.cod_niv = cod_niv;
	}

	public Long getNum_niv() {
		return num_niv;
	}

	public void setNum_niv(Long num_niv) {
		this.num_niv = num_niv;
	}

	public Date getDate_ind_fin() {
		return date_ind_fin;
	}

	public void setDate_ind_fin(Date date_ind_fin) {
		this.date_ind_fin = date_ind_fin;
	}

	public Long getId_possede() {
		return id_possede;
	}

	public void setId_possede(Long id_possede) {
		this.id_possede = id_possede;
	}

	public String getCod_user() {
		return cod_user;
	}

	public void setCod_user(String cod_user) {
		this.cod_user = cod_user;
	}

	public POSSEDE() {
		super();
	}

	public POSSEDE(String cod_soc, String mat_pers, String abrv_fixe, Date date_ind, Long montant, String type_par,
			Long cod_niv, Long num_niv, Date date_ind_fin, Long id_possede, String cod_user) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.abrv_fixe = abrv_fixe;
		this.date_ind = date_ind;
		this.montant = montant;
		this.type_par = type_par;
		this.cod_niv = cod_niv;
		this.num_niv = num_niv;
		this.date_ind_fin = date_ind_fin;
		this.id_possede = id_possede;
		this.cod_user = cod_user;
	}

}
