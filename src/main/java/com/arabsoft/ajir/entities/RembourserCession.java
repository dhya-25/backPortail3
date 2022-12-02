package com.arabsoft.ajir.entities;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;


@Entity
@IdClass(CleRembourserCession.class)
public class RembourserCession implements Serializable{
	
	

        /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		@Id
    	private String cod_soc;
        @Id
    	private String mat_pers;
        @Id
    	private Integer cod_pret;
        @Id
    	private String cod_typ_bul;
        
		public Long mnt_bul;   
		public Long id_rembourser_cession;  
		public String cod_user;
		
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
		public String getCod_typ_bul() {
			return cod_typ_bul;
		}
		public void setCod_typ_bul(String cod_typ_bul) {
			this.cod_typ_bul = cod_typ_bul;
		}
		public Long getMnt_bul() {
			return mnt_bul;
		}
		public void setMnt_bul(Long mnt_bul) {
			this.mnt_bul = mnt_bul;
		}
		public Long getId_rembourser_cession() {
			return id_rembourser_cession;
		}
		public void setId_rembourser_cession(Long id_rembourser_cession) {
			this.id_rembourser_cession = id_rembourser_cession;
		}
		public String getCod_user() {
			return cod_user;
		}
		public void setCod_user(String cod_user) {
			this.cod_user = cod_user;
		}
	
		public RembourserCession(String cod_soc, String mat_pers, Integer cod_pret, String cod_typ_bul, Long mnt_bul,
				Long id_rembourser_cession, String cod_user) {
			super();
			this.cod_soc = cod_soc;
			this.mat_pers = mat_pers;
			this.cod_pret = cod_pret;
			this.cod_typ_bul = cod_typ_bul;
			this.mnt_bul = mnt_bul;
			this.id_rembourser_cession = id_rembourser_cession;
			this.cod_user = cod_user;
		}
		public RembourserCession() {
			super();
			// TODO Auto-generated constructor stub
		}

	    

}
