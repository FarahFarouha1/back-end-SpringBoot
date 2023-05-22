package com.farah.patients.entities;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

@Entity
public class Service {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private Long idSer;
private String nomSer;
private String descriptionSer;

@JsonIgnore
@OneToMany(mappedBy = "service")
private List<Patient> patients;

public Long getIdSer() {
	return idSer;
}
public String getNomSer() {
	return nomSer;
}
public String getDescriptionSer() {
	return descriptionSer;
}
public List<Patient> getPatients() {
	return patients;
}
public void setIdSer(Long idSer) {
	this.idSer = idSer;
}
public void setNomSer(String nomSer) {
	this.nomSer = nomSer;
}
public void setDescriptionSer(String descriptionSer) {
	this.descriptionSer = descriptionSer;
}
public void setPatients(List<Patient> patients) {
	this.patients = patients;
}
public Service(Long idSer, String nomSer, String descriptionSer, List<Patient> patients) {
	super();
	this.idSer = idSer;
	this.nomSer = nomSer;
	this.descriptionSer = descriptionSer;
	this.patients = patients;
}


}