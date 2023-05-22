package com.farah.patients.dto;

import java.util.Date;



import com.farah.patients.entities.Service;

import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PatientDto {
	
	private Long idPatient;
	private String nomPatient;
	private String prenomPatient;
	private Date datenaiss;

	@ManyToOne
	private Service service;
	
    private String nomSer;
	

	
	
	
	
	
	
}
