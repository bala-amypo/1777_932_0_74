package com.example.demo.entity;

import jakarta.persistence.Entity;

@Entity
public class  StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private float cgpa;

    public void setEmail(String email){
        this.email=email;

    }
     public String getEmail(){
        return this.Email;
        
    }

    public void setName(String name){
        this.name=name;

    }
     public String getName(){
        return this.name;
        
    }
}