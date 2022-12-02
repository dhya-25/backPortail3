package com.arabsoft.ajir.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;



@Entity
@Table(name = "RETARD_JOURNEE")
public class Retard implements Serializable {

	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private RetardPK id;
	
	
	@Column(insertable = false,updatable = false)
	private String cod_soc;	
	@Column(insertable = false,updatable = false)
	private String  mat_pers;	
	@Column(insertable = false,updatable = false)
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dat_point;
	@Column(insertable = false,updatable = false)
	private Long num_point;
	private Long h_point;
	private Long m_point;
	private Long h_reg;
	private Long m_reg;
	private String type;
	private Long duree_h;
	private Long duree_m;
	private String duree_tot;
	private Long semaine;
	private String cod_serv; 
	private String cod_reg; 
	private Date date_shift; 
	private String etat_retard; 
	private Date dat_sais; 
	private Long id_retard_journee;
	private Date h_entre; 
	private Date m_entre; 
	private String typ_sais; 
	private String typ_point; 
	private String transf; 
	private String cod_aut; 
	private Long dure_aut;
	private Long temp_comp;
	private String nat_comp;
	public RetardPK getId() {
		return id;
	}
	public void setId(RetardPK id) {
		this.id = id;
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
	public Date getDat_point() {
		return dat_point;
	}
	public void setDat_point(Date dat_point) {
		this.dat_point = dat_point;
	}
	public Long getNum_point() {
		return num_point;
	}
	public void setNum_point(Long num_point) {
		this.num_point = num_point;
	}
	public Long getH_point() {
		return h_point;
	}
	public void setH_point(Long h_point) {
		this.h_point = h_point;
	}
	public Long getM_point() {
		return m_point;
	}
	public void setM_point(Long m_point) {
		this.m_point = m_point;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
	public Long getSemaine() {
		return semaine;
	}
	public void setSemaine(Long semaine) {
		this.semaine = semaine;
	}
	public String getCod_serv() {
		return cod_serv;
	}
	public void setCod_serv(String cod_serv) {
		this.cod_serv = cod_serv;
	}
	public String getCod_reg() {
		return cod_reg;
	}
	public void setCod_reg(String cod_reg) {
		this.cod_reg = cod_reg;
	}
	public Date getDate_shift() {
		return date_shift;
	}
	public void setDate_shift(Date date_shift) {
		this.date_shift = date_shift;
	}
	public String getEtat_retard() {
		return etat_retard;
	}
	public void setEtat_retard(String etat_retard) {
		this.etat_retard = etat_retard;
	}
	public Date getDat_sais() {
		return dat_sais;
	}
	public void setDat_sais(Date dat_sais) {
		this.dat_sais = dat_sais;
	}
	public Long getId_retard_journee() {
		return id_retard_journee;
	}
	public void setId_retard_journee(Long id_retard_journee) {
		this.id_retard_journee = id_retard_journee;
	}
	public Date getH_entre() {
		return h_entre;
	}
	public void setH_entre(Date h_entre) {
		this.h_entre = h_entre;
	}
	public Date getM_entre() {
		return m_entre;
	}
	public void setM_entre(Date m_entre) {
		this.m_entre = m_entre;
	}
	public String getTyp_sais() {
		return typ_sais;
	}
	public void setTyp_sais(String typ_sais) {
		this.typ_sais = typ_sais;
	}
	public String getTyp_point() {
		return typ_point;
	}
	public void setTyp_point(String typ_point) {
		this.typ_point = typ_point;
	}
	public String getTransf() {
		return transf;
	}
	public void setTransf(String transf) {
		this.transf = transf;
	}
	public String getCod_aut() {
		return cod_aut;
	}
	public void setCod_aut(String cod_aut) {
		this.cod_aut = cod_aut;
	}
	public Long getDure_aut() {
		return dure_aut;
	}
	public void setDure_aut(Long dure_aut) {
		this.dure_aut = dure_aut;
	}
	public Long getTemp_comp() {
		return temp_comp;
	}
	public void setTemp_comp(Long temp_comp) {
		this.temp_comp = temp_comp;
	}
	public String getNat_comp() {
		return nat_comp;
	}
	public void setNat_comp(String nat_comp) {
		this.nat_comp = nat_comp;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Retard [id=" + id + ", cod_soc=" + cod_soc + ", mat_pers=" + mat_pers + ", dat_point=" + dat_point
				+ ", num_point=" + num_point + ", h_point=" + h_point + ", m_point=" + m_point + ", h_reg=" + h_reg
				+ ", m_reg=" + m_reg + ", type=" + type + ", duree_h=" + duree_h + ", duree_m=" + duree_m
				+ ", duree_tot=" + duree_tot + ", semaine=" + semaine + ", cod_serv=" + cod_serv + ", cod_reg="
				+ cod_reg + ", date_shift=" + date_shift + ", etat_retard=" + etat_retard + ", dat_sais=" + dat_sais
				+ ", id_retard_journee=" + id_retard_journee + ", h_entre=" + h_entre + ", m_entre=" + m_entre
				+ ", typ_sais=" + typ_sais + ", typ_point=" + typ_point + ", transf=" + transf + ", cod_aut=" + cod_aut
				+ ", dure_aut=" + dure_aut + ", temp_comp=" + temp_comp + ", nat_comp=" + nat_comp + "]";
	}
	public Retard(RetardPK id, String cod_soc, String mat_pers, Date dat_point, Long num_point, Long h_point,
			Long m_point, Long h_reg, Long m_reg, String type, Long duree_h, Long duree_m, String duree_tot,
			Long semaine, String cod_serv, String cod_reg, Date date_shift, String etat_retard, Date dat_sais,
			Long id_retard_journee, Date h_entre, Date m_entre, String typ_sais, String typ_point, String transf,
			String cod_aut, Long dure_aut, Long temp_comp, String nat_comp) {
		super();
		this.id = id;
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.dat_point = dat_point;
		this.num_point = num_point;
		this.h_point = h_point;
		this.m_point = m_point;
		this.h_reg = h_reg;
		this.m_reg = m_reg;
		this.type = type;
		this.duree_h = duree_h;
		this.duree_m = duree_m;
		this.duree_tot = duree_tot;
		this.semaine = semaine;
		this.cod_serv = cod_serv;
		this.cod_reg = cod_reg;
		this.date_shift = date_shift;
		this.etat_retard = etat_retard;
		this.dat_sais = dat_sais;
		this.id_retard_journee = id_retard_journee;
		this.h_entre = h_entre;
		this.m_entre = m_entre;
		this.typ_sais = typ_sais;
		this.typ_point = typ_point;
		this.transf = transf;
		this.cod_aut = cod_aut;
		this.dure_aut = dure_aut;
		this.temp_comp = temp_comp;
		this.nat_comp = nat_comp;
	}
	public Retard() {
		super();
	}

	
	
}
