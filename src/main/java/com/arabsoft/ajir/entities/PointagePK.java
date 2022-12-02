package com.arabsoft.ajir.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;

public class PointagePK implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	@Column(insertable = false,updatable = false)
	private String cod_soc;	
	@Column(insertable = false,updatable = false)
	private String  mat_pers;	
	@Column(insertable = false,updatable = false)
	private Long h_point;
	@Column(insertable = false, updatable= false ) 
	private Long  min_point;	
	@Column(insertable = false, updatable= false ) 
	private Date date_point;	
	@Column(insertable = false, updatable= false ) 
	private Date  date_j_point;
	
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

	public Long getH_point() {
		return h_point;
	}

	public void setH_point(Long h_point) {
		this.h_point = h_point;
	}

	public Long getMin_point() {
		return min_point;
	}

	public void setMin_point(Long min_point) {
		this.min_point = min_point;
	}

	public Date getDate_point() {
		return date_point;
	}

	public void setDate_point(Date date_point) {
		this.date_point = date_point;
	}

	public Date getDate_j_point() {
		return date_j_point;
	}

	public void setDate_j_point(Date date_j_point) {
		this.date_j_point = date_j_point;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "PointagePK [cod_soc=" + cod_soc + ", mat_pers=" + mat_pers + ", h_point=" + h_point + ", min_point="
				+ min_point + ", date_point=" + date_point + ", date_j_point=" + date_j_point + "]";
	}

	public PointagePK(String cod_soc, String mat_pers, Long h_point, Long min_point, Date date_point,
			Date date_j_point) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.h_point = h_point;
		this.min_point = min_point;
		this.date_point = date_point;
		this.date_j_point = date_j_point;
	}

	public PointagePK() {
		super();
	}
	
	

}
