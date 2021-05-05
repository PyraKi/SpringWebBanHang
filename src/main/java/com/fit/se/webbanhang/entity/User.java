package com.fit.se.webbanhang.entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table (name = "Users")
public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO) 
    private int uID;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNum;
    private String address;
    private String urlAvatar;
    private String username;
    private String password;
    private String role;
    @OneToMany(targetEntity=Bill.class, mappedBy="bID", fetch=FetchType.EAGER)
    private List<Bill> bills;

    public User() {}

    public User(int uID, String firstName, String lastName, String email, String phoneNum, String address, String urlAvatar, String username, String password, String role, List<Bill> bills) {
        this.uID = uID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNum = phoneNum;
        this.address = address;
        this.urlAvatar = urlAvatar;
        this.username = username;
        this.password = password;
        this.role = role;
        this.bills = bills;
    }

    public int getUID() {
        return this.uID;
    }
    
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return this.phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setUID(int uID) {
        this.uID = uID;
    }

    public String getUsername() {
        return this.username;
    } 

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUrlAvatar() {
        return this.urlAvatar;
    }

    public void setUrlAvatar(String urlAvatar) {
        this.urlAvatar = urlAvatar;
    }

    public List<Bill> getBills() {
        return this.bills;
    }

    public void setBills(List<Bill> bills) {
        this.bills = bills;
    }
}
