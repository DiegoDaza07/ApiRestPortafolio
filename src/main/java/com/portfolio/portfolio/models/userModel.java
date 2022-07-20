package com.portfolio.portfolio.models;

import javax.persistence.*;


@Entity
@Table(name = "user")
public class userModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    
    private Long id;
    private Number password;  
    private String name;
    private String adress;
    private String mail;
    private Number identification;
    private Number phone;


    public Long getId() { return id;}
    public void setId(Long id) {   this.id = id;   }

    public Number getPassword() {  return password; }
    public void setPassword(Number password) {    this.password =password ;}

    public String getName() { return name;}
    public void setName(String name) { this.name = name; }

    public String getAdress() {  return adress; }
    public void setAdress(String adress) {    this.adress = adress;}
    
    public String getMail() {  return mail; }
    public void setMail(String mail) {    this.mail = mail;}
    
    public Number getIdentification() {  return identification; }
    public void setIdentification(Number identification) {    this.identification = identification;}    

    public Number getPhone() {  return phone; }
    public void setPhone(Number phone) {    this.phone = phone;}    


}
