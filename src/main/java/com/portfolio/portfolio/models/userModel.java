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
    private String aboutMe;
    private String name;
    private String address;
    private String mail;
    private Number documentNumber;
    private Number phone;


    public Long getId() { return id;}
    public void setId(Long id) {   this.id = id;   }
    
    public String getAboutMe() { return aboutMe; }
    public void setAboutMe(String aboutMe) { this.aboutMe = aboutMe;}


    public Number getPassword() {  return password; }
    public void setPassword(Number password) {    this.password =password ;}

    public String getName() { return name;}
    public void setName(String name) { this.name = name; }

    public String getAddress() {  return address; }
    public void setAddress(String address) {    this.address = address;}
    
    public String getMail() {  return mail; }
    public void setMail(String mail) {    this.mail = mail;}
    
    public Number getDocumentNumber() {  return documentNumber; }
    public void setDocumentNumber(Number documentNumber) {    this.documentNumber = documentNumber;}    

    public Number getPhone() {  return phone; }
    public void setPhone(Number phone) {    this.phone = phone;}    


}
