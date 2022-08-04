package com.portfolio.portfolio.models;
import javax.persistence.*;



@Entity
@Table(name = "experience")
public class experienceModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    
    private Long id;
    private String company;
    private String position;
    private String manager;
    private String web;
    private String time;



    public Long getId() { return id;}
    public void setId(Long id) {   this.id = id;   }

    public String getCompany() { return company;}
    public void setCompany(String company) { this.company = company; }

    public String getPosition() {  return position; }
    public void setPosition(String position) {    this.position = position;}
    
    public String getManager() {  return manager; }
    public void setManager(String manager) {    this.manager = manager;}

    public String getWeb() { return web;}
    public void setWeb(String web) { this.web = web;}

    public String getTime() {return time;}
    public void setTime(String time) {this.time = time;}
 


}

    

