package com.portfolio.portfolio.models;
import javax.persistence.*;



@Entity
@Table(name = "education")

public class educationModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    
    private Long id;
    private String institution;
    private String education;
    private String degree;
    private String time;



    public Long getId() { return id;}
    public void setId(Long id) {   this.id = id;   }

    public String getInstitution() { return institution;}
    public void setInstitution(String institution) { this.institution = institution; }

    public String getEducation() {  return education; }
    public void setEducation(String education) {    this.education = education;}
    
    public String getDegree() {  return degree; }
    public void setDegree(String degree) {    this.degree = degree;}

    public String getTime() {return time;}
    public void setTime(String time) {this.time = time;}
 


}

