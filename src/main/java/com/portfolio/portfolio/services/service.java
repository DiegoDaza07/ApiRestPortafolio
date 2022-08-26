package com.portfolio.portfolio.services;

import java.util.ArrayList;
import java.util.Optional;

import com.portfolio.portfolio.models.*;
import com.portfolio.portfolio.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class service {
    @Autowired
    userRepository userRepository;
    @Autowired
    experienceRepository experienceRepository;
    @Autowired
    educationRepository educationRepository;
    @Autowired
    projectRepository projectRepository;
    @Autowired
    skillRepository skillRepository;
   
 
    public ArrayList<userModel> getUsers(){ return (ArrayList<userModel>)userRepository.findAll();}
    public Optional<userModel> getUserId(Long id ) { return userRepository.findById(id); }
    public userModel saveUsers(userModel user){ return userRepository.save(user);  }

    public ArrayList<experienceModel> getExperience(){ return (ArrayList<experienceModel>)experienceRepository.findAll();}
    public Optional<experienceModel> getExperienceId(Long id) { return experienceRepository.findById(id);}
    public experienceModel saveExperience(experienceModel experience){return experienceRepository.save(experience);}
    public boolean deleteExperience(Long id){try{ experienceRepository.deleteById(id); return true;}catch(Exception err){return false;}}

    public ArrayList<educationModel> getEducation(){ return (ArrayList<educationModel>)educationRepository.findAll();}
    public Optional<educationModel> getEducationId(Long id){ return educationRepository.findById(id);}
    public educationModel saveEducation(educationModel education){return educationRepository.save(education);}
    public boolean deleteEducation(Long id){try{ educationRepository.deleteById(id); return true;}catch(Exception err){return false;}}

    public ArrayList<projectModel> getProject(){return (ArrayList<projectModel>)projectRepository.findAll();}
    public Optional<projectModel> getProjectId(Long id){ return projectRepository.findById(id);}
    public projectModel saveProject(projectModel project){return projectRepository.save(project);}
    public boolean deletePoject(Long id){try{ projectRepository.deleteById(id); return true;}catch(Exception err){return false;}}

    public ArrayList<skillModel> getSkill(){return (ArrayList<skillModel>)skillRepository.findAll();}
    public Optional<skillModel> getSkillId(Long id){ return skillRepository.findById(id);}
    public skillModel saveSkill(skillModel skill){return skillRepository.save(skill);}
    public boolean deleteSkill(Long id){try{ skillRepository.deleteById(id); return true;}catch(Exception err){return false;}}

    
}

