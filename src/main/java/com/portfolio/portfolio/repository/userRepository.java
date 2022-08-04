package com.portfolio.portfolio.repository;


import com.portfolio.portfolio.models.userModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepository extends CrudRepository<userModel, Long>{


} 
