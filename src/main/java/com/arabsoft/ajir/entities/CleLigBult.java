package com.arabsoft.ajir.entities;

import java.io.Serializable;
import java.util.Date;



public class CleLigBult implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String cod_soc;
	private String mat_pers;
    private Integer num_soins;
	private Date dat_soins;
    public Integer num_lig;
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
	public Integer getNum_soins() {
		return num_soins;
	}
	public void setNum_soins(Integer num_soins) {
		this.num_soins = num_soins;
	}
	public Date getDat_soins() {
		return dat_soins;
	}
	public void setDat_soins(Date dat_soins) {
		this.dat_soins = dat_soins;
	}
	public Integer getNum_lig() {
		return num_lig;
	}
	public void setNum_lig(Integer num_lig) {
		this.num_lig = num_lig;
	}
	public CleLigBult(String cod_soc, String mat_pers, Integer num_soins, Date dat_soins, Integer num_lig) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.num_soins = num_soins;
		this.dat_soins = dat_soins;
		this.num_lig = num_lig;
	}
	public CleLigBult() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	
}
