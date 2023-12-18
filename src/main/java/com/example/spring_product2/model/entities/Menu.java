package com.example.spring_product2.model.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="menu")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "precio")
    private float precio;

    @ManyToMany
    @JoinTable(
            name = "Menu_has_product",
            joinColumns = @JoinColumn(name = "menu_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<Producto> productos;

    @ManyToMany
    @JoinTable(
            name = "Menu_has_pedidos",
            joinColumns = @JoinColumn(name = "menu_id"),
            inverseJoinColumns = @JoinColumn(name = "pedidos_id")
    )
    private List<Pedido> pedidos;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setPrecio(Float precio){
        this.precio = precio;
    }

    public float getPrecio(){
        return precio;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
