package com.example.spring_product2.model.entity;

import jakarta.persistence.*;

@Entity
    @Table(name = "User_has_product")
    public class User_has_product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "userid")
    private Long userid;

    @Column(name = "prodcutid")
    private Long productid;

    public void setProductid(Long productid) {this.productid = productid;}
    public Long getProductid() {return productid;}

    public void setUserid(Long userid) {this.userid = userid;}

    public Long getUserid() {return userid;}
}
