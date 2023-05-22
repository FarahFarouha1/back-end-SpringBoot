package com.farah.patients.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.farah.patients.repos.PatientRepository;
import com.farah.patients.dto.PatientDto;
import com.farah.patients.entities.Patient;

@Service
public class PatientServiceImpl implements PatientService  {

	@Autowired
	PatientRepository patientRepository;
	
	@Autowired
	ModelMapper modelMapper;

	
	@Override
	public PatientDto savePatient(PatientDto p) {
		 return convertEntityToDto( patientRepository.save(convertDtoToEntity(p)));
		}


	@Override
	public PatientDto updatePatient(PatientDto p) {
	 return convertEntityToDto(patientRepository.save(convertDtoToEntity(p)));
	}
	@Override
	public void deletePatient(Patient p) {
		patientRepository.delete(p);
		
	}

	@Override
	public void deletePatientById(Long id) {
		  patientRepository.deleteById(id);
		
	}

	@Override
	public PatientDto getPatient(Long id) {
		return convertEntityToDto(patientRepository.findById(id).get());
		
	}

	@Override
	public List<PatientDto> getAllPatients() {
		return patientRepository.findAll().stream()
				.map(this::convertEntityToDto)
				.collect(Collectors.toList());

	}

	@Override
	public List<Patient> findByNomPatient(String nom) {
		
		return patientRepository.findByNomPatient(nom);}

	@Override
	public List<Patient> findByNomPatientContains(String nom) {
		
		return patientRepository.findByNomPatientContains(nom);
	}

	@Override
	public List<Patient> findByNomPrenom(String nom, String Prenom) {
	
		return patientRepository.findByNomPrenom(nom, Prenom);
	}

	@Override
	public List<Patient> findByServiceIdSer(Long id) {
		
		return  patientRepository.findByServiceIdSer(id);
	}

	@Override
	public List<Patient> findByOrderByNomPatientAsc() {
		
		return patientRepository.findByOrderByNomPatientAsc();
	}

	@Override
	public List<Patient> trierPatientsNomsPrenom() {
	
		return  patientRepository.trierPatientsNomsPrenom() ;
	}

	@Override
	public PatientDto convertEntityToDto(Patient patient) {
	
	
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		PatientDto patientdto = modelMapper.map(patient, PatientDto.class);
		 return patientdto; 
	}


	@Override
	public Patient convertDtoToEntity(PatientDto patientDto) {
		
			 Patient patient = new  Patient();
			 patient = modelMapper.map(patientDto, Patient.class);
			 
			 patient.setIdPatient(patientDto.getIdPatient());
			 patient.setNomPatient(patientDto.getNomPatient());
			 patient.setPrenomPatient(patientDto.getPrenomPatient());
			 patient.setDatenaiss(patientDto.getDatenaiss());
			 patient.setService(patientDto.getService()); 
			  return patient;
			  }

}




















