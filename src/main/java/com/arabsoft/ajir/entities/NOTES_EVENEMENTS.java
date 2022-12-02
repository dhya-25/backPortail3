package com.arabsoft.ajir.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@Table(name="NOTES_EVENEMENTS")
public class NOTES_EVENEMENTS {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqEvent")
    @SequenceGenerator(name = "seqEvent", sequenceName = "SEQ_NOTES_EVENEMENTS", allocationSize = 1)
	private Long  id_evenement;    
	  private String libelle ; 
	  @JsonFormat( pattern = "dd/MM/yyyy")
	  private Date date_even ;  
	  @JsonFormat( pattern = "dd/MM/yyyy")
	  private Date date_expiration ;
	  @Lob
		@Column(columnDefinition="BLOB")

	   private byte[] fichier_joint  ;
	  private String typ_even ;
	  private String file_name ;
	  private String content_type ;
	  private String  path  ;        
	  private String typ_droit   ;
	public Long getId_evenement() {
		return id_evenement;
	}
	public void setId_evenement(Long id_evenement) {
		this.id_evenement = id_evenement;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Date getDate_even() {
		return date_even;
	}
	public void setDate_even(Date date_even) {
		this.date_even = date_even;
	}
	public Date getDate_expiration() {
		return date_expiration;
	}
	public void setDate_expiration(Date date_expiration) {
		this.date_expiration = date_expiration;
	}
	public byte[] getFichier_joint() {
		return fichier_joint;
	}
	public void setFichier_joint(byte[] fichier_joint) {
		this.fichier_joint = fichier_joint;
	}
	public String getTyp_even() {
		return typ_even;
	}
	public void setTyp_even(String typ_even) {
		this.typ_even = typ_even;
	}
	public String getFile_name() {
		return file_name;
	}
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	public String getContent_type() {
		return content_type;
	}
	public void setContent_type(String content_type) {
		this.content_type = content_type;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getTyp_droit() {
		return typ_droit;
	}
	public void setTyp_droit(String typ_droit) {
		this.typ_droit = typ_droit;
	}
	public NOTES_EVENEMENTS() {
		super();
	}
	public NOTES_EVENEMENTS(Long id_evenement, String libelle, Date date_even, Date date_expiration,
			byte[] fichier_joint, String typ_even, String file_name, String content_type, String path,
			String typ_droit) {
		super();
		this.id_evenement = id_evenement;
		this.libelle = libelle;
		this.date_even = date_even;
		this.date_expiration = date_expiration;
		this.fichier_joint = fichier_joint;
		this.typ_even = typ_even;
		this.file_name = file_name;
		this.content_type = content_type;
		this.path = path;
		this.typ_droit = typ_droit;
	}   
	  

}
