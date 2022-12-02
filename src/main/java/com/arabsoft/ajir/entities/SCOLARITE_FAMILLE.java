package com.arabsoft.ajir.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(IDScolaritefam.class)
public class SCOLARITE_FAMILLE {
	@Id
	 private String cod_soc  ;  
	@Id
	 private String mat_pers ;    
	@Id
	 private Long num_fam   ;  
	@Id
	 private Long annee_scolaire  ;     
	 private String etablissement  ;     
	 private String  cod_niveau ;         
	  private Long  moy_niv ;            
	  private String result_niv  ;         
	  private String etat_scol ;           
	  private String code_domaine  ;      
	  private String cod_lieu_geog  ;      
	  private Long  classement_gen ;      
	  private Long classement_ur  ;      
	  private String boursier ;            
	  private Long id_scolarite_famille ;
		@Column(insertable = false, updatable = false)

	  private String libprenom;
		
		
		@Column(insertable = false, updatable = false)

		private String libnomjf;
		@Column(insertable = false, updatable = false)

		private String libdat_naiss;
		@Column(insertable = false, updatable = false)

		private String libsexe;
		
	public String getLibsexe() {
			return libsexe;
		}
		public void setLibsexe(String libsexe) {
			this.libsexe = libsexe;
		}
	public SCOLARITE_FAMILLE(String cod_soc, String mat_pers, Long num_fam, Long annee_scolaire,
				String etablissement, String cod_niveau, Long moy_niv, String result_niv, String etat_scol,
				String code_domaine, String cod_lieu_geog, Long classement_gen, Long classement_ur, String boursier,
				Long id_scolarite_famille, String libprenom, String libnomjf, String libdat_naiss, String libsexe) {
			super();
			this.cod_soc = cod_soc;
			this.mat_pers = mat_pers;
			this.num_fam = num_fam;
			this.annee_scolaire = annee_scolaire;
			this.etablissement = etablissement;
			this.cod_niveau = cod_niveau;
			this.moy_niv = moy_niv;
			this.result_niv = result_niv;
			this.etat_scol = etat_scol;
			this.code_domaine = code_domaine;
			this.cod_lieu_geog = cod_lieu_geog;
			this.classement_gen = classement_gen;
			this.classement_ur = classement_ur;
			this.boursier = boursier;
			this.id_scolarite_famille = id_scolarite_famille;
			this.libprenom = libprenom;
			this.libnomjf = libnomjf;
			this.libdat_naiss = libdat_naiss;
			this.libsexe = libsexe;
		}
	public SCOLARITE_FAMILLE(String cod_soc, String mat_pers, Long num_fam, Long annee_scolaire,
				String etablissement, String cod_niveau, Long moy_niv, String result_niv, String etat_scol,
				String code_domaine, String cod_lieu_geog, Long classement_gen, Long classement_ur, String boursier,
				Long id_scolarite_famille, String libprenom, String libnomjf, String libdat_naiss) {
			super();
			this.cod_soc = cod_soc;
			this.mat_pers = mat_pers;
			this.num_fam = num_fam;
			this.annee_scolaire = annee_scolaire;
			this.etablissement = etablissement;
			this.cod_niveau = cod_niveau;
			this.moy_niv = moy_niv;
			this.result_niv = result_niv;
			this.etat_scol = etat_scol;
			this.code_domaine = code_domaine;
			this.cod_lieu_geog = cod_lieu_geog;
			this.classement_gen = classement_gen;
			this.classement_ur = classement_ur;
			this.boursier = boursier;
			this.id_scolarite_famille = id_scolarite_famille;
			this.libprenom = libprenom;
			this.libnomjf = libnomjf;
			this.libdat_naiss = libdat_naiss;
		}
	public String getLibnomjf() {
			return libnomjf;
		}
		public void setLibnomjf(String libnomjf) {
			this.libnomjf = libnomjf;
		}
		public String getLibdat_naiss() {
			return libdat_naiss;
		}
		public void setLibdat_naiss(String libdat_naiss) {
			this.libdat_naiss = libdat_naiss;
		}
	public String getLibprenom() {
			return libprenom;
		}
		public void setLibprenom(String libprenom) {
			this.libprenom = libprenom;
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
	public Long getNum_fam() {
		return num_fam;
	}
	public void setNum_fam(Long num_fam) {
		this.num_fam = num_fam;
	}
	public Long getAnnee_scolaire() {
		return annee_scolaire;
	}
	public void setAnnee_scolaire(Long annee_scolaire) {
		this.annee_scolaire = annee_scolaire;
	}
	public String getEtablissement() {
		return etablissement;
	}
	public void setEtablissement(String etablissement) {
		this.etablissement = etablissement;
	}
	public String getCod_niveau() {
		return cod_niveau;
	}
	public void setCod_niveau(String cod_niveau) {
		this.cod_niveau = cod_niveau;
	}
	public Long getMoy_niv() {
		return moy_niv;
	}
	public void setMoy_niv(Long moy_niv) {
		this.moy_niv = moy_niv;
	}
	public String getResult_niv() {
		return result_niv;
	}
	public void setResult_niv(String result_niv) {
		this.result_niv = result_niv;
	}
	public String getEtat_scol() {
		return etat_scol;
	}
	public void setEtat_scol(String etat_scol) {
		this.etat_scol = etat_scol;
	}
	public String getCode_domaine() {
		return code_domaine;
	}
	public void setCode_domaine(String code_domaine) {
		this.code_domaine = code_domaine;
	}
	public String getCod_lieu_geog() {
		return cod_lieu_geog;
	}
	public void setCod_lieu_geog(String cod_lieu_geog) {
		this.cod_lieu_geog = cod_lieu_geog;
	}
	public Long getClassement_gen() {
		return classement_gen;
	}
	public void setClassement_gen(Long classement_gen) {
		this.classement_gen = classement_gen;
	}
	public Long getClassement_ur() {
		return classement_ur;
	}
	public void setClassement_ur(Long classement_ur) {
		this.classement_ur = classement_ur;
	}
	public String getBoursier() {
		return boursier;
	}
	public void setBoursier(String boursier) {
		this.boursier = boursier;
	}
	public Long getId_scolarite_famille() {
		return id_scolarite_famille;
	}
	public void setId_scolarite_famille(Long id_scolarite_famille) {
		this.id_scolarite_famille = id_scolarite_famille;
	}
	public SCOLARITE_FAMILLE() {
		super();
	}
	public SCOLARITE_FAMILLE(String cod_soc, String mat_pers, Long num_fam, Long annee_scolaire, String etablissement,
			String cod_niveau, Long moy_niv, String result_niv, String etat_scol, String code_domaine,
			String cod_lieu_geog, Long classement_gen, Long classement_ur, String boursier, Long id_scolarite_famille) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.num_fam = num_fam;
		this.annee_scolaire = annee_scolaire;
		this.etablissement = etablissement;
		this.cod_niveau = cod_niveau;
		this.moy_niv = moy_niv;
		this.result_niv = result_niv;
		this.etat_scol = etat_scol;
		this.code_domaine = code_domaine;
		this.cod_lieu_geog = cod_lieu_geog;
		this.classement_gen = classement_gen;
		this.classement_ur = classement_ur;
		this.boursier = boursier;
		this.id_scolarite_famille = id_scolarite_famille;
	}
	public SCOLARITE_FAMILLE(String cod_soc, String mat_pers, Long num_fam, Long annee_scolaire, String etablissement,
			String cod_niveau, Long moy_niv, String result_niv, String etat_scol, String code_domaine,
			String cod_lieu_geog, Long classement_gen, Long classement_ur, String boursier, Long id_scolarite_famille,
			String libprenom) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.num_fam = num_fam;
		this.annee_scolaire = annee_scolaire;
		this.etablissement = etablissement;
		this.cod_niveau = cod_niveau;
		this.moy_niv = moy_niv;
		this.result_niv = result_niv;
		this.etat_scol = etat_scol;
		this.code_domaine = code_domaine;
		this.cod_lieu_geog = cod_lieu_geog;
		this.classement_gen = classement_gen;
		this.classement_ur = classement_ur;
		this.boursier = boursier;
		this.id_scolarite_famille = id_scolarite_famille;
		this.libprenom = libprenom;
	}
	  

}
