package com.portfolio.portfolio.repository;


import com.portfolio.portfolio.models.projectModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface porjectRepository extends CrudRepository<projectModel, Long>{


} 
