package com.portfolio.portfolio.repository;
import com.portfolio.portfolio.models.skillModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface skillRepository extends CrudRepository<skillModel, Long>{
    
}
