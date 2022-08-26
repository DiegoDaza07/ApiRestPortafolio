package com.portfolio.portfolio.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.portfolio.portfolio.models.*;
import com.portfolio.portfolio.services.service;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/user")

public class userControllers {
	
    @Autowired
    service services;

    @GetMapping()
    public ArrayList<userModel> getUser(){ return services.getUsers();}
    @GetMapping( path = "/{id}" )
    public Optional<userModel> getUserId(@PathVariable("id") Long id){ return this.services.getUserId(id);}
    @PostMapping()
    public userModel getusers(@RequestBody userModel user){ return this.services.saveUsers(user);}

    @GetMapping("/experience")
    public ArrayList<experienceModel> getExperience(){ return services.getExperience();}
    @GetMapping(path = "/experience/{id}")
    public Optional<experienceModel> getExperienceId(@PathVariable("id") Long id){ return  this.services.getExperienceId(id);}
    @PostMapping("/experience")
    public experienceModel postExperience(@RequestBody experienceModel experience){return this.services.saveExperience(experience);}
    @DeleteMapping("/experience/{id}")
    public String deleteByIdExperience(@PathVariable("id") Long id){
        boolean ok= this.services.deleteExperience(id);
        if(ok){ return "Delete successfully";}else{ return "dont delete successfully";} }

    @GetMapping("/education")
    public ArrayList<educationModel> getEducation(){return services.getEducation();}
    @GetMapping("/education/{id}")
    public Optional<educationModel> getEducationId(@PathVariable("id") Long id){return this.services.getEducationId(id);}
    @PostMapping("/education")
    public educationModel postEducation(@RequestBody educationModel education){return this.services.saveEducation(education);}
    @DeleteMapping("/education/{id}")
    public String deleteByIdEducation(@PathVariable("id") Long id){
        boolean ok= this.services.deleteEducation(id);
        if(ok){return "Delete Successfully";}else{ return "dont delete successfully";}}

    @GetMapping("/project")
    public ArrayList<projectModel> getProject() { return services.getProject();}
    @GetMapping("project/{id}")
    public Optional<projectModel> getProjectId(@PathVariable("id") Long id){ return this.services.getProjectId(id);}
    @PostMapping("project")
    public projectModel postProject(@RequestBody projectModel project){return this.services.saveProject(project);}
    @DeleteMapping("/project/{id}")
    public String deleteByIdProject(@PathVariable("id") Long id){
        boolean ok = this.services.deletePoject(id);
        if(ok){return "Delete Successfully";}else{ return "dont delete succesfully";}}

    @GetMapping("/skill")
    public ArrayList<skillModel> getSkill() { return services.getSkill();}
    @GetMapping("skill/{id}")
    public Optional<skillModel> getSkillId(@PathVariable("id") Long id){ return this.services.getSkillId(id);}
    @PostMapping("skill")
    public skillModel postSkill(@RequestBody skillModel skill){return this.services.saveSkill(skill);}
    @DeleteMapping("/skill/{id}")
    public String deleteByIdSkill(@PathVariable("id") Long id){
        boolean ok = this.services.deleteSkill(id);
        if(ok){return "Delete Successfully";}else{ return "dont delete succesfully";}}        
    
}

