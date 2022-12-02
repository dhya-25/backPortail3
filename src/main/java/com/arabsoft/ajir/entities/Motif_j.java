package com.arabsoft.ajir.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MOTIF_J")
public class Motif_j {
	@Id
	@Column(name = "COD_M")
	private String cod_m;
	@Column(name = "TYP_CNG")
	private String typ_cng;
	@Column(name = "ABRV_FIXE")
	private String abrv_fixe;
	@Column(name = "LIB_MOT")
	private String lib_mot;
	@Column(name = "ABRV_MOT")
	private String abrv_mot;
	@Column(name = "DED_SAL")
	private String ded_sal;
	@Column(name = "DED_CNG")
	private String ded_cng;
	@Column(name = "PLAFOND_CNG")
	private String plafond_cng;
	@Column(name = "TYP_PLAFOND")
	private String typ_plafond;
	@Column(name = "FREQUENCE")
	private Long frequence;
	@Column(name = "UNITE")
	private String unite;
	@Column(name = "ABATEMENT")
	private String abatement;
	@Column(name = "JOUR")
	private String jour;
	@Column(name = "LIM_DEM_CNG")
	private Long lim_dem_cng;
	@Column(name = "UNIT_PLAF")
	private String unit_plaf;
	@Column(name = "PLAFOND_CNG_DEMI")
	private String plafond_cng_demi;
	@Column(name = "PLAFOND_CNG_SOLD")
	private String plafond_cng_sold;
	@Column(name = "PLAFOND_DECE")
	private String plafond_dece;
	@Column(name = "ORD_REND")
	private Long ord_rend;
	@Column(name = "RESERVE")
	private String reserve;
	@Column(name = "PLAFOND_ABAT")
	private Long plafond_abat;
	@Column(name = "MOIS_DEBUT")
	private String mois_debut;
	@Column(name = "MOIS_FIN")
	private String mois_fin;
	@Column(name = "PLAFOND_BONUS")
	private String plafond_bonus;
	@Column(name = "LIB_MOT_A")
	private String lib_mot_a;
	@Column(name = "ABRV_MOT_A")
	private String abrv_mot_a;
	@Column(name = "DED_CNR")
	private Long ded_cnr;
	@Column(name = "NATURE_CNG")
	private String nature_cng;
	@Column(name = "CORRES_COD_M")
	private String corres_cod_m;
	@Column(name = "MOTIF_POINT")
	private String motif_point;
	@Column(name = "TYPE_ABS")
	private String type_abs;
	@Column(name = "CORRES_PERS")
	private String corres_pers;
	@Column(name = "NAT_CNG")
	private String nat_cng;
	@Column(name = "MOTIF_CHEV_POINT")
	private String motif_chev_point;
	@Column(name = "NBR_JOUR_MIN")
	private Long nbr_jour_min;
	@Column(name = "CUMUL_HSUP48")
	private String cumul_hsup48;
	@Column(name = "DED_ANCIENNETE")
	private String ded_anciennete;
	@Column(name = "UNITE_POINT")
	private String unite_point;
	@Column(name = "COEF_POINT")
	private Long coef_point;
	@Column(name = "COD_SIT")
	private String cod_sit;
	@Column(name = "SEXE")
	private String sexe;
	@Column(name = "DED_TICKET")
	private String ded_ticket;
	@Column(name = "FRANCH_TICKET")
	private String franch_ticket;
	@Column(name = "COD_ALERT")
	private String cod_alert;
	@Column(name = "ABAT_PSPES")
	private String abat_pspes;
	@Column(name = "NUM_DEC")
	private Long num_dec;

	public String getCod_m() {
		return cod_m;
	}

	public void setCod_m(String cod_m) {
		this.cod_m = cod_m;
	}

	public String getTyp_cng() {
		return typ_cng;
	}

	public void setTyp_cng(String typ_cng) {
		this.typ_cng = typ_cng;
	}

	public String getAbrv_fixe() {
		return abrv_fixe;
	}

	public void setAbrv_fixe(String abrv_fixe) {
		this.abrv_fixe = abrv_fixe;
	}

	public String getLib_mot() {
		return lib_mot;
	}

	public void setLib_mot(String lib_mot) {
		this.lib_mot = lib_mot;
	}

	public String getAbrv_mot() {
		return abrv_mot;
	}

	public void setAbrv_mot(String abrv_mot) {
		this.abrv_mot = abrv_mot;
	}

	public String getDed_sal() {
		return ded_sal;
	}

	public void setDed_sal(String ded_sal) {
		this.ded_sal = ded_sal;
	}

	public String getDed_cng() {
		return ded_cng;
	}

	public void setDed_cng(String ded_cng) {
		this.ded_cng = ded_cng;
	}

	public String getPlafond_cng() {
		return plafond_cng;
	}

	public void setPlafond_cng(String plafond_cng) {
		this.plafond_cng = plafond_cng;
	}

	public String getTyp_plafond() {
		return typ_plafond;
	}

	public void setTyp_plafond(String typ_plafond) {
		this.typ_plafond = typ_plafond;
	}

	public Long getFrequence() {
		return frequence;
	}

	public void setFrequence(Long frequence) {
		this.frequence = frequence;
	}

	public String getUnite() {
		return unite;
	}

	public void setUnite(String unite) {
		this.unite = unite;
	}

	public String getAbatement() {
		return abatement;
	}

	public void setAbatement(String abatement) {
		this.abatement = abatement;
	}

	public String getJour() {
		return jour;
	}

	public void setJour(String jour) {
		this.jour = jour;
	}

	public Long getLim_dem_cng() {
		return lim_dem_cng;
	}

	public void setLim_dem_cng(Long lim_dem_cng) {
		this.lim_dem_cng = lim_dem_cng;
	}

	public String getUnit_plaf() {
		return unit_plaf;
	}

	public void setUnit_plaf(String unit_plaf) {
		this.unit_plaf = unit_plaf;
	}

	public String getPlafond_cng_demi() {
		return plafond_cng_demi;
	}

	public void setPlafond_cng_demi(String plafond_cng_demi) {
		this.plafond_cng_demi = plafond_cng_demi;
	}

	public String getPlafond_cng_sold() {
		return plafond_cng_sold;
	}

	public void setPlafond_cng_sold(String plafond_cng_sold) {
		this.plafond_cng_sold = plafond_cng_sold;
	}

	public String getPlafond_dece() {
		return plafond_dece;
	}

	public void setPlafond_dece(String plafond_dece) {
		this.plafond_dece = plafond_dece;
	}

	public Long getOrd_rend() {
		return ord_rend;
	}

	public void setOrd_rend(Long ord_rend) {
		this.ord_rend = ord_rend;
	}

	public String getReserve() {
		return reserve;
	}

	public void setReserve(String reserve) {
		this.reserve = reserve;
	}

	public Long getPlafond_abat() {
		return plafond_abat;
	}

	public void setPlafond_abat(Long plafond_abat) {
		this.plafond_abat = plafond_abat;
	}

	public String getMois_debut() {
		return mois_debut;
	}

	public void setMois_debut(String mois_debut) {
		this.mois_debut = mois_debut;
	}

	public String getMois_fin() {
		return mois_fin;
	}

	public void setMois_fin(String mois_fin) {
		this.mois_fin = mois_fin;
	}

	public String getPlafond_bonus() {
		return plafond_bonus;
	}

	public void setPlafond_bonus(String plafond_bonus) {
		this.plafond_bonus = plafond_bonus;
	}

	public String getLib_mot_a() {
		return lib_mot_a;
	}

	public void setLib_mot_a(String lib_mot_a) {
		this.lib_mot_a = lib_mot_a;
	}

	public String getAbrv_mot_a() {
		return abrv_mot_a;
	}

	public void setAbrv_mot_a(String abrv_mot_a) {
		this.abrv_mot_a = abrv_mot_a;
	}

	public Long getDed_cnr() {
		return ded_cnr;
	}

	public void setDed_cnr(Long ded_cnr) {
		this.ded_cnr = ded_cnr;
	}

	public String getNature_cng() {
		return nature_cng;
	}

	public void setNature_cng(String nature_cng) {
		this.nature_cng = nature_cng;
	}

	public String getCorres_cod_m() {
		return corres_cod_m;
	}

	public void setCorres_cod_m(String corres_cod_m) {
		this.corres_cod_m = corres_cod_m;
	}

	public String getMotif_point() {
		return motif_point;
	}

	public void setMotif_point(String motif_point) {
		this.motif_point = motif_point;
	}

	public String getType_abs() {
		return type_abs;
	}

	public void setType_abs(String type_abs) {
		this.type_abs = type_abs;
	}

	public String getCorres_pers() {
		return corres_pers;
	}

	public void setCorres_pers(String corres_pers) {
		this.corres_pers = corres_pers;
	}

	public String getNat_cng() {
		return nat_cng;
	}

	public void setNat_cng(String nat_cng) {
		this.nat_cng = nat_cng;
	}

	public String getMotif_chev_point() {
		return motif_chev_point;
	}

	public void setMotif_chev_point(String motif_chev_point) {
		this.motif_chev_point = motif_chev_point;
	}

	public Long getNbr_jour_min() {
		return nbr_jour_min;
	}

	public void setNbr_jour_min(Long nbr_jour_min) {
		this.nbr_jour_min = nbr_jour_min;
	}

	public String getCumul_hsup48() {
		return cumul_hsup48;
	}

	public void setCumul_hsup48(String cumul_hsup48) {
		this.cumul_hsup48 = cumul_hsup48;
	}

	public String getDed_anciennete() {
		return ded_anciennete;
	}

	public void setDed_anciennete(String ded_anciennete) {
		this.ded_anciennete = ded_anciennete;
	}

	public String getUnite_point() {
		return unite_point;
	}

	public void setUnite_point(String unite_point) {
		this.unite_point = unite_point;
	}

	public Long getCoef_point() {
		return coef_point;
	}

	public void setCoef_point(Long coef_point) {
		this.coef_point = coef_point;
	}

	public String getCod_sit() {
		return cod_sit;
	}

	public void setCod_sit(String cod_sit) {
		this.cod_sit = cod_sit;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getDed_ticket() {
		return ded_ticket;
	}

	public void setDed_ticket(String ded_ticket) {
		this.ded_ticket = ded_ticket;
	}

	public String getFranch_ticket() {
		return franch_ticket;
	}

	public void setFranch_ticket(String franch_ticket) {
		this.franch_ticket = franch_ticket;
	}

	public String getCod_alert() {
		return cod_alert;
	}

	public void setCod_alert(String cod_alert) {
		this.cod_alert = cod_alert;
	}

	public String getAbat_pspes() {
		return abat_pspes;
	}

	public void setAbat_pspes(String abat_pspes) {
		this.abat_pspes = abat_pspes;
	}

	public Long getNum_dec() {
		return num_dec;
	}

	public void setNum_dec(Long num_dec) {
		this.num_dec = num_dec;
	}

}
