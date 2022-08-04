package com.portfolio.portfolio.models;
import javax.persistence.*;



@Entity
@Table(name = "project")

public class projectModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    
    private Long id;
    private String name;
    private String about;
    private String link;



    public Long getId() { return id;}
    public void setId(Long id) {   this.id = id;   }

    public String getName() { return name;}
    public void setName(String name) { this.name = name; }

    public String getAbout() {  return about; }
    public void setAbout(String about) {    this.about = about;}
    
    public String getLink() {  return link; }
    public void setLink(String link) {    this.link = link;}
 


}