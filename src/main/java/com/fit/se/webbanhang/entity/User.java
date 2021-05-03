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
    @OneToOne(fetch = FetchType.LAZY, cascade =  CascadeType.ALL)
    @JoinColumn(name = "uid", referencedColumnName = "uid")
    private Account acc;
    @OneToMany(targetEntity=Bill.class, mappedBy="bID", fetch=FetchType.EAGER)
    private List<Bill> bills;

    public User() {}

    public User(String firstName, String lastName, String email, Account acc, String phoneNum, String address, String urlAvatar, List<Bill> bills) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.acc = acc;
        this.phoneNum = phoneNum;
        this.address = address;
        this.urlAvatar = urlAvatar;
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

    public Account getAcc() {
        return this.acc;
    }

    public void setAcc(Account acc) {
        this.acc = acc;
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

    @Override
    public String toString() {
        return "{" +
            " uID='" + getUID() + "'" +
            ", firstName='" + getFirstName() + "'" +
            ", lastName='" + getLastName() + "'" +
            ", email='" + getEmail() + "'" +
            ", acc='" + getAcc() + "'" +
            ", phoneNum='" + getPhoneNum() + "'" +
            ", address='" + getAddress() + "'" +
            ", urlAvatar='" + getUrlAvatar() + "'" +
            ", bills='" + getBills() + "'" +
            "}";
    }    
}
