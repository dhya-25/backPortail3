package com.arabsoft.ajir.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Absanteisme {

	

	private String DATE_HIST;
	private String lib_mot;
	
	private String lib_serv;
	private String sexe;
	@Id
	private Float d;
	
	/*private String cod_soc;

	private String mat_pers ;
	
private String valid;
private String cod_serv;
private String cod_m;
private String code_m;*/

			
	
	public Absanteisme() {
		super();
	}

	public String getDATE_HIST() {
		return DATE_HIST;
	}

	public void setDATE_HIST(String dATE_HIST) {
		DATE_HIST = dATE_HIST;
	}

	public String getLib_mot() {
		return lib_mot;
	}

	public void setLib_mot(String lib_mot) {
		this.lib_mot = lib_mot;
	}

	public String getLib_serv() {
		return lib_serv;
	}

	public void setLib_serv(String lib_serv) {
		this.lib_serv = lib_serv;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public Float getD() {
		return d;
	}

	public void setD(Float d) {
		this.d = d;
	}
	
	
	
	
}
