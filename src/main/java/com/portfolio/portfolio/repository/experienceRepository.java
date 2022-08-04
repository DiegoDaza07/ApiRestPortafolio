package com.portfolio.portfolio.repository;


import com.portfolio.portfolio.models.experienceModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface experienceRepository extends CrudRepository<experienceModel, Long>{


} 
