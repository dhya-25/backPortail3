package com.arabsoft.ajir.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name = "LIBRE_DEMANDE")
public class Libre_demandeBis {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqLibre")
    @SequenceGenerator(name = "seqLibre", sequenceName = "SEQ_LIBRE_DEMANDE", allocationSize = 1)
	@Column(name="ID_LIBRE_DEMANDE")
	private long idlibredemande;

	@Column(name="FILE_NAME")
	private String fileName;
	@Column(name="CONTENT_TYPE")
	private String contentType;
	@Column(name="PATH")
	private String path;
	@Lob
	@Column(name="FICHIER_JOINT",columnDefinition="BLOB")
	private byte[] fichierJoint;
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public byte[] getFichierJoint() {
		return fichierJoint;
	}
	public void setFichierJoint(byte[] fichierJoint) {
		this.fichierJoint = fichierJoint;
	}
	
	
}
