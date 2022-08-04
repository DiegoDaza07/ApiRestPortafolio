package com.portfolio.portfolio.repository;


import com.portfolio.portfolio.models.educationModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface educationRepository extends CrudRepository<educationModel, Long>{


} 
