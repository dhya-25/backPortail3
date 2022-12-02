package com.arabsoft.ajir.entities;

import java.io.Serializable;

import java.util.Date;



public class CleBultSoin implements Serializable {

	private static final long serialVersionUID = 1L;
	
	 
    public String cod_soc;
	 
    public String mat_pers;
	
    public Integer num_soins;
	
    public Date dat_soins;

	public CleBultSoin(String cod_soc, String mat_pers, Integer num_soins, Date dat_soins) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.num_soins = num_soins;
		this.dat_soins = dat_soins;
	}

	public CleBultSoin() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CleBultSoin {cod_soc=" + cod_soc + ", mat_pers=" + mat_pers + ", num_soins=" + num_soins
				+ ", dat_soins=" + dat_soins + "}";
	}
	
}