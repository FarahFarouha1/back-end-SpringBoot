package com.farah.patients.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.farah.patients.entities.Service;
import com.farah.patients.repos.ServiceRepository;



@RestController
@RequestMapping("/api/ser")
@CrossOrigin("*")
public class ServiceRESTController {
	
	
	@Autowired
	ServiceRepository serviceRepository;
	@RequestMapping(method=RequestMethod.GET)
	public List<Service> getAllService()
	{
	return serviceRepository.findAll();
	}
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Service getServiceById(@PathVariable("id") Long id) {
	return serviceRepository.findById(id).get();
	}


}
