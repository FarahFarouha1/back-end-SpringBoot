package com.farah.patients.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.farah.patients.entities.Service;


@RepositoryRestResource(path = "ser")
@CrossOrigin("http://localhost:4200/") 
public interface ServiceRepository extends JpaRepository<Service, Long>{

	
	
	
	
	
	
	
	
	
	
	
	
	
}
