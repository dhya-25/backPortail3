package com.arabsoft.ajir.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@IdClass(ClePersonnel.class)
public class Personnel {
	

	
	@Id
	private String cod_soc;
	@Id
	private String mat_pers;
	private String nom_pers;
	private String pren_pers;
	private String nom_pers_a;
	private String pren_pers_a;
	private String nom_jf;
	private String nom_jf_a;
	private String cin;
	private String sexe;
	private String cod_sit;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dat_sit;
	private String chef_fam;
	private Long nbre_enf;
	private String charg_enf;
	private String charg_all;
	private String fct_fam;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dat_ent;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dat_tit;
	private String cod_serv;
	@Column(insertable = false, updatable = false)
	private String lib_serv;
	private String cod_fonct;
	@Column(insertable = false, updatable = false)
	private String lib_fonct;
	private String cod_categ;
	@Column(insertable = false, updatable = false)
	private String lib_categ;
	private String cod_cat;
	@Column(insertable = false, updatable = false)
	private String lib_cat;
	private String cod_grad;
	@Column(insertable = false, updatable = false)
	private String lib_grad;
	private String cod_motif;
	@Column(insertable = false, updatable = false)
	private String lib_motif;
	private String cod_natp;
	private String cod_stat;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dat_serv;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dat_fonct;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dat_qualf;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dat_categ;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dat_cat;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dat_grad;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dat_ech;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dat_emb;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dat_motif;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dat_nais;
	private String etat_act;
	@Column(insertable = false, updatable = false)
	private String lib_etat_act;
	private String qualf;
	private long cod_ech;
	private String cod_affect;
	@Column(insertable = false, updatable = false)
	private String lib_affect;
	private String cod_niveau;
	@Column(insertable = false, updatable = false)
	private String lib_niveau;
	private String poste_trav;
	@Column(insertable = false, updatable = false)
	private String lib_poste_trav;
	private String cod_metier;
	@Column(insertable = false, updatable = false)
	private String lib_cod_metier;
	private String adm_tech;
	@Column(insertable = false, updatable = false)
	private String lib_adm_tech;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dat_stat;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dat_cin;
	private String lie_emi_cin;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dat_affect;
	private String lieu_nais;
	private String cod_lieu_geog;
	@Column(insertable = false, updatable = false)
	private String lib_lieu_geog;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dat_lieu_geog;
	private String grp_sang;
	private String num_retr;
	private String cod_fil;
	@Column(insertable = false, updatable = false)
	private String lib_fil;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dat_fil;
	private String serv_mil;
	@Column(insertable = false, updatable = false)
	private String lib_mil;
	private String code_domaine;
	@Column(insertable = false, updatable = false)
	private String lib_domaine;
	private String cod_class;
	@Column(insertable = false, updatable = false)
	private String lib_class;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dat_class;
	private String cod_typ_depart;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dat_depart;
	private String org_serv;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dat_poste_trav;
	private String cod_nat_recr;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dat_adm_tech;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dat_org_serv;
	private String typ_rang;
	private String handicap;
	private String pourcent_hand;
	private String typ_handicap;
	private String num_fich_hand;
	private long niv_sal;
	private String cod_assur;
	private String num_assur;
	private String typ_id;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dat_eff_fich_hand;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dat_fin_fich_hand;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dat_niv_sal;
	private String presum_nais;
	private String cod_gouv;
	@Column(insertable = false, updatable = false)
	private String lib_gouv;
	private String benef_allf;
	private String num_acc;
	
	@Transient
	private List<AdrPers> adresses_personnel;
	
	@Transient
	private List<PossModp> mode_payement;
	
	@Transient
	private List<RenseignementPers> rens_pers;
	@Transient
	private List<ETABLIS_PERS> etab;
	@Transient
	private List<POSSEDE> possede;
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
	public String getNom_pers() {
		return nom_pers;
	}
	public void setNom_pers(String nom_pers) {
		this.nom_pers = nom_pers;
	}
	public String getPren_pers() {
		return pren_pers;
	}
	public void setPren_pers(String pren_pers) {
		this.pren_pers = pren_pers;
	}
	public String getNom_pers_a() {
		return nom_pers_a;
	}
	public void setNom_pers_a(String nom_pers_a) {
		this.nom_pers_a = nom_pers_a;
	}
	public String getPren_pers_a() {
		return pren_pers_a;
	}
	public void setPren_pers_a(String pren_pers_a) {
		this.pren_pers_a = pren_pers_a;
	}
	public String getNom_jf() {
		return nom_jf;
	}
	public void setNom_jf(String nom_jf) {
		this.nom_jf = nom_jf;
	}
	public String getNom_jf_a() {
		return nom_jf_a;
	}
	public void setNom_jf_a(String nom_jf_a) {
		this.nom_jf_a = nom_jf_a;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public String getCod_sit() {
		return cod_sit;
	}
	public void setCod_sit(String cod_sit) {
		this.cod_sit = cod_sit;
	}
	public Date getDat_sit() {
		return dat_sit;
	}
	public void setDat_sit(Date dat_sit) {
		this.dat_sit = dat_sit;
	}
	public String getChef_fam() {
		return chef_fam;
	}
	public void setChef_fam(String chef_fam) {
		this.chef_fam = chef_fam;
	}
	public Long getNbre_enf() {
		return nbre_enf;
	}
	public void setNbre_enf(Long nbre_enf) {
		this.nbre_enf = nbre_enf;
	}
	public String getCharg_enf() {
		return charg_enf;
	}
	public void setCharg_enf(String charg_enf) {
		this.charg_enf = charg_enf;
	}
	public String getCharg_all() {
		return charg_all;
	}
	public void setCharg_all(String charg_all) {
		this.charg_all = charg_all;
	}
	public String getFct_fam() {
		return fct_fam;
	}
	public void setFct_fam(String fct_fam) {
		this.fct_fam = fct_fam;
	}
	public Date getDat_ent() {
		return dat_ent;
	}
	public void setDat_ent(Date dat_ent) {
		this.dat_ent = dat_ent;
	}
	public Date getDat_tit() {
		return dat_tit;
	}
	public void setDat_tit(Date dat_tit) {
		this.dat_tit = dat_tit;
	}
	public String getCod_serv() {
		return cod_serv;
	}
	public void setCod_serv(String cod_serv) {
		this.cod_serv = cod_serv;
	}
	public String getLib_serv() {
		return lib_serv;
	}
	public void setLib_serv(String lib_serv) {
		this.lib_serv = lib_serv;
	}
	public String getCod_fonct() {
		return cod_fonct;
	}
	public void setCod_fonct(String cod_fonct) {
		this.cod_fonct = cod_fonct;
	}
	public String getLib_fonct() {
		return lib_fonct;
	}
	public void setLib_fonct(String lib_fonct) {
		this.lib_fonct = lib_fonct;
	}
	public String getCod_categ() {
		return cod_categ;
	}
	public void setCod_categ(String cod_categ) {
		this.cod_categ = cod_categ;
	}
	public String getLib_categ() {
		return lib_categ;
	}
	public void setLib_categ(String lib_categ) {
		this.lib_categ = lib_categ;
	}
	public String getCod_cat() {
		return cod_cat;
	}
	public void setCod_cat(String cod_cat) {
		this.cod_cat = cod_cat;
	}
	public String getLib_cat() {
		return lib_cat;
	}
	public void setLib_cat(String lib_cat) {
		this.lib_cat = lib_cat;
	}
	public String getCod_grad() {
		return cod_grad;
	}
	public void setCod_grad(String cod_grad) {
		this.cod_grad = cod_grad;
	}
	public String getLib_grad() {
		return lib_grad;
	}
	public void setLib_grad(String lib_grad) {
		this.lib_grad = lib_grad;
	}
	public String getCod_motif() {
		return cod_motif;
	}
	public void setCod_motif(String cod_motif) {
		this.cod_motif = cod_motif;
	}
	public String getLib_motif() {
		return lib_motif;
	}
	public void setLib_motif(String lib_motif) {
		this.lib_motif = lib_motif;
	}
	public String getCod_natp() {
		return cod_natp;
	}
	public void setCod_natp(String cod_natp) {
		this.cod_natp = cod_natp;
	}
	public String getCod_stat() {
		return cod_stat;
	}
	public void setCod_stat(String cod_stat) {
		this.cod_stat = cod_stat;
	}
	public Date getDat_serv() {
		return dat_serv;
	}
	public void setDat_serv(Date dat_serv) {
		this.dat_serv = dat_serv;
	}
	public Date getDat_fonct() {
		return dat_fonct;
	}
	public void setDat_fonct(Date dat_fonct) {
		this.dat_fonct = dat_fonct;
	}
	public Date getDat_qualf() {
		return dat_qualf;
	}
	public void setDat_qualf(Date dat_qualf) {
		this.dat_qualf = dat_qualf;
	}
	public Date getDat_categ() {
		return dat_categ;
	}
	public void setDat_categ(Date dat_categ) {
		this.dat_categ = dat_categ;
	}
	public Date getDat_cat() {
		return dat_cat;
	}
	public void setDat_cat(Date dat_cat) {
		this.dat_cat = dat_cat;
	}
	public Date getDat_grad() {
		return dat_grad;
	}
	public void setDat_grad(Date dat_grad) {
		this.dat_grad = dat_grad;
	}
	public Date getDat_ech() {
		return dat_ech;
	}
	public void setDat_ech(Date dat_ech) {
		this.dat_ech = dat_ech;
	}
	public Date getDat_emb() {
		return dat_emb;
	}
	public void setDat_emb(Date dat_emb) {
		this.dat_emb = dat_emb;
	}
	public Date getDat_motif() {
		return dat_motif;
	}
	public void setDat_motif(Date dat_motif) {
		this.dat_motif = dat_motif;
	}
	public Date getDat_nais() {
		return dat_nais;
	}
	public void setDat_nais(Date dat_nais) {
		this.dat_nais = dat_nais;
	}
	public String getEtat_act() {
		return etat_act;
	}
	public void setEtat_act(String etat_act) {
		this.etat_act = etat_act;
	}
	public String getLib_etat_act() {
		return lib_etat_act;
	}
	public void setLib_etat_act(String lib_etat_act) {
		this.lib_etat_act = lib_etat_act;
	}
	public String getQualf() {
		return qualf;
	}
	public void setQualf(String qualf) {
		this.qualf = qualf;
	}
	public long getCod_ech() {
		return cod_ech;
	}
	public void setCod_ech(long cod_ech) {
		this.cod_ech = cod_ech;
	}
	public String getCod_affect() {
		return cod_affect;
	}
	public void setCod_affect(String cod_affect) {
		this.cod_affect = cod_affect;
	}
	public String getLib_affect() {
		return lib_affect;
	}
	public void setLib_affect(String lib_affect) {
		this.lib_affect = lib_affect;
	}
	public String getCod_niveau() {
		return cod_niveau;
	}
	public void setCod_niveau(String cod_niveau) {
		this.cod_niveau = cod_niveau;
	}
	public String getLib_niveau() {
		return lib_niveau;
	}
	public void setLib_niveau(String lib_niveau) {
		this.lib_niveau = lib_niveau;
	}
	public String getPoste_trav() {
		return poste_trav;
	}
	public void setPoste_trav(String poste_trav) {
		this.poste_trav = poste_trav;
	}
	public String getLib_poste_trav() {
		return lib_poste_trav;
	}
	public void setLib_poste_trav(String lib_poste_trav) {
		this.lib_poste_trav = lib_poste_trav;
	}
	public String getCod_metier() {
		return cod_metier;
	}
	public void setCod_metier(String cod_metier) {
		this.cod_metier = cod_metier;
	}
	public String getLib_cod_metier() {
		return lib_cod_metier;
	}
	public void setLib_cod_metier(String lib_cod_metier) {
		this.lib_cod_metier = lib_cod_metier;
	}
	public String getAdm_tech() {
		return adm_tech;
	}
	public void setAdm_tech(String adm_tech) {
		this.adm_tech = adm_tech;
	}
	public String getLib_adm_tech() {
		return lib_adm_tech;
	}
	public void setLib_adm_tech(String lib_adm_tech) {
		this.lib_adm_tech = lib_adm_tech;
	}
	public Date getDat_stat() {
		return dat_stat;
	}
	public void setDat_stat(Date dat_stat) {
		this.dat_stat = dat_stat;
	}
	public Date getDat_cin() {
		return dat_cin;
	}
	public void setDat_cin(Date dat_cin) {
		this.dat_cin = dat_cin;
	}
	public String getLie_emi_cin() {
		return lie_emi_cin;
	}
	public void setLie_emi_cin(String lie_emi_cin) {
		this.lie_emi_cin = lie_emi_cin;
	}
	public Date getDat_affect() {
		return dat_affect;
	}
	public void setDat_affect(Date dat_affect) {
		this.dat_affect = dat_affect;
	}
	public String getLieu_nais() {
		return lieu_nais;
	}
	public void setLieu_nais(String lieu_nais) {
		this.lieu_nais = lieu_nais;
	}
	public String getCod_lieu_geog() {
		return cod_lieu_geog;
	}
	public void setCod_lieu_geog(String cod_lieu_geog) {
		this.cod_lieu_geog = cod_lieu_geog;
	}
	public String getLib_lieu_geog() {
		return lib_lieu_geog;
	}
	public void setLib_lieu_geog(String lib_lieu_geog) {
		this.lib_lieu_geog = lib_lieu_geog;
	}
	public Date getDat_lieu_geog() {
		return dat_lieu_geog;
	}
	public void setDat_lieu_geog(Date dat_lieu_geog) {
		this.dat_lieu_geog = dat_lieu_geog;
	}
	public String getGrp_sang() {
		return grp_sang;
	}
	public void setGrp_sang(String grp_sang) {
		this.grp_sang = grp_sang;
	}
	public String getNum_retr() {
		return num_retr;
	}
	public void setNum_retr(String num_retr) {
		this.num_retr = num_retr;
	}
	public String getCod_fil() {
		return cod_fil;
	}
	public void setCod_fil(String cod_fil) {
		this.cod_fil = cod_fil;
	}
	public String getLib_fil() {
		return lib_fil;
	}
	public void setLib_fil(String lib_fil) {
		this.lib_fil = lib_fil;
	}
	public Date getDat_fil() {
		return dat_fil;
	}
	public void setDat_fil(Date dat_fil) {
		this.dat_fil = dat_fil;
	}
	public String getServ_mil() {
		return serv_mil;
	}
	public void setServ_mil(String serv_mil) {
		this.serv_mil = serv_mil;
	}
	public String getLib_mil() {
		return lib_mil;
	}
	public void setLib_mil(String lib_mil) {
		this.lib_mil = lib_mil;
	}
	public String getCode_domaine() {
		return code_domaine;
	}
	public void setCode_domaine(String code_domaine) {
		this.code_domaine = code_domaine;
	}
	public String getLib_domaine() {
		return lib_domaine;
	}
	public void setLib_domaine(String lib_domaine) {
		this.lib_domaine = lib_domaine;
	}
	public String getCod_class() {
		return cod_class;
	}
	public void setCod_class(String cod_class) {
		this.cod_class = cod_class;
	}
	public String getLib_class() {
		return lib_class;
	}
	public void setLib_class(String lib_class) {
		this.lib_class = lib_class;
	}
	public Date getDat_class() {
		return dat_class;
	}
	public void setDat_class(Date dat_class) {
		this.dat_class = dat_class;
	}
	public String getCod_typ_depart() {
		return cod_typ_depart;
	}
	public void setCod_typ_depart(String cod_typ_depart) {
		this.cod_typ_depart = cod_typ_depart;
	}
	public Date getDat_depart() {
		return dat_depart;
	}
	public void setDat_depart(Date dat_depart) {
		this.dat_depart = dat_depart;
	}
	public String getOrg_serv() {
		return org_serv;
	}
	public void setOrg_serv(String org_serv) {
		this.org_serv = org_serv;
	}
	public Date getDat_poste_trav() {
		return dat_poste_trav;
	}
	public void setDat_poste_trav(Date dat_poste_trav) {
		this.dat_poste_trav = dat_poste_trav;
	}
	public String getCod_nat_recr() {
		return cod_nat_recr;
	}
	public void setCod_nat_recr(String cod_nat_recr) {
		this.cod_nat_recr = cod_nat_recr;
	}
	public Date getDat_adm_tech() {
		return dat_adm_tech;
	}
	public void setDat_adm_tech(Date dat_adm_tech) {
		this.dat_adm_tech = dat_adm_tech;
	}
	public Date getDat_org_serv() {
		return dat_org_serv;
	}
	public void setDat_org_serv(Date dat_org_serv) {
		this.dat_org_serv = dat_org_serv;
	}
	public String getTyp_rang() {
		return typ_rang;
	}
	public void setTyp_rang(String typ_rang) {
		this.typ_rang = typ_rang;
	}
	public String getHandicap() {
		return handicap;
	}
	public void setHandicap(String handicap) {
		this.handicap = handicap;
	}
	public String getPourcent_hand() {
		return pourcent_hand;
	}
	public void setPourcent_hand(String pourcent_hand) {
		this.pourcent_hand = pourcent_hand;
	}
	public String getTyp_handicap() {
		return typ_handicap;
	}
	public void setTyp_handicap(String typ_handicap) {
		this.typ_handicap = typ_handicap;
	}
	public String getNum_fich_hand() {
		return num_fich_hand;
	}
	public void setNum_fich_hand(String num_fich_hand) {
		this.num_fich_hand = num_fich_hand;
	}
	public long getNiv_sal() {
		return niv_sal;
	}
	public void setNiv_sal(long niv_sal) {
		this.niv_sal = niv_sal;
	}
	public String getCod_assur() {
		return cod_assur;
	}
	public void setCod_assur(String cod_assur) {
		this.cod_assur = cod_assur;
	}
	public String getNum_assur() {
		return num_assur;
	}
	public void setNum_assur(String num_assur) {
		this.num_assur = num_assur;
	}
	public String getTyp_id() {
		return typ_id;
	}
	public void setTyp_id(String typ_id) {
		this.typ_id = typ_id;
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
	public Date getDat_niv_sal() {
		return dat_niv_sal;
	}
	public void setDat_niv_sal(Date dat_niv_sal) {
		this.dat_niv_sal = dat_niv_sal;
	}
	public String getPresum_nais() {
		return presum_nais;
	}
	public void setPresum_nais(String presum_nais) {
		this.presum_nais = presum_nais;
	}
	public String getCod_gouv() {
		return cod_gouv;
	}
	public void setCod_gouv(String cod_gouv) {
		this.cod_gouv = cod_gouv;
	}
	public String getLib_gouv() {
		return lib_gouv;
	}
	public void setLib_gouv(String lib_gouv) {
		this.lib_gouv = lib_gouv;
	}
	public String getBenef_allf() {
		return benef_allf;
	}
	public void setBenef_allf(String benef_allf) {
		this.benef_allf = benef_allf;
	}
	public String getNum_acc() {
		return num_acc;
	}
	public void setNum_acc(String num_acc) {
		this.num_acc = num_acc;
	}
	public List<AdrPers> getAdresses_personnel() {
		return adresses_personnel;
	}
	public void setAdresses_personnel(List<AdrPers> adresses_personnel) {
		this.adresses_personnel = adresses_personnel;
	}
	public List<PossModp> getMode_payement() {
		return mode_payement;
	}
	public void setMode_payement(List<PossModp> mode_payement) {
		this.mode_payement = mode_payement;
	}
	public List<RenseignementPers> getRens_pers() {
		return rens_pers;
	}
	public void setRens_pers(List<RenseignementPers> rens_pers) {
		this.rens_pers = rens_pers;
	}
	public List<ETABLIS_PERS> getEtab() {
		return etab;
	}
	public void setEtab(List<ETABLIS_PERS> etab) {
		this.etab = etab;
	}
	public List<POSSEDE> getPossede() {
		return possede;
	}
	public void setPossede(List<POSSEDE> possede) {
		this.possede = possede;
	}
	@Override
	public String toString() {
		return "Personnel {mat_pers=" + mat_pers + ", nom_pers=" + nom_pers + ", pren_pers=" + pren_pers + "}";
	}
	
	
}
	