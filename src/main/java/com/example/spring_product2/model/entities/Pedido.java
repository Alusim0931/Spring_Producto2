package com.example.spring_product2.model.entities;

import jakarta.persistence.*;

@Entity
@Table(name="pedido")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "numero_de_pedido")
    private String numeroPedido;

    @Column(name = "direccion")
    private String direcion;

    @ManyToOne
    @JoinColumn (name = "id")
    private Usuario idUsuario;


}
