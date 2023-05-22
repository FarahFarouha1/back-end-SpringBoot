package com.farah.patients.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.farah.patients.dto.PatientDto;
import com.farah.patients.entities.Patient;
import com.farah.patients.service.PatientService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class PatientRESTController {
	

		@Autowired
		PatientService patientService;
		
		@RequestMapping(method = RequestMethod.GET)
		public List<PatientDto> getAllPatients() {
		return patientService.getAllPatients();
		}
		
		
		@RequestMapping(value="/{id}",method = RequestMethod.GET)
		public PatientDto getPatientById(@PathVariable("id") Long id) {
		return patientService.getPatient(id);
		 }
		
		@RequestMapping(method = RequestMethod.POST)
		public PatientDto createPatient(@RequestBody PatientDto patientdto) {
		return patientService.savePatient(patientdto);
		}
		
		@RequestMapping(method = RequestMethod.PUT)
		public PatientDto updatePatient(@RequestBody PatientDto patientdto) {
		return patientService.updatePatient(patientdto);
		}
		
		
		@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
		public void deletePatient(@PathVariable("id") Long id)
		{
			patientService.deletePatientById(id);
		}


		
		@RequestMapping(value="/prodscat/{idser}",method = RequestMethod.GET)
		public List<Patient> getPatientsBySerId(@PathVariable("idSer") Long idSer)
		{
		return patientService.findByServiceIdSer(idSer);
		}
		
		
		
		
		@RequestMapping(value="/pasByName/{nom}",method = RequestMethod.GET)
		public List<Patient> findByNomPatientContains(@PathVariable("nom") String nom) {
		return   patientService.findByNomPatientContains(nom);
		}
		
		
		
		}

