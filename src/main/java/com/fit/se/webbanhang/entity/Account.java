package com.fit.se.webbanhang.entity;

import javax.persistence.*;

@Entity
@Table (name = "Accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int uID;
    private String email;
    private String pass;
    private String role;


    public Account() { }

    public Account(String email, String pass, String role) {
        this.email = email;
        this.pass = pass;
        this.role = role;
    }
  
    public int getUID() {
        return this.uID;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return this.pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }  

    @Override
    public String toString() {
        return "{" +
            " email='" + getEmail() + "'" +
            ", pass='" + getPass() + "'" +
            ", role='" + getRole() + "'" +
            "}";
    }
}
