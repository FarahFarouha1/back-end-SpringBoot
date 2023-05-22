package com.farah.patients.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomPass", types = { Patient.class })
public interface PatientProjection {
	
	public String getNomPatient();

}
