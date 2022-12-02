package com.arabsoft.ajir.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@IdClass(FAMILLEiD.class)

public class Famille {
	@Id
	private String cod_soc;
	@Id
	private String mat_pers;
	@Id
	private Long num_fam;
	private String parente_act;
	private String cod_activite;
	private String prenom;
	private String parente;
	@JsonFormat( pattern = "dd/MM/yyyy") 

	private Date dat_mar;
	private String nom_jf;
	@JsonFormat( pattern = "dd/MM/yyyy") 

	private Date dat_naiss;
	private String sexe;
	private String benef;
	private String regime_conj;
	@JsonFormat( pattern = "dd/MM/yyyy") 

	private Date dat_dece;
	private String mat_conj;
	private Long plaf_tot_remb;

	private String lieu_naiss;
	private String ass_conj;
	private String profession;
	private String employeur;
	@JsonFormat( pattern = "dd/MM/yyyy") 

	private Date dat_div;
	private String boursier;
	private String cod_sit;
	@JsonFormat( pattern = "dd/MM/yyyy") 

	private Date dat_effet_act;
	private String num_ass_conj;
	@JsonFormat( pattern = "dd/MM/yyyy") 

	private Date dat_engag_parent;
	@JsonFormat( pattern = "dd/MM/yyyy") 

	private Date dat_e_sais;
	@JsonFormat( pattern = "dd/MM/yyyy") 

	private Date date_validation;
	private String declar_all;
	private String proced_judic;
	private String pension;
	private String etat_fam;
	private Long mere;
	private String grp_sang;
	private String prenom_a;
	private String nom_jf_a;
	private String etat_valid;
	private String pec;
	private String cin;
	private Long mnt_pension;
	@JsonFormat( pattern = "dd/MM/yyyy") 

	private Date dat_divorce;
	private String pec_mut;
	private String nom_pren;
	private String num_fich_hand;
	@JsonFormat( pattern = "dd/MM/yyyy") 

	private Date dat_eff_fich_hand;
	@JsonFormat( pattern = "dd/MM/yyyy") 

	private Date dat_fin_fich_hand;
	private String typ_membre;
	private String cin_conj;
	private String prenom_mere;
	private Long num_mere;
	private String cod_aff_css;
	@JsonFormat( pattern = "dd/MM/yyyy") 

	private Date dat_cin;
	private String lieu_cin;
	@JsonFormat( pattern = "dd/MM/yyyy") 
private Date dat_pec;
	private String handicap;
	@JsonFormat( pattern = "dd/MM/yyyy") 

	private Date dat_pec_mut;
	private String presum_nais;
	private String observation;
	private String chronique;
	private String typ_cin;
	private Long id_famille;
	private String cod_user;
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
	public Long getNum_fam() {
		return num_fam;
	}
	public void setNum_fam(Long num_fam) {
		this.num_fam = num_fam;
	}
	public String getParente_act() {
		return parente_act;
	}
	public void setParente_act(String parente_act) {
		this.parente_act = parente_act;
	}
	public String getCod_activite() {
		return cod_activite;
	}
	public void setCod_activite(String cod_activite) {
		this.cod_activite = cod_activite;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getParente() {
		return parente;
	}
	public void setParente(String parente) {
		this.parente = parente;
	}
	public Date getDat_mar() {
		return dat_mar;
	}
	public void setDat_mar(Date dat_mar) {
		this.dat_mar = dat_mar;
	}
	public String getNom_jf() {
		return nom_jf;
	}
	public void setNom_jf(String nom_jf) {
		this.nom_jf = nom_jf;
	}
	public Date getDat_naiss() {
		return dat_naiss;
	}
	public void setDat_naiss(Date dat_naiss) {
		this.dat_naiss = dat_naiss;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public String getBenef() {
		return benef;
	}
	public void setBenef(String benef) {
		this.benef = benef;
	}
	public String getRegime_conj() {
		return regime_conj;
	}
	public void setRegime_conj(String regime_conj) {
		this.regime_conj = regime_conj;
	}
	public Date getDat_dece() {
		return dat_dece;
	}
	public void setDat_dece(Date dat_dece) {
		this.dat_dece = dat_dece;
	}
	public String getMat_conj() {
		return mat_conj;
	}
	public void setMat_conj(String mat_conj) {
		this.mat_conj = mat_conj;
	}
	public Long getPlaf_tot_remb() {
		return plaf_tot_remb;
	}
	public void setPlaf_tot_remb(Long plaf_tot_remb) {
		this.plaf_tot_remb = plaf_tot_remb;
	}
	public String getLieu_naiss() {
		return lieu_naiss;
	}
	public void setLieu_naiss(String lieu_naiss) {
		this.lieu_naiss = lieu_naiss;
	}
	public String getAss_conj() {
		return ass_conj;
	}
	public void setAss_conj(String ass_conj) {
		this.ass_conj = ass_conj;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getEmployeur() {
		return employeur;
	}
	public void setEmployeur(String employeur) {
		this.employeur = employeur;
	}
	public Date getDat_div() {
		return dat_div;
	}
	public void setDat_div(Date dat_div) {
		this.dat_div = dat_div;
	}
	public String getBoursier() {
		return boursier;
	}
	public void setBoursier(String boursier) {
		this.boursier = boursier;
	}
	public String getCod_sit() {
		return cod_sit;
	}
	public void setCod_sit(String cod_sit) {
		this.cod_sit = cod_sit;
	}
	public Date getDat_effet_act() {
		return dat_effet_act;
	}
	public void setDat_effet_act(Date dat_effet_act) {
		this.dat_effet_act = dat_effet_act;
	}
	public String getNum_ass_conj() {
		return num_ass_conj;
	}
	public void setNum_ass_conj(String num_ass_conj) {
		this.num_ass_conj = num_ass_conj;
	}
	public Date getDat_engag_parent() {
		return dat_engag_parent;
	}
	public void setDat_engag_parent(Date dat_engag_parent) {
		this.dat_engag_parent = dat_engag_parent;
	}
	public Date getDat_e_sais() {
		return dat_e_sais;
	}
	public void setDat_e_sais(Date dat_e_sais) {
		this.dat_e_sais = dat_e_sais;
	}
	public Date getDate_validation() {
		return date_validation;
	}
	public void setDate_validation(Date date_validation) {
		this.date_validation = date_validation;
	}
	public String getDeclar_all() {
		return declar_all;
	}
	public void setDeclar_all(String declar_all) {
		this.declar_all = declar_all;
	}
	public String getProced_judic() {
		return proced_judic;
	}
	public void setProced_judic(String proced_judic) {
		this.proced_judic = proced_judic;
	}
	public String getPension() {
		return pension;
	}
	public void setPension(String pension) {
		this.pension = pension;
	}
	public String getEtat_fam() {
		return etat_fam;
	}
	public void setEtat_fam(String etat_fam) {
		this.etat_fam = etat_fam;
	}
	public Long getMere() {
		return mere;
	}
	public void setMere(Long mere) {
		this.mere = mere;
	}
	public String getGrp_sang() {
		return grp_sang;
	}
	public void setGrp_sang(String grp_sang) {
		this.grp_sang = grp_sang;
	}
	public String getPrenom_a() {
		return prenom_a;
	}
	public void setPrenom_a(String prenom_a) {
		this.prenom_a = prenom_a;
	}
	public String getNom_jf_a() {
		return nom_jf_a;
	}
	public void setNom_jf_a(String nom_jf_a) {
		this.nom_jf_a = nom_jf_a;
	}
	public String getEtat_valid() {
		return etat_valid;
	}
	public void setEtat_valid(String etat_valid) {
		this.etat_valid = etat_valid;
	}
	public String getPec() {
		return pec;
	}
	public void setPec(String pec) {
		this.pec = pec;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public Long getMnt_pension() {
		return mnt_pension;
	}
	public void setMnt_pension(Long mnt_pension) {
		this.mnt_pension = mnt_pension;
	}
	public Date getDat_divorce() {
		return dat_divorce;
	}
	public void setDat_divorce(Date dat_divorce) {
		this.dat_divorce = dat_divorce;
	}
	public String getPec_mut() {
		return pec_mut;
	}
	public void setPec_mut(String pec_mut) {
		this.pec_mut = pec_mut;
	}
	public String getNom_pren() {
		return nom_pren;
	}
	public void setNom_pren(String nom_pren) {
		this.nom_pren = nom_pren;
	}
	public String getNum_fich_hand() {
		return num_fich_hand;
	}
	public void setNum_fich_hand(String num_fich_hand) {
		this.num_fich_hand = num_fich_hand;
	}
	public Date getDat_eff_fich_hand() {
		return dat_eff_fich_hand;
	}
	public void setDat_eff_fich_hand(Date dat_eff_fich_hand) {
		this.dat_eff_fich_hand = dat_eff_fich_hand;
	}
	public Date getDat_fin_fich_hand() {
		return dat_fin_fich_hand;
	}
	public void setDat_fin_fich_hand(Date dat_fin_fich_hand) {
		this.dat_fin_fich_hand = dat_fin_fich_hand;
	}
	public String getTyp_membre() {
		return typ_membre;
	}
	public void setTyp_membre(String typ_membre) {
		this.typ_membre = typ_membre;
	}
	public String getCin_conj() {
		return cin_conj;
	}
	public void setCin_conj(String cin_conj) {
		this.cin_conj = cin_conj;
	}
	public String getPrenom_mere() {
		return prenom_mere;
	}
	public void setPrenom_mere(String prenom_mere) {
		this.prenom_mere = prenom_mere;
	}
	public Long getNum_mere() {
		return num_mere;
	}
	public void setNum_mere(Long num_mere) {
		this.num_mere = num_mere;
	}
	public String getCod_aff_css() {
		return cod_aff_css;
	}
	public void setCod_aff_css(String cod_aff_css) {
		this.cod_aff_css = cod_aff_css;
	}
	public Date getDat_cin() {
		return dat_cin;
	}
	public void setDat_cin(Date dat_cin) {
		this.dat_cin = dat_cin;
	}
	public String getLieu_cin() {
		return lieu_cin;
	}
	public void setLieu_cin(String lieu_cin) {
		this.lieu_cin = lieu_cin;
	}
	public Date getDat_pec() {
		return dat_pec;
	}
	public void setDat_pec(Date dat_pec) {
		this.dat_pec = dat_pec;
	}
	public String getHandicap() {
		return handicap;
	}
	public void setHandicap(String handicap) {
		this.handicap = handicap;
	}
	public Date getDat_pec_mut() {
		return dat_pec_mut;
	}
	public void setDat_pec_mut(Date dat_pec_mut) {
		this.dat_pec_mut = dat_pec_mut;
	}
	public String getPresum_nais() {
		return presum_nais;
	}
	public void setPresum_nais(String presum_nais) {
		this.presum_nais = presum_nais;
	}
	public String getObservation() {
		return observation;
	}
	public void setObservation(String observation) {
		this.observation = observation;
	}
	public String getChronique() {
		return chronique;
	}
	public void setChronique(String chronique) {
		this.chronique = chronique;
	}
	public String getTyp_cin() {
		return typ_cin;
	}
	public void setTyp_cin(String typ_cin) {
		this.typ_cin = typ_cin;
	}
	public Long getId_famille() {
		return id_famille;
	}
	public void setId_famille(Long id_famille) {
		this.id_famille = id_famille;
	}
	public String getCod_user() {
		return cod_user;
	}
	public void setCod_user(String cod_user) {
		this.cod_user = cod_user;
	}
	public Famille() {
		super();
	}
	public Famille(String cod_soc, String mat_pers, Long num_fam, String parente_act, String cod_activite,
			String prenom, String parente, Date dat_mar, String nom_jf, Date dat_naiss, String sexe, String benef,
			String regime_conj, Date dat_dece, String mat_conj, Long plaf_tot_remb, String lieu_naiss, String ass_conj,
			String profession, String employeur, Date dat_div, String boursier, String cod_sit, Date dat_effet_act,
			String num_ass_conj, Date dat_engag_parent, Date dat_e_sais, Date date_validation, String declar_all,
			String proced_judic, String pension, String etat_fam, Long mere, String grp_sang, String prenom_a,
			String nom_jf_a, String etat_valid, String pec, String cin, Long mnt_pension, Date dat_divorce,
			String pec_mut, String nom_pren, String num_fich_hand, Date dat_eff_fich_hand, Date dat_fin_fich_hand,
			String typ_membre, String cin_conj, String prenom_mere, Long num_mere, String cod_aff_css, Date dat_cin,
			String lieu_cin, Date dat_pec, String handicap, Date dat_pec_mut, String presum_nais, String observation,
			String chronique, String typ_cin, Long id_famille, String cod_user) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.num_fam = num_fam;
		this.parente_act = parente_act;
		this.cod_activite = cod_activite;
		this.prenom = prenom;
		this.parente = parente;
		this.dat_mar = dat_mar;
		this.nom_jf = nom_jf;
		this.dat_naiss = dat_naiss;
		this.sexe = sexe;
		this.benef = benef;
		this.regime_conj = regime_conj;
		this.dat_dece = dat_dece;
		this.mat_conj = mat_conj;
		this.plaf_tot_remb = plaf_tot_remb;
		this.lieu_naiss = lieu_naiss;
		this.ass_conj = ass_conj;
		this.profession = profession;
		this.employeur = employeur;
		this.dat_div = dat_div;
		this.boursier = boursier;
		this.cod_sit = cod_sit;
		this.dat_effet_act = dat_effet_act;
		this.num_ass_conj = num_ass_conj;
		this.dat_engag_parent = dat_engag_parent;
		this.dat_e_sais = dat_e_sais;
		this.date_validation = date_validation;
		this.declar_all = declar_all;
		this.proced_judic = proced_judic;
		this.pension = pension;
		this.etat_fam = etat_fam;
		this.mere = mere;
		this.grp_sang = grp_sang;
		this.prenom_a = prenom_a;
		this.nom_jf_a = nom_jf_a;
		this.etat_valid = etat_valid;
		this.pec = pec;
		this.cin = cin;
		this.mnt_pension = mnt_pension;
		this.dat_divorce = dat_divorce;
		this.pec_mut = pec_mut;
		this.nom_pren = nom_pren;
		this.num_fich_hand = num_fich_hand;
		this.dat_eff_fich_hand = dat_eff_fich_hand;
		this.dat_fin_fich_hand = dat_fin_fich_hand;
		this.typ_membre = typ_membre;
		this.cin_conj = cin_conj;
		this.prenom_mere = prenom_mere;
		this.num_mere = num_mere;
		this.cod_aff_css = cod_aff_css;
		this.dat_cin = dat_cin;
		this.lieu_cin = lieu_cin;
		this.dat_pec = dat_pec;
		this.handicap = handicap;
		this.dat_pec_mut = dat_pec_mut;
		this.presum_nais = presum_nais;
		this.observation = observation;
		this.chronique = chronique;
		this.typ_cin = typ_cin;
		this.id_famille = id_famille;
		this.cod_user = cod_user;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	@SuppressWarnings("deprecation")
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

}