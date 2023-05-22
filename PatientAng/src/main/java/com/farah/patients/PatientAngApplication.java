package com.farah.patients;

import org.modelmapper.ModelMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.farah.patients.entities.Patient;
import com.farah.patients.entities.Service;
@SpringBootApplication
public class PatientAngApplication implements CommandLineRunner{
@Autowired
private RepositoryRestConfiguration repositoryRestConfiguration;



	public static void main(String[] args) {
		SpringApplication.run(PatientAngApplication.class, args);
	
	}



	@Override
	public void run(String... args) throws Exception {
		repositoryRestConfiguration.exposeIdsFor(Patient.class,Service.class);
		
	}

	@Bean
	public ModelMapper modelMapper()
	{
	return new ModelMapper();
	}

	
	
}
