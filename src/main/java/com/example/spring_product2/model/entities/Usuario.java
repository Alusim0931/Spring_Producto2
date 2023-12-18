package com.example.spring_product2.model.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuario_id")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "email")
    private String email;

    @Column(name = "telefono")
    private int telefono;

    @OneToMany(mappedBy="idUsuario")
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

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public String getApellido(){
        return apellido;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public void setTelefono(Integer telefono){
        this.telefono = telefono;
    }

    public int getTelefono(){
        return telefono;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}
