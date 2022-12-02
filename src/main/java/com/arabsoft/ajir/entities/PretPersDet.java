package com.arabsoft.ajir.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class PretPersDet {
	
	@Id
	public String cod_soc;
	public String mat_pers;
	public Integer cod_pret;
	@Transient
	public String lib_serv;
	@Transient
    public String college;
	@Transient
    public String categorie;
	@Transient
    public String lib_grad;
	@Transient
    public String lib_poste;
	@Transient
    public String lib_fonct;
	@Transient
    public String lib_statut;
	@Transient
    public String position;
	public String cod_serv;
	public String cod_categ;
	public String cod_cat;
	public String cod_grad;
	public String adm_tech;
	public String cod_fonct;
	public String cod_affect;
	public String cod_motif;
	public Integer num_dem_pret;
	public String cod_etat_pret;
	public String typ_etat;
	public String cod_grp_pret;
	public String typ_pret;
	public String abrv_fixe;
	public String org_pret;
	public Date prt_dat_acc;
	public Integer prt_mnt_glb;
	public Integer prt_taux;
	public Integer prt_ech;
	public Integer delai_grace;
	public Integer nbr_tranche;
	public String mod_remb;
	public Date prt_dat_deb;
	public Date prt_dat_fin;
	public Integer prt_interet;
	public Integer prt_mnt_rem;
	public Integer rem_men;
	public Integer dern_rem_men;
	public Integer prt_rendu;
	public Integer nbr_retenue;
	public String app_int_franch;
	public Integer int_franch;
	public Date dat_deblocage;
	public Integer prt_mnt_debloque;
	public String objet_pret;
	public String ass_pret;
	public Integer cod_pret_ref;
	public Integer annee_fond;
	public String cod_fond;
	public Date dat_saisie;
	public String cod_user;
	public Integer mnt_achat;
	public String obs_litige;
	public String derogation;
	public Integer sal_ref;
	public String ordonnance;
	public Integer seq_ecrt;
	public String ref_pret;
	public Integer int_grace;
	public String cod_alert;
	public Integer seq_alert;
	public Date dat_validite;
	public String bonification;
	public Integer tmmplus;
	public String prt_log;
	public Integer id_pret_pers;
	public Integer num_lot;
	public Date dat_comptable;
	public String rib_pers;
    @Transient
	public List <Integer> listCodPret;
	
	
	public List<Integer> getListCodPret() {
		return listCodPret;
	}
	public void setListCodPret(List<Integer> listCodPret) {
		this.listCodPret = listCodPret;
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
	public Integer getCod_pret() {
		return cod_pret;
	}
	public void setCod_pret(Integer cod_pret) {
		this.cod_pret = cod_pret;
	}
	public String getLib_serv() {
		return lib_serv;
	}
	public void setLib_serv(String lib_serv) {
		this.lib_serv = lib_serv;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public String getLib_grad() {
		return lib_grad;
	}
	public void setLib_grad(String lib_grad) {
		this.lib_grad = lib_grad;
	}
	public String getLib_poste() {
		return lib_poste;
	}
	public void setLib_poste(String lib_poste) {
		this.lib_poste = lib_poste;
	}
	public String getLib_fonct() {
		return lib_fonct;
	}
	public void setLib_fonct(String lib_fonct) {
		this.lib_fonct = lib_fonct;
	}
	public String getLib_statut() {
		return lib_statut;
	}
	public void setLib_statut(String lib_statut) {
		this.lib_statut = lib_statut;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getCod_serv() {
		return cod_serv;
	}
	public void setCod_serv(String cod_serv) {
		this.cod_serv = cod_serv;
	}
	public String getCod_categ() {
		return cod_categ;
	}
	public void setCod_categ(String cod_categ) {
		this.cod_categ = cod_categ;
	}
	public String getCod_cat() {
		return cod_cat;
	}
	public void setCod_cat(String cod_cat) {
		this.cod_cat = cod_cat;
	}
	public String getCod_grad() {
		return cod_grad;
	}
	public void setCod_grad(String cod_grad) {
		this.cod_grad = cod_grad;
	}
	public String getAdm_tech() {
		return adm_tech;
	}
	public void setAdm_tech(String adm_tech) {
		this.adm_tech = adm_tech;
	}
	public String getCod_fonct() {
		return cod_fonct;
	}
	public void setCod_fonct(String cod_fonct) {
		this.cod_fonct = cod_fonct;
	}
	public String getCod_affect() {
		return cod_affect;
	}
	public void setCod_affect(String cod_affect) {
		this.cod_affect = cod_affect;
	}
	public String getCod_motif() {
		return cod_motif;
	}
	public void setCod_motif(String cod_motif) {
		this.cod_motif = cod_motif;
	}
	public Integer getNum_dem_pret() {
		return num_dem_pret;
	}
	public void setNum_dem_pret(Integer num_dem_pret) {
		this.num_dem_pret = num_dem_pret;
	}
	public String getCod_etat_pret() {
		return cod_etat_pret;
	}
	public void setCod_etat_pret(String cod_etat_pret) {
		this.cod_etat_pret = cod_etat_pret;
	}
	public String getTyp_etat() {
		return typ_etat;
	}
	public void setTyp_etat(String typ_etat) {
		this.typ_etat = typ_etat;
	}
	public String getCod_grp_pret() {
		return cod_grp_pret;
	}
	public void setCod_grp_pret(String cod_grp_pret) {
		this.cod_grp_pret = cod_grp_pret;
	}
	public String getTyp_pret() {
		return typ_pret;
	}
	public void setTyp_pret(String typ_pret) {
		this.typ_pret = typ_pret;
	}
	public String getAbrv_fixe() {
		return abrv_fixe;
	}
	public void setAbrv_fixe(String abrv_fixe) {
		this.abrv_fixe = abrv_fixe;
	}
	public String getOrg_pret() {
		return org_pret;
	}
	public void setOrg_pret(String org_pret) {
		this.org_pret = org_pret;
	}
	public Date getPrt_dat_acc() {
		return prt_dat_acc;
	}
	public void setPrt_dat_acc(Date prt_dat_acc) {
		this.prt_dat_acc = prt_dat_acc;
	}
	public Integer getPrt_mnt_glb() {
		return prt_mnt_glb;
	}
	public void setPrt_mnt_glb(Integer prt_mnt_glb) {
		this.prt_mnt_glb = prt_mnt_glb;
	}
	public Integer getPrt_taux() {
		return prt_taux;
	}
	public void setPrt_taux(Integer prt_taux) {
		this.prt_taux = prt_taux;
	}
	public Integer getPrt_ech() {
		return prt_ech;
	}
	public void setPrt_ech(Integer prt_ech) {
		this.prt_ech = prt_ech;
	}
	public Integer getDelai_grace() {
		return delai_grace;
	}
	public void setDelai_grace(Integer delai_grace) {
		this.delai_grace = delai_grace;
	}
	public Integer getNbr_tranche() {
		return nbr_tranche;
	}
	public void setNbr_tranche(Integer nbr_tranche) {
		this.nbr_tranche = nbr_tranche;
	}
	public String getMod_remb() {
		return mod_remb;
	}
	public void setMod_remb(String mod_remb) {
		this.mod_remb = mod_remb;
	}
	public Date getPrt_dat_deb() {
		return prt_dat_deb;
	}
	public void setPrt_dat_deb(Date prt_dat_deb) {
		this.prt_dat_deb = prt_dat_deb;
	}
	public Date getPrt_dat_fin() {
		return prt_dat_fin;
	}
	public void setPrt_dat_fin(Date prt_dat_fin) {
		this.prt_dat_fin = prt_dat_fin;
	}
	public Integer getPrt_interet() {
		return prt_interet;
	}
	public void setPrt_interet(Integer prt_interet) {
		this.prt_interet = prt_interet;
	}
	public Integer getPrt_mnt_rem() {
		return prt_mnt_rem;
	}
	public void setPrt_mnt_rem(Integer prt_mnt_rem) {
		this.prt_mnt_rem = prt_mnt_rem;
	}
	public Integer getRem_men() {
		return rem_men;
	}
	public void setRem_men(Integer rem_men) {
		this.rem_men = rem_men;
	}
	public Integer getDern_rem_men() {
		return dern_rem_men;
	}
	public void setDern_rem_men(Integer dern_rem_men) {
		this.dern_rem_men = dern_rem_men;
	}
	public Integer getPrt_rendu() {
		return prt_rendu;
	}
	public void setPrt_rendu(Integer prt_rendu) {
		this.prt_rendu = prt_rendu;
	}
	public Integer getNbr_retenue() {
		return nbr_retenue;
	}
	public void setNbr_retenue(Integer nbr_retenue) {
		this.nbr_retenue = nbr_retenue;
	}
	public String getApp_int_franch() {
		return app_int_franch;
	}
	public void setApp_int_franch(String app_int_franch) {
		this.app_int_franch = app_int_franch;
	}
	public Integer getInt_franch() {
		return int_franch;
	}
	public void setInt_franch(Integer int_franch) {
		this.int_franch = int_franch;
	}
	public Date getDat_deblocage() {
		return dat_deblocage;
	}
	public void setDat_deblocage(Date dat_deblocage) {
		this.dat_deblocage = dat_deblocage;
	}
	public Integer getPrt_mnt_debloque() {
		return prt_mnt_debloque;
	}
	public void setPrt_mnt_debloque(Integer prt_mnt_debloque) {
		this.prt_mnt_debloque = prt_mnt_debloque;
	}
	public String getObjet_pret() {
		return objet_pret;
	}
	public void setObjet_pret(String objet_pret) {
		this.objet_pret = objet_pret;
	}
	public String getAss_pret() {
		return ass_pret;
	}
	public void setAss_pret(String ass_pret) {
		this.ass_pret = ass_pret;
	}
	public Integer getCod_pret_ref() {
		return cod_pret_ref;
	}
	public void setCod_pret_ref(Integer cod_pret_ref) {
		this.cod_pret_ref = cod_pret_ref;
	}
	public Integer getAnnee_fond() {
		return annee_fond;
	}
	public void setAnnee_fond(Integer annee_fond) {
		this.annee_fond = annee_fond;
	}
	public String getCod_fond() {
		return cod_fond;
	}
	public void setCod_fond(String cod_fond) {
		this.cod_fond = cod_fond;
	}
	public Date getDat_saisie() {
		return dat_saisie;
	}
	public void setDat_saisie(Date dat_saisie) {
		this.dat_saisie = dat_saisie;
	}
	public String getCod_user() {
		return cod_user;
	}
	public void setCod_user(String cod_user) {
		this.cod_user = cod_user;
	}
	public Integer getMnt_achat() {
		return mnt_achat;
	}
	public void setMnt_achat(Integer mnt_achat) {
		this.mnt_achat = mnt_achat;
	}
	public String getObs_litige() {
		return obs_litige;
	}
	public void setObs_litige(String obs_litige) {
		this.obs_litige = obs_litige;
	}
	public String getDerogation() {
		return derogation;
	}
	public void setDerogation(String derogation) {
		this.derogation = derogation;
	}
	public Integer getSal_ref() {
		return sal_ref;
	}
	public void setSal_ref(Integer sal_ref) {
		this.sal_ref = sal_ref;
	}
	public String getOrdonnance() {
		return ordonnance;
	}
	public void setOrdonnance(String ordonnance) {
		this.ordonnance = ordonnance;
	}
	public Integer getSeq_ecrt() {
		return seq_ecrt;
	}
	public void setSeq_ecrt(Integer seq_ecrt) {
		this.seq_ecrt = seq_ecrt;
	}
	public String getRef_pret() {
		return ref_pret;
	}
	public void setRef_pret(String ref_pret) {
		this.ref_pret = ref_pret;
	}
	public Integer getInt_grace() {
		return int_grace;
	}
	public void setInt_grace(Integer int_grace) {
		this.int_grace = int_grace;
	}
	public String getCod_alert() {
		return cod_alert;
	}
	public void setCod_alert(String cod_alert) {
		this.cod_alert = cod_alert;
	}
	public Integer getSeq_alert() {
		return seq_alert;
	}
	public void setSeq_alert(Integer seq_alert) {
		this.seq_alert = seq_alert;
	}
	public Date getDat_validite() {
		return dat_validite;
	}
	public void setDat_validite(Date dat_validite) {
		this.dat_validite = dat_validite;
	}
	public String getBonification() {
		return bonification;
	}
	public void setBonification(String bonification) {
		this.bonification = bonification;
	}
	public Integer getTmmplus() {
		return tmmplus;
	}
	public void setTmmplus(Integer tmmplus) {
		this.tmmplus = tmmplus;
	}
	public String getPrt_log() {
		return prt_log;
	}
	public void setPrt_log(String prt_log) {
		this.prt_log = prt_log;
	}
	public Integer getId_pret_pers() {
		return id_pret_pers;
	}
	public void setId_pret_pers(Integer id_pret_pers) {
		this.id_pret_pers = id_pret_pers;
	}
	public Integer getNum_lot() {
		return num_lot;
	}
	public void setNum_lot(Integer num_lot) {
		this.num_lot = num_lot;
	}
	public Date getDat_comptable() {
		return dat_comptable;
	}
	public void setDat_comptable(Date dat_comptable) {
		this.dat_comptable = dat_comptable;
	}
	public String getRib_pers() {
		return rib_pers;
	}
	public void setRib_pers(String rib_pers) {
		this.rib_pers = rib_pers;
	}
	
	
	
	public PretPersDet(String cod_soc, String mat_pers, Integer cod_pret, String lib_serv, String college,
			String categorie, String lib_grad, String lib_poste, String lib_fonct, String lib_statut, String position,
			String cod_serv, String cod_categ, String cod_cat, String cod_grad, String adm_tech, String cod_fonct,
			String cod_affect, String cod_motif, Integer num_dem_pret, String cod_etat_pret, String typ_etat,
			String cod_grp_pret, String typ_pret, String abrv_fixe, String org_pret, Date prt_dat_acc,
			Integer prt_mnt_glb, Integer prt_taux, Integer prt_ech, Integer delai_grace, Integer nbr_tranche,
			String mod_remb, Date prt_dat_deb, Date prt_dat_fin, Integer prt_interet, Integer prt_mnt_rem,
			Integer rem_men, Integer dern_rem_men, Integer prt_rendu, Integer nbr_retenue, String app_int_franch,
			Integer int_franch, Date dat_deblocage, Integer prt_mnt_debloque, String objet_pret, String ass_pret,
			Integer cod_pret_ref, Integer annee_fond, String cod_fond, Date dat_saisie, String cod_user,
			Integer mnt_achat, String obs_litige, String derogation, Integer sal_ref, String ordonnance,
			Integer seq_ecrt, String ref_pret, Integer int_grace, String cod_alert, Integer seq_alert,
			Date dat_validite, String bonification, Integer tmmplus, String prt_log, Integer id_pret_pers,
			Integer num_lot, Date dat_comptable, String rib_pers, List<Integer> listCodPret) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.cod_pret = cod_pret;
		this.lib_serv = lib_serv;
		this.college = college;
		this.categorie = categorie;
		this.lib_grad = lib_grad;
		this.lib_poste = lib_poste;
		this.lib_fonct = lib_fonct;
		this.lib_statut = lib_statut;
		this.position = position;
		this.cod_serv = cod_serv;
		this.cod_categ = cod_categ;
		this.cod_cat = cod_cat;
		this.cod_grad = cod_grad;
		this.adm_tech = adm_tech;
		this.cod_fonct = cod_fonct;
		this.cod_affect = cod_affect;
		this.cod_motif = cod_motif;
		this.num_dem_pret = num_dem_pret;
		this.cod_etat_pret = cod_etat_pret;
		this.typ_etat = typ_etat;
		this.cod_grp_pret = cod_grp_pret;
		this.typ_pret = typ_pret;
		this.abrv_fixe = abrv_fixe;
		this.org_pret = org_pret;
		this.prt_dat_acc = prt_dat_acc;
		this.prt_mnt_glb = prt_mnt_glb;
		this.prt_taux = prt_taux;
		this.prt_ech = prt_ech;
		this.delai_grace = delai_grace;
		this.nbr_tranche = nbr_tranche;
		this.mod_remb = mod_remb;
		this.prt_dat_deb = prt_dat_deb;
		this.prt_dat_fin = prt_dat_fin;
		this.prt_interet = prt_interet;
		this.prt_mnt_rem = prt_mnt_rem;
		this.rem_men = rem_men;
		this.dern_rem_men = dern_rem_men;
		this.prt_rendu = prt_rendu;
		this.nbr_retenue = nbr_retenue;
		this.app_int_franch = app_int_franch;
		this.int_franch = int_franch;
		this.dat_deblocage = dat_deblocage;
		this.prt_mnt_debloque = prt_mnt_debloque;
		this.objet_pret = objet_pret;
		this.ass_pret = ass_pret;
		this.cod_pret_ref = cod_pret_ref;
		this.annee_fond = annee_fond;
		this.cod_fond = cod_fond;
		this.dat_saisie = dat_saisie;
		this.cod_user = cod_user;
		this.mnt_achat = mnt_achat;
		this.obs_litige = obs_litige;
		this.derogation = derogation;
		this.sal_ref = sal_ref;
		this.ordonnance = ordonnance;
		this.seq_ecrt = seq_ecrt;
		this.ref_pret = ref_pret;
		this.int_grace = int_grace;
		this.cod_alert = cod_alert;
		this.seq_alert = seq_alert;
		this.dat_validite = dat_validite;
		this.bonification = bonification;
		this.tmmplus = tmmplus;
		this.prt_log = prt_log;
		this.id_pret_pers = id_pret_pers;
		this.num_lot = num_lot;
		this.dat_comptable = dat_comptable;
		this.rib_pers = rib_pers;
		this.listCodPret = listCodPret;
	}
	public PretPersDet() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
