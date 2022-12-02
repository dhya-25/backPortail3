package com.arabsoft.ajir.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@IdClass(AfillPersId.class)
public class AFFIL_PERS {
	@Id
	private String cod_soc  ;  
	@Id
	private String mat_pers ;
	@Id
	private String  cod_affil  ; 
	@Id
	private String typ_affil  ;  
	@JsonFormat( pattern = "dd/MM/yyyy") 

	 private Date dat_affil  ;   
	  private Long id_affil_pers ;
		@JsonFormat( pattern = "dd/MM/yyyy") 

	  private Date  dat_fin  ;
	  private String num_affil   ; 
	  private String  cod_user  ;
	public AFFIL_PERS() {
		super();
	}
	public AFFIL_PERS(String cod_soc, String mat_pers, String cod_affil, String typ_affil, Date dat_affil,
			Long id_affil_pers, Date dat_fin, String num_affil, String cod_user) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.cod_affil = cod_affil;
		this.typ_affil = typ_affil;
		this.dat_affil = dat_affil;
		this.id_affil_pers = id_affil_pers;
		this.dat_fin = dat_fin;
		this.num_affil = num_affil;
		this.cod_user = cod_user;
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
	public String getCod_affil() {
		return cod_affil;
	}
	public void setCod_affil(String cod_affil) {
		this.cod_affil = cod_affil;
	}
	public String getTyp_affil() {
		return typ_affil;
	}
	public void setTyp_affil(String typ_affil) {
		this.typ_affil = typ_affil;
	}
	public Date getDat_affil() {
		return dat_affil;
	}
	public void setDat_affil(Date dat_affil) {
		this.dat_affil = dat_affil;
	}
	public Long getId_affil_pers() {
		return id_affil_pers;
	}
	public void setId_affil_pers(Long id_affil_pers) {
		this.id_affil_pers = id_affil_pers;
	}
	public Date getDat_fin() {
		return dat_fin;
	}
	public void setDat_fin(Date dat_fin) {
		this.dat_fin = dat_fin;
	}
	public String getNum_affil() {
		return num_affil;
	}
	public void setNum_affil(String num_affil) {
		this.num_affil = num_affil;
	}
	public String getCod_user() {
		return cod_user;
	}
	public void setCod_user(String cod_user) {
		this.cod_user = cod_user;
	}
	  

}
