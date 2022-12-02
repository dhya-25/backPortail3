package com.arabsoft.ajir.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;


public class CalPersPK implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(insertable = false,updatable = false)

	private String cod_soc   ;
	@Column(insertable = false,updatable = false)
private String  mat_pers ;
	@Column(insertable = false,updatable = false)
private Long  years ;
	@Column(insertable = false,updatable = false)
private Long  months  ;
	@Column(insertable = false,updatable = false)
private Long  days  ;
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
	public Long getYears() {
		return years;
	}
	public void setYears(Long years) {
		this.years = years;
	}
	public Long getMonths() {
		return months;
	}
	public void setMonths(Long months) {
		this.months = months;
	}
	public Long getDays() {
		return days;
	}
	public void setDays(Long days) {
		this.days = days;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cod_soc, days, mat_pers, months, years);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CalPersPK other = (CalPersPK) obj;
		return Objects.equals(cod_soc, other.cod_soc) && Objects.equals(days, other.days)
				&& Objects.equals(mat_pers, other.mat_pers) && Objects.equals(months, other.months)
				&& Objects.equals(years, other.years);
	}
	
	
}
