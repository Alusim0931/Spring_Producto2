package com.example.spring_product2.model.entity;

import jakarta.persistence.*;

@Entity
    @Table(name = "Product")
    public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "kcal")
    private Integer kcal;

    @Column(name = "typeid")
    private Long typeid;


    public void setId(Long id) {this.id = id;}
    public Long getId() {return id;}

    public void setName(String name) {this.name=name;}
    public String getName() {return name;}

    public void setDescription(String name) {this.description=description;}
    public String getDescription() {return description;}

    public void setKcal(Integer kcal) {this.kcal=kcal;}
    public Integer getKcal() {return kcal;}

    public Long setTypeid(Long typeid) {this.typeid=typeid;}

    public Long getTypeid() {return typeid;}
}
