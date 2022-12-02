package com.arabsoft.ajir.entities;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="GROUPE_PRET")

public class Groupe_pret {
	
	@EmbeddedId
	private Groupe_pretPK id;
	@Column(name="COD_SOC",insertable = false,updatable = false) 
	private String  cod_soc;  
	@Column(name="COD_GRP_PRET",insertable = false,updatable = false) 
	private String cod_grp_pret   ;
	@Column(name="LIB_GRP_PRET") 
	private String  lib_grp_pret;  
	@Column(name="TYP_GROUPE") 
	private String typ_groupe   ;
	@Column(name="LIB_GRP_PRET_A") 
	private String  lib_grp_pret_a ;
	@Column(name="TYPE_PRET") 
	private String  type_pret  ; 
	@Column(name="POURC_BUDG") 
	private Long  pourc_budg ;   
	@Column(name="ID_GROUPE_PRET") 
	private Long  id_groupe_pret;
	public Groupe_pret() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Groupe_pret(Groupe_pretPK id, String lib_grp_pret, String typ_groupe, String lib_grp_pret_a,
			String type_pret, Long pourc_budg, Long id_groupe_pret) {
		super();
		this.id = id;
		this.lib_grp_pret = lib_grp_pret;
		this.typ_groupe = typ_groupe;
		this.lib_grp_pret_a = lib_grp_pret_a;
		this.type_pret = type_pret;
		this.pourc_budg = pourc_budg;
		this.id_groupe_pret = id_groupe_pret;
	}

	public String getCod_soc() {
		return cod_soc;
	}

	public void setCod_soc(String cod_soc) {
		this.cod_soc = cod_soc;
	}

	public String getCod_grp_pret() {
		return cod_grp_pret;
	}

	public void setCod_grp_pret(String cod_grp_pret) {
		this.cod_grp_pret = cod_grp_pret;
	}

	public Groupe_pretPK getId() {
		return id;
	}

	public void setId(Groupe_pretPK id) {
		this.id = id;
	}

	public String getLib_grp_pret() {
		return lib_grp_pret;
	}
	public void setLib_grp_pret(String lib_grp_pret) {
		this.lib_grp_pret = lib_grp_pret;
	}
	public String getTyp_groupe() {
		return typ_groupe;
	}
	public void setTyp_groupe(String typ_groupe) {
		this.typ_groupe = typ_groupe;
	}
	public String getLib_grp_pret_a() {
		return lib_grp_pret_a;
	}
	public void setLib_grp_pret_a(String lib_grp_pret_a) {
		this.lib_grp_pret_a = lib_grp_pret_a;
	}
	public String getType_pret() {
		return type_pret;
	}
	public void setType_pret(String type_pret) {
		this.type_pret = type_pret;
	}
	public Long getPourc_budg() {
		return pourc_budg;
	}
	public void setPourc_budg(Long pourc_budg) {
		this.pourc_budg = pourc_budg;
	}
	public Long getId_groupe_pret() {
		return id_groupe_pret;
	}
	public void setId_groupe_pret(Long id_groupe_pret) {
		this.id_groupe_pret = id_groupe_pret;
	}
	
	

}
