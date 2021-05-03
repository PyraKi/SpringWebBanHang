package com.fit.se.webbanhang.entity;

import javax.persistence.*;

@Entity
@Table (name = "Glass")
public class Glass {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int gID;
    private String name;
    private String type;
    private float price;
    private String productDetails;
    private String urlImg;

    public Glass() {}

    public Glass(String name, String type, float price, String productDetails, String urlImg) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.productDetails = productDetails;
        this.urlImg = urlImg;
    }

    public int getGID() {
        return this.gID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getProductDetails() {
        return this.productDetails;
    }

    public void setProductDetails(String productDetails) {
        this.productDetails = productDetails;
    }

    public String getUrlImg() {
        return this.urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }

    @Override
    public String toString() {
        return "{" +
            " gID='" + getGID() + "'" +
            ", name='" + getName() + "'" +
            ", type='" + getType() + "'" +
            ", price='" + getPrice() + "'" +
            ", productDetails='" + getProductDetails() + "'" +
            ", urlImg='" + getUrlImg() + "'" +
            "}";
    }
 
}
