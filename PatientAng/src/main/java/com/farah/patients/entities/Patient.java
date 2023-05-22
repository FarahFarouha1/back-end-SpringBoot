package com.farah.patients.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Patient {
 @Id 
 @GeneratedValue(strategy = GenerationType.IDENTITY)

 private Long idPatient;
 private String nomPatient;
 private String prenomPatient;
 

 private Date datenaiss;
 @ManyToOne
 private Service service;
 
 
 public Service getService() {
	return service;
}
public void setService(Service service) {
	this.service = service;
}
public Patient() {
 super();
 }
public Patient( String nomPatient, String prenomPatient, Date datenaiss) {
	super();

	this.nomPatient = nomPatient;
	this.prenomPatient = prenomPatient;
	this.datenaiss = datenaiss;
}
public Long getIdPatient() {
	return idPatient;
}
public void setIdPatient(Long idPatient) {
	this.idPatient = idPatient;
}
public String getNomPatient() {
	return nomPatient;
}
public void setNomPatient(String nomPatient) {
	this.nomPatient = nomPatient;
}
public String getPrenomPatient() {
	return prenomPatient;
}
public void setPrenomPatient(String d) {
	this.prenomPatient = d;
}
public Date getDatenaiss() {
	return datenaiss;
}
public void setDatenaiss(Date datenaiss) {
	this.datenaiss = datenaiss;
}
@Override
public String toString() {
	return "Patient [idPatient=" + idPatient + ", nomPatient=" + nomPatient + ", prenomPatient=" + prenomPatient
			+ ", datenaiss=" + datenaiss + "]";
}}
