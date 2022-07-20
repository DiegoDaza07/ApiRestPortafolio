package com.portfolio.portfolio.services;

import java.util.ArrayList;
import com.portfolio.portfolio.models.userModel;
import com.portfolio.portfolio.repositories.userRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userServices {
    @Autowired
    userRepositories userRepositories;

    public ArrayList<userModel> getUsers(){
        return (ArrayList<userModel>)userRepositories.findAll();
    }

    public userModel saveUsers(userModel user){
      return userRepositories.save(user);   
    }
    
}
