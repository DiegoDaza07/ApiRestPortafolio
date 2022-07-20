package com.portfolio.portfolio.repositories;

import com.portfolio.portfolio.models.userModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface userRepositories extends CrudRepository<userModel, Long>{
    
	
}
