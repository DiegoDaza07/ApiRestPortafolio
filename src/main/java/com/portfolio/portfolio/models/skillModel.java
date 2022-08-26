package com.portfolio.portfolio.models;
import javax.persistence.*;



@Entity
@Table(name = "skill")

public class skillModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    
    private Long id;
    private String name;
    private Number value;
    private String img;



    public Long getId() { return id;}
    public void setId(Long id) {   this.id = id;   }

    public String getName() { return name;}
    public void setName(String name) { this.name = name; }

    public Number getValue() {  return value; }
    public void setValue(Number value) {    this.value = value;}
    
    public String getImg() {  return img; }
    public void setImg(String img) {    this.img = img;}
 


}