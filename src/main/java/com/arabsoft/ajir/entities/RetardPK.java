package com.arabsoft.ajir.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonFormat;

public class RetardPK implements Serializable {

private static final long serialVersionUID = 1L;
	
	
	@Column(insertable = false,updatable = false)
	private String cod_soc;	
	@Column(insertable = false,updatable = false)
	private String  mat_pers;	
	
	@Column(insertable = false, updatable= false )
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dat_point;	
	@Column(insertable = false,updatable = false)
	private Long num_point;
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
	public Date getDat_point() {
		return dat_point;
	}
	public void setDat_point(Date dat_point) {
		this.dat_point = dat_point;
	}
	public Long getNum_point() {
		return num_point;
	}
	public void setNum_point(Long num_point) {
		this.num_point = num_point;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "RetardPK [cod_soc=" + cod_soc + ", mat_pers=" + mat_pers + ", dat_point=" + dat_point + ", num_point="
				+ num_point + "]";
	}
	public RetardPK(String cod_soc, String mat_pers, Date dat_point, Long num_point) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.dat_point = dat_point;
		this.num_point = num_point;
	}
	public RetardPK() {
		super();
	}
	
	

}
