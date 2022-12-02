package com.arabsoft.ajir.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "POINTER")
public class Pointer implements Serializable {

	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private PointagePK id;

	private String typ_point;
	@Column(insertable = false,updatable = false)
	private String cod_soc;	
	@Column(insertable = false,updatable = false)
	private String  mat_pers;	
	private Long n_carte;
	private Long num_point;
	private String type;
	private String num_pointeuse;
	private Long semaine;
	private String typ_reg;
	private String cod_reg;
	private Long h_reg;
	private Long m_reg;
	private String cod_m;

	private String typ_valid;
	private String cod_auto;
	private String cloture;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dat_sais_sys;
	private Long tot_ret;
	private Long ret_heur;
	private Long ret_min;
	private Long id_pointer;
	private String intermed;
	private Long s_point;
	private String old_typ_point;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dat_jour;
	private Long years_;
	private Long months_;
	private Long days_;
	private String serv_point;
	private Long duree_h;
	private Long duree_m;
	private String duree_tot;
	private Long temp_comp;
	public PointagePK getId() {
		return id;
	}
	public void setId(PointagePK id) {
		this.id = id;
	}
	public String getTyp_point() {
		return typ_point;
	}
	public void setTyp_point(String typ_point) {
		this.typ_point = typ_point;
	}
	public Long getN_carte() {
		return n_carte;
	}
	public void setN_carte(Long n_carte) {
		this.n_carte = n_carte;
	}
	public Long getNum_point() {
		return num_point;
	}
	public void setNum_point(Long num_point) {
		this.num_point = num_point;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getNum_pointeuse() {
		return num_pointeuse;
	}
	public void setNum_pointeuse(String num_pointeuse) {
		this.num_pointeuse = num_pointeuse;
	}
	public Long getSemaine() {
		return semaine;
	}
	public void setSemaine(Long semaine) {
		this.semaine = semaine;
	}
	public String getTyp_reg() {
		return typ_reg;
	}
	public void setTyp_reg(String typ_reg) {
		this.typ_reg = typ_reg;
	}
	public String getCod_reg() {
		return cod_reg;
	}
	public void setCod_reg(String cod_reg) {
		this.cod_reg = cod_reg;
	}
	public Long getH_reg() {
		return h_reg;
	}
	public void setH_reg(Long h_reg) {
		this.h_reg = h_reg;
	}
	public Long getM_reg() {
		return m_reg;
	}
	public void setM_reg(Long m_reg) {
		this.m_reg = m_reg;
	}
	public String getCod_m() {
		return cod_m;
	}
	public void setCod_m(String cod_m) {
		this.cod_m = cod_m;
	}
	public String getTyp_valid() {
		return typ_valid;
	}
	public void setTyp_valid(String typ_valid) {
		this.typ_valid = typ_valid;
	}
	public String getCod_auto() {
		return cod_auto;
	}
	public void setCod_auto(String cod_auto) {
		this.cod_auto = cod_auto;
	}
	public String getCloture() {
		return cloture;
	}
	public void setCloture(String cloture) {
		this.cloture = cloture;
	}
	public Date getDat_sais_sys() {
		return dat_sais_sys;
	}
	public void setDat_sais_sys(Date dat_sais_sys) {
		this.dat_sais_sys = dat_sais_sys;
	}
	public Long getTot_ret() {
		return tot_ret;
	}
	public void setTot_ret(Long tot_ret) {
		this.tot_ret = tot_ret;
	}
	public Long getRet_heur() {
		return ret_heur;
	}
	public void setRet_heur(Long ret_heur) {
		this.ret_heur = ret_heur;
	}
	public Long getRet_min() {
		return ret_min;
	}
	public void setRet_min(Long ret_min) {
		this.ret_min = ret_min;
	}
	public Long getId_pointer() {
		return id_pointer;
	}
	public void setId_pointer(Long id_pointer) {
		this.id_pointer = id_pointer;
	}
	public String getIntermed() {
		return intermed;
	}
	public void setIntermed(String intermed) {
		this.intermed = intermed;
	}
	public Long getS_point() {
		return s_point;
	}
	public void setS_point(Long s_point) {
		this.s_point = s_point;
	}
	public String getOld_typ_point() {
		return old_typ_point;
	}
	public void setOld_typ_point(String old_typ_point) {
		this.old_typ_point = old_typ_point;
	}
	public Date getDat_jour() {
		return dat_jour;
	}
	public void setDat_jour(Date dat_jour) {
		this.dat_jour = dat_jour;
	}
	public Long getYears() {
		return years_;
	}
	public void setYears(Long years) {
		this.years_ = years;
	}
	public Long getMonths_() {
		return months_;
	}
	public void setMonths_(Long months_) {
		this.months_ = months_;
	}
	public Long getDays_() {
		return days_;
	}
	public void setDays_(Long days_) {
		this.days_ = days_;
	}
	public String getServ_point() {
		return serv_point;
	}
	public void setServ_point(String serv_point) {
		this.serv_point = serv_point;
	}
	public Long getDuree_h() {
		return duree_h;
	}
	public void setDuree_h(Long duree_h) {
		this.duree_h = duree_h;
	}
	public Long getDuree_m() {
		return duree_m;
	}
	public void setDuree_m(Long duree_m) {
		this.duree_m = duree_m;
	}
	public String getDuree_tot() {
		return duree_tot;
	}
	public void setDuree_tot(String duree_tot) {
		this.duree_tot = duree_tot;
	}
	public Long getTemp_comp() {
		return temp_comp;
	}
	public void setTemp_comp(Long temp_comp) {
		this.temp_comp = temp_comp;
	}
	@Override
	public String toString() {
		return "Pointage [id=" + id + ", typ_point=" + typ_point + ", n_carte=" + n_carte + ", num_point=" + num_point
				+ ", type=" + type + ", num_pointeuse=" + num_pointeuse + ", semaine=" + semaine + ", typ_reg="
				+ typ_reg + ", cod_reg=" + cod_reg + ", h_reg=" + h_reg + ", m_reg=" + m_reg + ", cod_m=" + cod_m
				+ ", typ_valid=" + typ_valid + ", cod_auto=" + cod_auto + ", cloture=" + cloture + ", dat_sais_sys="
				+ dat_sais_sys + ", tot_ret=" + tot_ret + ", ret_heur=" + ret_heur + ", ret_min=" + ret_min
				+ ", id_pointer=" + id_pointer + ", intermed=" + intermed + ", s_point=" + s_point + ", old_typ_point="
				+ old_typ_point + ", dat_jour=" + dat_jour + ", years=" + years_ + ", months_=" + months_ + ", days_="
				+ days_ + ", serv_point=" + serv_point + ", duree_h=" + duree_h + ", duree_m=" + duree_m
				+ ", duree_tot=" + duree_tot + ", temp_comp=" + temp_comp + ", getId()=" + getId() + ", getTyp_point()="
				+ getTyp_point() + ", getN_carte()=" + getN_carte() + ", getNum_point()=" + getNum_point()
				+ ", getType()=" + getType() + ", getNum_pointeuse()=" + getNum_pointeuse() + ", getSemaine()="
				+ getSemaine() + ", getTyp_reg()=" + getTyp_reg() + ", getCod_reg()=" + getCod_reg() + ", getH_reg()="
				+ getH_reg() + ", getM_reg()=" + getM_reg() + ", getCod_m()=" + getCod_m() + ", getTyp_valid()="
				+ getTyp_valid() + ", getCod_auto()=" + getCod_auto() + ", getCloture()=" + getCloture()
				+ ", getDat_sais_sys()=" + getDat_sais_sys() + ", getTot_ret()=" + getTot_ret() + ", getRet_heur()="
				+ getRet_heur() + ", getRet_min()=" + getRet_min() + ", getId_pointer()=" + getId_pointer()
				+ ", getIntermed()=" + getIntermed() + ", getS_point()=" + getS_point() + ", getOld_typ_point()="
				+ getOld_typ_point() + ", getDat_jour()=" + getDat_jour() + ", getYears()=" + getYears()
				+ ", getMonths_()=" + getMonths_() + ", getDays_()=" + getDays_() + ", getServ_point()="
				+ getServ_point() + ", getDuree_h()=" + getDuree_h() + ", getDuree_m()=" + getDuree_m()
				+ ", getDuree_tot()=" + getDuree_tot() + ", getTemp_comp()=" + getTemp_comp() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public Pointer(PointagePK id, String typ_point, String cod_soc, String mat_pers, Long n_carte, Long num_point,
			String type, String num_pointeuse, Long semaine, String typ_reg, String cod_reg, Long h_reg, Long m_reg,
			String cod_m, String typ_valid, String cod_auto, String cloture, Date dat_sais_sys, Long tot_ret,
			Long ret_heur, Long ret_min, Long id_pointer, String intermed, Long s_point, String old_typ_point,
			Date dat_jour, Long years, Long months_, Long days_, String serv_point, Long duree_h, Long duree_m,
			String duree_tot, Long temp_comp) {
		super();
		this.id = id;
		this.typ_point = typ_point;
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.n_carte = n_carte;
		this.num_point = num_point;
		this.type = type;
		this.num_pointeuse = num_pointeuse;
		this.semaine = semaine;
		this.typ_reg = typ_reg;
		this.cod_reg = cod_reg;
		this.h_reg = h_reg;
		this.m_reg = m_reg;
		this.cod_m = cod_m;
		this.typ_valid = typ_valid;
		this.cod_auto = cod_auto;
		this.cloture = cloture;
		this.dat_sais_sys = dat_sais_sys;
		this.tot_ret = tot_ret;
		this.ret_heur = ret_heur;
		this.ret_min = ret_min;
		this.id_pointer = id_pointer;
		this.intermed = intermed;
		this.s_point = s_point;
		this.old_typ_point = old_typ_point;
		this.dat_jour = dat_jour;
		this.years_ = years;
		this.months_ = months_;
		this.days_ = days_;
		this.serv_point = serv_point;
		this.duree_h = duree_h;
		this.duree_m = duree_m;
		this.duree_tot = duree_tot;
		this.temp_comp = temp_comp;
	}
	public Pointer() {
		super();
	}
	
	

}
