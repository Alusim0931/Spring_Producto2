package com.example.spring_product2.model.entity;

import jakarta.persistence.*;
@Entity
@Table(name = "order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name="numorder")
    private Integer numorder;

    @Column(name = "address")
    private String adress;

    public void setId(Long id) {this.id=id; }

    public Long getId() {return id; }

    public void setNumorder(Integer numorder) {this.numorder =  numorder;}

    public Integer getNumorder() {return numorder; }

    public void setAdress(String adress) {this.adress = adress; }

    public String getAdress() {return adress; }
}
