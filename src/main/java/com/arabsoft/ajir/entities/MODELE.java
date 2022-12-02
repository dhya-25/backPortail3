package com.arabsoft.ajir.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class MODELE {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private String  ref_mod;
	private String  libelle_mod ;
	 private Date dat_creat ;
	private String typ_mod ;
	private String cod_metier  ;
	private String  cod_post;
	public String getRef_mod() {
		return ref_mod;
	}
	public void setRef_mod(String ref_mod) {
		this.ref_mod = ref_mod;
	}
	public String getLibelle_mod() {
		return libelle_mod;
	}
	public void setLibelle_mod(String libelle_mod) {
		this.libelle_mod = libelle_mod;
	}
	public Date getDat_creat() {
		return dat_creat;
	}
	public void setDat_creat(Date dat_creat) {
		this.dat_creat = dat_creat;
	}
	public String getTyp_mod() {
		return typ_mod;
	}
	public void setTyp_mod(String typ_mod) {
		this.typ_mod = typ_mod;
	}
	public String getCod_metier() {
		return cod_metier;
	}
	public void setCod_metier(String cod_metier) {
		this.cod_metier = cod_metier;
	}
	public String getCod_post() {
		return cod_post;
	}
	public void setCod_post(String cod_post) {
		this.cod_post = cod_post;
	}
	public MODELE() {
		super();
	}
	public MODELE(String ref_mod, String libelle_mod, Date dat_creat, String typ_mod, String cod_metier,
			String cod_post) {
		super();
		this.ref_mod = ref_mod;
		this.libelle_mod = libelle_mod;
		this.dat_creat = dat_creat;
		this.typ_mod = typ_mod;
		this.cod_metier = cod_metier;
		this.cod_post = cod_post;
	}  
	

}
