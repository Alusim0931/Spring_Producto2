package com.example.spring_product2.model.entity;

import jakarta.persistence.*;
import org.hibernate.engine.internal.ManagedTypeHelper;

@Entity
    @Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "email")
    private String email;

    @Column(name = "tlf")
    private Integer tlf;

    @Column(name = "idorder")
    private Long idorder;

    public void setId(Long id) {this.id=id; }
    public Long getId() {return id;}

    public void setName(String name) {this.name=name;}
    public String getName() {return name;}

    public void setLastname(String lastname) {this.lastname=lastname;}
    public String getLastname() {return lastname;}

    public void setEmail(String email) {this.email = email;}
    public String getEmail() {return email;}

    public void setTlf(Integer tlf) {this.tlf=tlf; }
    public Integer getTlf() {return tlf;}

    public void setIdorder(Long idorder) {this.idorder=idorder;}
    public Long getIdorder() {return idorder;}


}
