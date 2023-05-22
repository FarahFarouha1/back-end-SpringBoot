package com.farah.patients.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.farah.patients.entities.Patient;
import com.farah.patients.entities.Service;
@RepositoryRestResource(path = "rest")
public interface PatientRepository extends JpaRepository<Patient, Long> {

	
	
	
	
		List<Patient> findByNomPatient(String nom);
		 List<Patient> findByNomPatientContains(String nom);
		 
		 @Query("select p from Patient p where p.nomPatient like %?1 and p.prenomPatient like %?2")
		 List<Patient> findByNomPrenom(@Param("nom") String nom,@Param("prix") String prenom);
		 
//		 @Query("select p from Patient p where p.Service = ?1")
//		 List<Patient> findByService (Service service);
		 
		 List<Patient> findByServiceIdSer(Long id);
		 
		 @Query("select p from Patient p order by p.nomPatient  ASC, p.prenomPatient  DESC")
		 List<Patient> trierPatientsNomsPrenom();
		 List<Patient> findByOrderByNomPatientAsc();
		 
		}
	
	
	
	
