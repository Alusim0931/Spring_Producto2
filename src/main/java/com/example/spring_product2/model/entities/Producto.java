package com.example.spring_product2.model.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "kcal")
    private String kcal;

    @ManyToMany
    @JoinTable(
            name = "Menu_has_product",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "menu_id")
    )
    private List<Menu> menus;

}
