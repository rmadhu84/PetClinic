package com.springframework.PetClinic.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.springframework.PetClinic.Model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {

}
