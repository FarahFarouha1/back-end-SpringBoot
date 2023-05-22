package com.farah.patients.service;

import java.util.List;

import com.farah.patients.dto.PatientDto;
import com.farah.patients.entities.Patient;
import com.farah.patients.entities.Service;


public interface PatientService {

	
	
	
	
	
	PatientDto updatePatient(PatientDto p);
	PatientDto savePatient(PatientDto p);
	
	
	 PatientDto getPatient(Long id);
	 
	 
	 List<PatientDto> getAllPatients();
	 
	 

	void deletePatient(Patient p);
	 void deletePatientById(Long id);
	
	
	List<Patient> findByNomPatient(String nom);
	List<Patient> findByNomPatientContains(String nom);
	List<Patient> findByNomPrenom (String nom, String Prenom);
	//List<Patient> findByService (Service service );
	List<Patient> findByServiceIdSer(Long id);
	List<Patient> findByOrderByNomPatientAsc();
	List<Patient> trierPatientsNomsPrenom();
	///
	Patient convertDtoToEntity(PatientDto patientDto);
	
	PatientDto convertEntityToDto (Patient pateint);
}
