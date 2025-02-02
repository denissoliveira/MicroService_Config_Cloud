package com.ms.rest_spring_boot.repositories;

import com.ms.rest_spring_boot.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface PersonRepository extends JpaRepository<Person, Long>{}
