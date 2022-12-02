package com.arabsoft.ajir.entities;

import java.io.Serializable;
import java.util.Objects;

public class CleRembourserCession implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cod_soc;
	private String mat_pers;
	private Integer cod_pret;
	private String cod_typ_bul;

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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getCod_typ_bul() {
		return cod_typ_bul;
	}

	public void setCod_typ_bul(String cod_typ_bul) {
		this.cod_typ_bul = cod_typ_bul;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cod_soc, mat_pers, cod_pret, cod_typ_bul);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CleRembourserCession other = (CleRembourserCession) obj;
		return Objects.equals(cod_soc, other.cod_soc) && Objects.equals(mat_pers, other.mat_pers)
				&& Objects.equals(cod_pret, other.cod_pret) && Objects.equals(cod_typ_bul, other.cod_typ_bul);
	}

}