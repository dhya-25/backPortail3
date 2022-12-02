package com.arabsoft.ajir.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;

public class Type_pretPK implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(insertable = false,updatable = false)
	private String cod_soc;
	@Column(insertable = false,updatable = false)
	private String cod_grp_pret;
	@Column(insertable = false,updatable = false)
	private String typ_pret;
	public Type_pretPK() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Type_pretPK(String cod_soc, String cod_grp_pret, String typ_pret) {
		super();
		this.cod_soc = cod_soc;
		this.cod_grp_pret = cod_grp_pret;
		this.typ_pret = typ_pret;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cod_grp_pret, cod_soc, typ_pret);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Type_pretPK other = (Type_pretPK) obj;
		return Objects.equals(cod_grp_pret, other.cod_grp_pret) && Objects.equals(cod_soc, other.cod_soc)
				&& Objects.equals(typ_pret, other.typ_pret);
	}

}
