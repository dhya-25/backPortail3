package com.arabsoft.ajir.entities;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TYPE_FORMATION")

public class TypeFormation {
	@EmbeddedId
	public TypeFormationPK id;
	@Column(name="COD_TYP",insertable = false,updatable = false)
	public String cod_typ  ;    
	@Column(name="LIB_TYP")
	public String  lib_typ   ;      
	@Column(name="COD_RUB_BUDG")
	public String cod_rub_budg  ;  
	@Column(name="LIB_TYP_A")
	public String  lib_typ_a     ;   
	@Column(name="ABRV_TYP_FORM")
	public String  abrv_typ_form   ;  
	@Column(name="COD_TIT",insertable = false,updatable = false)
	public String  cod_tit      ;    
	@Column(name="COD_NAT")
	public String  cod_nat     ;      
	@Column(name="TYP_STAGE")
	public String  typ_stage  ;
	@Column(name="ID_TYPE_FORMATION")
	public String  id_type_formation  ;
	public TypeFormationPK getId() {
		return id;
	}
	public void setId(TypeFormationPK id) {
		this.id = id;
	}
	public String getCod_typ() {
		return cod_typ;
	}
	public void setCod_typ(String cod_typ) {
		this.cod_typ = cod_typ;
	}
	public String getLib_typ() {
		return lib_typ;
	}
	public void setLib_typ(String lib_typ) {
		this.lib_typ = lib_typ;
	}
	public String getCod_rub_budg() {
		return cod_rub_budg;
	}
	public void setCod_rub_budg(String cod_rub_budg) {
		this.cod_rub_budg = cod_rub_budg;
	}
	public String getLib_typ_a() {
		return lib_typ_a;
	}
	public void setLib_typ_a(String lib_typ_a) {
		this.lib_typ_a = lib_typ_a;
	}
	public String getAbrv_typ_form() {
		return abrv_typ_form;
	}
	public void setAbrv_typ_form(String abrv_typ_form) {
		this.abrv_typ_form = abrv_typ_form;
	}
	public String getCod_tit() {
		return cod_tit;
	}
	public void setCod_tit(String cod_tit) {
		this.cod_tit = cod_tit;
	}
	public String getCod_nat() {
		return cod_nat;
	}
	public void setCod_nat(String cod_nat) {
		this.cod_nat = cod_nat;
	}
	public String getTyp_stage() {
		return typ_stage;
	}
	public void setTyp_stage(String typ_stage) {
		this.typ_stage = typ_stage;
	}
	public String getId_type_formation() {
		return id_type_formation;
	}
	public void setId_type_formation(String id_type_formation) {
		this.id_type_formation = id_type_formation;
	}
	
	
	
}
	 
