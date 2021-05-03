package com.fit.se.webbanhang.entity;

import javax.persistence.*;

@Entity
@Table (name = "InvoiceDetails")
public class InvoiceDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int iID;
    private int bID;
    @OneToOne(fetch = FetchType.LAZY, cascade =  CascadeType.ALL)
    @JoinColumn(name = "Glass_gid", referencedColumnName = "gid")
    private Glass glass;
    private int quantity;

    public InvoiceDetails() { }

    public InvoiceDetails(Glass glass, int quantity) {
        this.glass = glass;
        this.quantity = quantity;
    }

    public int getBID() {
        return this.bID;
    }

    public void setBID(int bID) {
        this.bID = bID;
    }

    public Glass getGlass() {
        return this.glass;
    }

    public void setGlass(Glass glass) {
        this.glass = glass;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float unitPrice(){
        return this.glass.getPrice() * this.quantity;
    }

    @Override
    public String toString() {
        return "{" +
            " glass='" + getGlass() + "'" +
            ", quantity='" + getQuantity() + "'" +
            "}";
    }

}
