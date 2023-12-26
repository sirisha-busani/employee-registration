package com.snipe.insurancemonster.client.model;

import java.io.Serializable;

public class DocumentModel implements Serializable{

	private static final long serialVersionUID = 1L;
	
	String documentId;
	String documentName;
	String documentType;
	
	public String getDocumentId() {
		return documentId;
	}
	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}
	public String getDocumentName() {
		return documentName;
	}
	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}
	public String getDocumentType() {
		return documentType;
	}
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
	

}
