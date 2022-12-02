package com.arabsoft.ajir.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name = "ETABLIS_PERS")
@IdClass(Etab_persId.class)
public class ETABLIS_PERS  {
	@Id
	@JsonProperty(access = Access.WRITE_ONLY)
	private String cod_soc;
	@Id
	@JsonProperty(access = Access.WRITE_ONLY)
	private String mat_pers;
	@Id
	@JsonProperty(access = Access.WRITE_ONLY)
	private long num_etablis;
	
	
	@Column(name = "DAT_EMB")
	@JsonFormat( pattern = "dd/MM/yyyy") 


	private Date dat_emb;
	@Column(name = "DAT_FIN")
	@JsonFormat( pattern = "dd/MM/yyyy") 

	private Date dat_fin;

	@Column(name = "ETABLISSEMENT")

	private String etablissement;
	@Column(name = "EMPLOI")

	private String emploi;
	@Column(name = "DUREE")

	private Long duree;
	@Column(name = "PEC_ANC")

	private Long pec_anc;
	@Column(name = "ETAT_ETABLIS")

	private String etat_etablis;
	@Column(name = "FONCT_CORR")

	private String fonct_corr;
	@Column(name = "WANNEE")

	private Long wannee;
	@Column(name = "WMOIS")

	private Long wmois;
	@Column(name = "WJOURS")

	private Long wjours;
	@Column(name = "COD_ORG")

	private String cod_org;
	@Column(name = "ID_ETABLIS_PERS")

	private Long id_etablis_pers;
	@Column(name = "COD_USER")

	private String cod_user;


	


	public ETABLIS_PERS(String cod_soc, String mat_pers, long num_etablis, Date dat_emb, Date dat_fin,
			String etablissement, String emploi, Long duree, Long pec_anc, String etat_etablis, String fonct_corr,
			Long wannee, Long wmois, Long wjours, String cod_org, Long id_etablis_pers, String cod_user,
			String lib_adm_tech) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.num_etablis = num_etablis;
		this.dat_emb = dat_emb;
		this.dat_fin = dat_fin;
		this.etablissement = etablissement;
		this.emploi = emploi;
		this.duree = duree;
		this.pec_anc = pec_anc;
		this.etat_etablis = etat_etablis;
		this.fonct_corr = fonct_corr;
		this.wannee = wannee;
		this.wmois = wmois;
		this.wjours = wjours;
		this.cod_org = cod_org;
		this.id_etablis_pers = id_etablis_pers;
		this.cod_user = cod_user;
	}

	public ETABLIS_PERS() {
		super();
	}

	public Date getDat_emb() {
		return dat_emb;
	}

	public void setDat_emb(Date dat_emb) {
		this.dat_emb = dat_emb;
	}

	public Date getDat_fin() {
		return dat_fin;
	}

	public void setDat_fin(Date dat_fin) {
		this.dat_fin = dat_fin;
	}

	public String getEtablissement() {
		return etablissement;
	}

	public void setEtablissement(String etablissement) {
		this.etablissement = etablissement;
	}

	public String getEmploi() {
		return emploi;
	}

	public void setEmploi(String emploi) {
		this.emploi = emploi;
	}

	public Long getDuree() {
		return duree;
	}

	public void setDuree(Long duree) {
		this.duree = duree;
	}

	public Long getPec_anc() {
		return pec_anc;
	}

	public void setPec_anc(Long pec_anc) {
		this.pec_anc = pec_anc;
	}

	public String getEtat_etablis() {
		return etat_etablis;
	}

	public void setEtat_etablis(String etat_etablis) {
		this.etat_etablis = etat_etablis;
	}

	public String getFonct_corr() {
		return fonct_corr;
	}

	public void setFonct_corr(String fonct_corr) {
		this.fonct_corr = fonct_corr;
	}

	public Long getWannee() {
		return wannee;
	}

	public void setWannee(Long wannee) {
		this.wannee = wannee;
	}

	public Long getWmois() {
		return wmois;
	}

	public void setWmois(Long wmois) {
		this.wmois = wmois;
	}

	public Long getWjours() {
		return wjours;
	}

	public void setWjours(Long wjours) {
		this.wjours = wjours;
	}

	public String getCod_org() {
		return cod_org;
	}

	public void setCod_org(String cod_org) {
		this.cod_org = cod_org;
	}

	public Long getId_etablis_pers() {
		return id_etablis_pers;
	}

	public void setId_etablis_pers(Long id_etablis_pers) {
		this.id_etablis_pers = id_etablis_pers;
	}

	public String getCod_user() {
		return cod_user;
	}

	public void setCod_user(String cod_user) {
		this.cod_user = cod_user;
	}

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

	public long getNum_etablis() {
		return num_etablis;
	}

	public void setNum_etablis(long num_etablis) {
		this.num_etablis = num_etablis;
	}

	public ETABLIS_PERS(String cod_soc, String mat_pers, long num_etablis, Date dat_emb, Date dat_fin,
			String etablissement, String emploi, Long duree, Long pec_anc, String etat_etablis, String fonct_corr,
			Long wannee, Long wmois, Long wjours, String cod_org, Long id_etablis_pers, String cod_user) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.num_etablis = num_etablis;
		this.dat_emb = dat_emb;
		this.dat_fin = dat_fin;
		this.etablissement = etablissement;
		this.emploi = emploi;
		this.duree = duree;
		this.pec_anc = pec_anc;
		this.etat_etablis = etat_etablis;
		this.fonct_corr = fonct_corr;
		this.wannee = wannee;
		this.wmois = wmois;
		this.wjours = wjours;
		this.cod_org = cod_org;
		this.id_etablis_pers = id_etablis_pers;
		this.cod_user = cod_user;
	}

	public ETABLIS_PERS(Date dat_emb, Date dat_fin, String etablissement, String emploi, Long duree, Long pec_anc,
			String etat_etablis, String fonct_corr, Long wannee, Long wmois, Long wjours, String cod_org,
			Long id_etablis_pers, String cod_user) {
		super();
		this.dat_emb = dat_emb;
		this.dat_fin = dat_fin;
		this.etablissement = etablissement;
		this.emploi = emploi;
		this.duree = duree;
		this.pec_anc = pec_anc;
		this.etat_etablis = etat_etablis;
		this.fonct_corr = fonct_corr;
		this.wannee = wannee;
		this.wmois = wmois;
		this.wjours = wjours;
		this.cod_org = cod_org;
		this.id_etablis_pers = id_etablis_pers;
		this.cod_user = cod_user;
	}

	

	

	

}
