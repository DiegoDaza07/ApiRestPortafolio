package com.portfolio.portfolio.controllers;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.portfolio.portfolio.models.userModel;
import com.portfolio.portfolio.services.userServices;

@RestController
@RequestMapping("/users")


public class userControllers {
	
    @Autowired
    userServices userServices;

    @GetMapping()
    public ArrayList<userModel> getusers(){
        return userServices.getUsers();
    }

    @PostMapping()
    public userModel getusers(@RequestBody userModel user){
        return this.userServices.saveUsers(user);

    }

    
  
    
}
