package com.example.spring_product2.model.entity;
import jakarta.persistence.*;

@Entity
    @Table(name = "Menu_has_product")
    public class Menu_has_product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "prodcutid")
    private Long productid;

    @Column(name = "menuid")
    private Long menuid;

    public void setProductid(Long productid) {this.productid = productid;}
    public Long getProductid() {return productid;}

    public void setMenuid(Long menuid) {this.productid = menuid;}
    public Long getMenuid() {return menuid;}



}
