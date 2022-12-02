package com.arabsoft.ajir.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TYP_AUTORISATION")
public class Type_autorisation {
	@Id
	@Column(name="COD_TYP_AUT")
	private String cod_typ_aut;
	@Column(name="LIB_TYP_AUT")
	private String  lib_typ_aut ;
	@Column(name="LIB_TYP_AUT_A")
	private String  lib_typ_aut_a ;
	@Column(name="NAT_TYP_AUT")
    private String  nat_typ_aut ;
	@Column(name="PLAF_PAY")
	private Long  plaf_pay  ;
	public String getCod_typ_aut() {
		return cod_typ_aut;
	}
	public void setCod_typ_aut(String cod_typ_aut) {
		this.cod_typ_aut = cod_typ_aut;
	}
	public String getLib_typ_aut() {
		return lib_typ_aut;
	}
	public void setLib_typ_aut(String lib_typ_aut) {
		this.lib_typ_aut = lib_typ_aut;
	}
	public String getLib_typ_aut_a() {
		return lib_typ_aut_a;
	}
	public void setLib_typ_aut_a(String lib_typ_aut_a) {
		this.lib_typ_aut_a = lib_typ_aut_a;
	}
	public String getNat_typ_aut() {
		return nat_typ_aut;
	}
	public void setNat_typ_aut(String nat_typ_aut) {
		this.nat_typ_aut = nat_typ_aut;
	}
	public Long getPlaf_pay() {
		return plaf_pay;
	}
	public void setPlaf_pay(Long plaf_pay) {
		this.plaf_pay = plaf_pay;
	}
	
	
}
