package com.example.spring_product2.model.entities;

import jakarta.persistence.*;

import java.util.List;

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
    @JoinColumn (name = "usuario_id")
    private Usuario idUsuario;

    @ManyToMany
    @JoinTable(
            name = "Menu_has_pedidos",
            joinColumns = @JoinColumn(name = "pedidos_id"),
            inverseJoinColumns = @JoinColumn(name = "menu_id")
    )
    private List<Producto> menus;
}
