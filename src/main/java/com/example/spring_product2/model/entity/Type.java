package com.example.spring_product2.model.entity;

import jakarta.persistence.*;

@Entity
    @Table(name = "Type")
    public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name = "description")
    private String description;

    public void setId(Long id) {this.id = id;}
    public Long getId() {return id;}

    public void setName(String name) {this.name = name;}
    public String getName() {return name;}

    public void setDescription(String description) {this.description = description;}
    public String getDescription() {return description;}


}
