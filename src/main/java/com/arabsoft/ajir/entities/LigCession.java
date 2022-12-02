package com.arabsoft.ajir.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import com.fasterxml.jackson.annotation.JsonFormat;



@Entity
@IdClass(CleLigCession.class)
public class LigCession implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    private String cod_soc;
	@Id
	private String mat_pers;
	@Id
	private Integer cod_pret;
	@Id
	private Long l_pret;
	
    public String cod_typ_bul;
    @JsonFormat(pattern = "dd/MM/yyyy")
    public Date mois_pret_prevu;
    @JsonFormat(pattern = "dd/MM/yyyy")
    public Date mois_pret;
	
    public Long mnt_period;

    public Long cap_rest;
	

    public String val_pret;
	

    public String reg_pret;
    

    public String nature_etat_pret;
    

    public Long id_lig_cession;
    
    public String libBulletin;


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


	public Integer getCod_pret() {
		return cod_pret;
	}


	public void setCod_pret(Integer cod_pret) {
		this.cod_pret = cod_pret;
	}


	public Long getL_pret() {
		return l_pret;
	}


	public void setL_pret(Long l_pret) {
		this.l_pret = l_pret;
	}


	public String getCod_typ_bul() {
		return cod_typ_bul;
	}


	public void setCod_typ_bul(String cod_typ_bul) {
		this.cod_typ_bul = cod_typ_bul;
	}


	public Date getMois_pret_prevu() {
		return mois_pret_prevu;
	}


	public void setMois_pret_prevu(Date mois_pret_prevu) {
		this.mois_pret_prevu = mois_pret_prevu;
	}


	public Date getMois_pret() {
		return mois_pret;
	}


	public void setMois_pret(Date mois_pret) {
		this.mois_pret = mois_pret;
	}


	public Long getMnt_period() {
		return mnt_period;
	}


	public void setMnt_period(Long mnt_period) {
		this.mnt_period = mnt_period;
	}


	public Long getCap_rest() {
		return cap_rest;
	}


	public void setCap_rest(Long cap_rest) {
		this.cap_rest = cap_rest;
	}


	public String getVal_pret() {
		return val_pret;
	}


	public void setVal_pret(String val_pret) {
		this.val_pret = val_pret;
	}


	public String getReg_pret() {
		return reg_pret;
	}


	public void setReg_pret(String reg_pret) {
		this.reg_pret = reg_pret;
	}


	public String getNature_etat_pret() {
		return nature_etat_pret;
	}


	public void setNature_etat_pret(String nature_etat_pret) {
		this.nature_etat_pret = nature_etat_pret;
	}


	public Long getId_lig_cession() {
		return id_lig_cession;
	}


	public void setId_lig_cession(Long id_lig_cession) {
		this.id_lig_cession = id_lig_cession;
	}



	public String getLibBulletin() {
		return libBulletin;
	}


	public void setLibBulletin(String libBulletin) {
		this.libBulletin = libBulletin;
	}


	public LigCession(String cod_soc, String mat_pers, Integer cod_pret, Long l_pret, String cod_typ_bul,
			Date mois_pret_prevu, Date mois_pret, Long mnt_period, Long cap_rest, String val_pret, String reg_pret,
			String nature_etat_pret, Long id_lig_cession, String libBulletin) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.cod_pret = cod_pret;
		this.l_pret = l_pret;
		this.cod_typ_bul = cod_typ_bul;
		this.mois_pret_prevu = mois_pret_prevu;
		this.mois_pret = mois_pret;
		this.mnt_period = mnt_period;
		this.cap_rest = cap_rest;
		this.val_pret = val_pret;
		this.reg_pret = reg_pret;
		this.nature_etat_pret = nature_etat_pret;
		this.id_lig_cession = id_lig_cession;
		this.libBulletin = libBulletin;
	}


	public LigCession() {
		super();
		// TODO Auto-generated constructor stub
	}
	

    
}
