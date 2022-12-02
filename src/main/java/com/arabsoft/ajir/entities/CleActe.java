package com.arabsoft.ajir.entities;

import java.io.Serializable;

public class CleActe  implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	
	public Long type_act;
	
	public String abrv_act;

	public CleActe(Long type_act, String abrv_act) {
		super();
		this.type_act = type_act;
		this.abrv_act = abrv_act;
	}

	public CleActe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
