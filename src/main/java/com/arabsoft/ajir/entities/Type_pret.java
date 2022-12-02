package com.arabsoft.ajir.entities;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TYPE_PRET")
public class Type_pret {
	@EmbeddedId
	private Type_pretPK id;
	@Column(insertable = false,updatable = false)
	private String cod_soc;
	@Column(insertable = false,updatable = false)
	private String cod_grp_pret;
	@Column(insertable = false,updatable = false)
	private String typ_pret;
	private String abrv_fixe;
	private String lib_pret;
	private String lib_pret_a;
	private Long taux_int;
	private Long duree_remb;
	private Long delai_grace;
	private Long nbr_tranche;
	private Long anciennete;
	private String typ_fond;
	private String typ_plafond;
	private Long indice;
	private Long taux_coop;
	private Long nbr_cariere;
	private String delai_apres_ret;
	private String typ_ass_pret;
	private String int_fixe;
	private String abreviation;
	private String nat_typ;
	private String ass_pret;
	private String renouv;
	private String abrv_compta;
	private String libre_serv;
	private String typ_int;
	private Long plafond;
	private String typ_taux;
	private Long pourcent;
	private Long dure_renouv;
	private String commission;
	private String chap_debit;
	private String chap_liais;
	private String chap_cred;
	private String cod_oper;
	private String abrv_fixe_int;
	private String cod_fond;
	private String auto_fin;
	private String endettement1;
	private Long end_taux1;
	private String endettement2;
	private Long end_taux2;
	private String prt_log;
	private Long id_type_pret;

	public Type_pret() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Type_pret(String cod_soc, String cod_grp_pret, String typ_pret, String abrv_fixe, String lib_pret,
			String lib_pret_a, Long taux_int, Long duree_remb, Long delai_grace, Long nbr_tranche, Long anciennete,
			String typ_fond, String typ_plafond, Long indice, Long taux_coop, Long nbr_cariere, String delai_apres_ret,
			String typ_ass_pret, String int_fixe, String abreviation, String nat_typ, String ass_pret, String renouv,
			String abrv_compta, String libre_serv, String typ_int, Long plafond, String typ_taux, Long pourcent,
			Long dure_renouv, String commission, String chap_debit, String chap_liais, String chap_cred,
			String cod_oper, String abrv_fixe_int, String cod_fond, String auto_fin, String endettement1,
			Long end_taux1, String endettement2, Long end_taux2, String prt_log, Long id_type_pret) {
		super();
		this.cod_soc = cod_soc;
		this.cod_grp_pret = cod_grp_pret;
		this.typ_pret = typ_pret;
		this.abrv_fixe = abrv_fixe;
		this.lib_pret = lib_pret;
		this.lib_pret_a = lib_pret_a;
		this.taux_int = taux_int;
		this.duree_remb = duree_remb;
		this.delai_grace = delai_grace;
		this.nbr_tranche = nbr_tranche;
		this.anciennete = anciennete;
		this.typ_fond = typ_fond;
		this.typ_plafond = typ_plafond;
		this.indice = indice;
		this.taux_coop = taux_coop;
		this.nbr_cariere = nbr_cariere;
		this.delai_apres_ret = delai_apres_ret;
		this.typ_ass_pret = typ_ass_pret;
		this.int_fixe = int_fixe;
		this.abreviation = abreviation;
		this.nat_typ = nat_typ;
		this.ass_pret = ass_pret;
		this.renouv = renouv;
		this.abrv_compta = abrv_compta;
		this.libre_serv = libre_serv;
		this.typ_int = typ_int;
		this.plafond = plafond;
		this.typ_taux = typ_taux;
		this.pourcent = pourcent;
		this.dure_renouv = dure_renouv;
		this.commission = commission;
		this.chap_debit = chap_debit;
		this.chap_liais = chap_liais;
		this.chap_cred = chap_cred;
		this.cod_oper = cod_oper;
		this.abrv_fixe_int = abrv_fixe_int;
		this.cod_fond = cod_fond;
		this.auto_fin = auto_fin;
		this.endettement1 = endettement1;
		this.end_taux1 = end_taux1;
		this.endettement2 = endettement2;
		this.end_taux2 = end_taux2;
		this.prt_log = prt_log;
		this.id_type_pret = id_type_pret;
	}

	public Type_pretPK getId() {
		return id;
	}

	public void setId(Type_pretPK id) {
		this.id = id;
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

	public String getLib_pret() {
		return lib_pret;
	}

	public void setLib_pret(String lib_pret) {
		this.lib_pret = lib_pret;
	}

	public String getLib_pret_a() {
		return lib_pret_a;
	}

	public void setLib_pret_a(String lib_pret_a) {
		this.lib_pret_a = lib_pret_a;
	}

	public Long getTaux_int() {
		return taux_int;
	}

	public void setTaux_int(Long taux_int) {
		this.taux_int = taux_int;
	}

	public Long getDuree_remb() {
		return duree_remb;
	}

	public void setDuree_remb(Long duree_remb) {
		this.duree_remb = duree_remb;
	}

	public Long getDelai_grace() {
		return delai_grace;
	}

	public void setDelai_grace(Long delai_grace) {
		this.delai_grace = delai_grace;
	}

	public Long getNbr_tranche() {
		return nbr_tranche;
	}

	public void setNbr_tranche(Long nbr_tranche) {
		this.nbr_tranche = nbr_tranche;
	}

	public Long getAnciennete() {
		return anciennete;
	}

	public void setAnciennete(Long anciennete) {
		this.anciennete = anciennete;
	}

	public String getTyp_fond() {
		return typ_fond;
	}

	public void setTyp_fond(String typ_fond) {
		this.typ_fond = typ_fond;
	}

	public String getTyp_plafond() {
		return typ_plafond;
	}

	public void setTyp_plafond(String typ_plafond) {
		this.typ_plafond = typ_plafond;
	}

	public Long getIndice() {
		return indice;
	}

	public void setIndice(Long indice) {
		this.indice = indice;
	}

	public Long getTaux_coop() {
		return taux_coop;
	}

	public void setTaux_coop(Long taux_coop) {
		this.taux_coop = taux_coop;
	}

	public Long getNbr_cariere() {
		return nbr_cariere;
	}

	public void setNbr_cariere(Long nbr_cariere) {
		this.nbr_cariere = nbr_cariere;
	}

	public String getDelai_apres_ret() {
		return delai_apres_ret;
	}

	public void setDelai_apres_ret(String delai_apres_ret) {
		this.delai_apres_ret = delai_apres_ret;
	}

	public String getTyp_ass_pret() {
		return typ_ass_pret;
	}

	public void setTyp_ass_pret(String typ_ass_pret) {
		this.typ_ass_pret = typ_ass_pret;
	}

	public String getInt_fixe() {
		return int_fixe;
	}

	public void setInt_fixe(String int_fixe) {
		this.int_fixe = int_fixe;
	}

	public String getAbreviation() {
		return abreviation;
	}

	public void setAbreviation(String abreviation) {
		this.abreviation = abreviation;
	}

	public String getNat_typ() {
		return nat_typ;
	}

	public void setNat_typ(String nat_typ) {
		this.nat_typ = nat_typ;
	}

	public String getAss_pret() {
		return ass_pret;
	}

	public void setAss_pret(String ass_pret) {
		this.ass_pret = ass_pret;
	}

	public String getRenouv() {
		return renouv;
	}

	public void setRenouv(String renouv) {
		this.renouv = renouv;
	}

	public String getAbrv_compta() {
		return abrv_compta;
	}

	public void setAbrv_compta(String abrv_compta) {
		this.abrv_compta = abrv_compta;
	}

	public String getLibre_serv() {
		return libre_serv;
	}

	public void setLibre_serv(String libre_serv) {
		this.libre_serv = libre_serv;
	}

	public String getTyp_int() {
		return typ_int;
	}

	public void setTyp_int(String typ_int) {
		this.typ_int = typ_int;
	}

	public Long getPlafond() {
		return plafond;
	}

	public void setPlafond(Long plafond) {
		this.plafond = plafond;
	}

	public String getTyp_taux() {
		return typ_taux;
	}

	public void setTyp_taux(String typ_taux) {
		this.typ_taux = typ_taux;
	}

	public Long getPourcent() {
		return pourcent;
	}

	public void setPourcent(Long pourcent) {
		this.pourcent = pourcent;
	}

	public Long getDure_renouv() {
		return dure_renouv;
	}

	public void setDure_renouv(Long dure_renouv) {
		this.dure_renouv = dure_renouv;
	}

	public String getCommission() {
		return commission;
	}

	public void setCommission(String commission) {
		this.commission = commission;
	}

	public String getChap_debit() {
		return chap_debit;
	}

	public void setChap_debit(String chap_debit) {
		this.chap_debit = chap_debit;
	}

	public String getChap_liais() {
		return chap_liais;
	}

	public void setChap_liais(String chap_liais) {
		this.chap_liais = chap_liais;
	}

	public String getChap_cred() {
		return chap_cred;
	}

	public void setChap_cred(String chap_cred) {
		this.chap_cred = chap_cred;
	}

	public String getCod_oper() {
		return cod_oper;
	}

	public void setCod_oper(String cod_oper) {
		this.cod_oper = cod_oper;
	}

	public String getAbrv_fixe_int() {
		return abrv_fixe_int;
	}

	public void setAbrv_fixe_int(String abrv_fixe_int) {
		this.abrv_fixe_int = abrv_fixe_int;
	}

	public String getCod_fond() {
		return cod_fond;
	}

	public void setCod_fond(String cod_fond) {
		this.cod_fond = cod_fond;
	}

	public String getAuto_fin() {
		return auto_fin;
	}

	public void setAuto_fin(String auto_fin) {
		this.auto_fin = auto_fin;
	}

	public String getEndettement1() {
		return endettement1;
	}

	public void setEndettement1(String endettement1) {
		this.endettement1 = endettement1;
	}

	public Long getEnd_taux1() {
		return end_taux1;
	}

	public void setEnd_taux1(Long end_taux1) {
		this.end_taux1 = end_taux1;
	}

	public String getEndettement2() {
		return endettement2;
	}

	public void setEndettement2(String endettement2) {
		this.endettement2 = endettement2;
	}

	public Long getEnd_taux2() {
		return end_taux2;
	}

	public void setEnd_taux2(Long end_taux2) {
		this.end_taux2 = end_taux2;
	}

	public String getPrt_log() {
		return prt_log;
	}

	public void setPrt_log(String prt_log) {
		this.prt_log = prt_log;
	}

	public Long getId_type_pret() {
		return id_type_pret;
	}

	public void setId_type_pret(Long id_type_pret) {
		this.id_type_pret = id_type_pret;
	}

}
