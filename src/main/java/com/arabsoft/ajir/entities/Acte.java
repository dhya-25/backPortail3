package com.arabsoft.ajir.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;



@Entity
@IdClass(CleActe.class)
public class Acte {

	@Id
	public Long type_act;
	@Id
	public String abrv_act;
	
	public String lib_act;
	public String a_indice;
	public Long mtt_acte;
	public Date dat_acte;
	public Long taux_act;
	public String plafonne;
	public Long plafond;
	public String verif_piece;
	public String nat_act;
	public String verif_vign;
	public String duree_act;
	public Long taux_avance;
	public String type_plafond;
	public Long id_acte;
	public Long getType_act() {
		return type_act;
	}
	public void setType_act(Long type_act) {
		this.type_act = type_act;
	}
	public String getAbrv_act() {
		return abrv_act;
	}
	public void setAbrv_act(String abrv_act) {
		this.abrv_act = abrv_act;
	}
	public String getLib_act() {
		return lib_act;
	}
	public void setLib_act(String lib_act) {
		this.lib_act = lib_act;
	}
	public String getA_indice() {
		return a_indice;
	}
	public void setA_indice(String a_indice) {
		this.a_indice = a_indice;
	}
	public Long getMtt_acte() {
		return mtt_acte;
	}
	public void setMtt_acte(Long mtt_acte) {
		this.mtt_acte = mtt_acte;
	}
	public Date getDat_acte() {
		return dat_acte;
	}
	public void setDat_acte(Date dat_acte) {
		this.dat_acte = dat_acte;
	}
	public Long getTaux_act() {
		return taux_act;
	}
	public void setTaux_act(Long taux_act) {
		this.taux_act = taux_act;
	}
	public String getPlafonne() {
		return plafonne;
	}
	public void setPlafonne(String plafonne) {
		this.plafonne = plafonne;
	}
	public Long getPlafond() {
		return plafond;
	}
	public void setPlafond(Long plafond) {
		this.plafond = plafond;
	}
	public String getVerif_piece() {
		return verif_piece;
	}
	public void setVerif_piece(String verif_piece) {
		this.verif_piece = verif_piece;
	}
	public String getNat_act() {
		return nat_act;
	}
	public void setNat_act(String nat_act) {
		this.nat_act = nat_act;
	}
	public String getVerif_vign() {
		return verif_vign;
	}
	public void setVerif_vign(String verif_vign) {
		this.verif_vign = verif_vign;
	}
	public String getDuree_act() {
		return duree_act;
	}
	public void setDuree_act(String duree_act) {
		this.duree_act = duree_act;
	}
	public Long getTaux_avance() {
		return taux_avance;
	}
	public void setTaux_avance(Long taux_avance) {
		this.taux_avance = taux_avance;
	}
	public String getType_plafond() {
		return type_plafond;
	}
	public void setType_plafond(String type_plafond) {
		this.type_plafond = type_plafond;
	}
	public Long getId_acte() {
		return id_acte;
	}
	public void setId_acte(Long id_acte) {
		this.id_acte = id_acte;
	}
	public Acte(Long type_act, String abrv_act, String lib_act, String a_indice, Long mtt_acte, Date dat_acte,
			Long taux_act, String plafonne, Long plafond, String verif_piece, String nat_act, String verif_vign,
			String duree_act, Long taux_avance, String type_plafond, Long id_acte) {
		super();
		this.type_act = type_act;
		this.abrv_act = abrv_act;
		this.lib_act = lib_act;
		this.a_indice = a_indice;
		this.mtt_acte = mtt_acte;
		this.dat_acte = dat_acte;
		this.taux_act = taux_act;
		this.plafonne = plafonne;
		this.plafond = plafond;
		this.verif_piece = verif_piece;
		this.nat_act = nat_act;
		this.verif_vign = verif_vign;
		this.duree_act = duree_act;
		this.taux_avance = taux_avance;
		this.type_plafond = type_plafond;
		this.id_acte = id_acte;
	}
	public Acte() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Acte {type_act=" + type_act + ", abrv_act=" + abrv_act + "}";
	}
	
	
}
