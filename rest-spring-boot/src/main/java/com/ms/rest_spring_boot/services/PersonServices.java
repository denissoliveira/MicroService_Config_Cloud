package com.ms.rest_spring_boot.services;

import com.ms.rest_spring_boot.domain.Person;
import com.ms.rest_spring_boot.exceptions.ResourceNotFoundException;
import com.ms.rest_spring_boot.repositories.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class PersonServices {

	private PersonRepository personRepository;

	public PersonServices(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	private Logger logger = Logger.getLogger(PersonServices.class.getName());

	public List<Person> findAll() {
		logger.info("Finding all people!");
		return personRepository.findAll();
	}

	public Person findById(Long id) {
		logger.info("Finding one person!");
		return personRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));
	}
	
	public Person create(Person person) {
		logger.info("Creating one person!");
		return personRepository.save(person);
	}
	
	public Person update(Person person) {
		var personEntity = personRepository.findById(person.getId()).orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));
		logger.info("Updating one person!");
		personEntity.setFirstName(person.getFirstName());
		personEntity.setLastName(person.getLastName());
		personEntity.setAddress(person.getAddress());
		personEntity.setGender(person.getGender());
		return personRepository.save(person);
	}
	
	public void delete(Long id) {
		var personEntity = personRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));
		logger.info("Deleting one person!");
		personRepository.delete(personEntity);
	}
}
