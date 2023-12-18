package com.example.spring_product2.model.services;

import com.example.spring_product2.model.entities.Pedido;

import java.util.List;

public interface IPedidoService {
    public List<Pedido> findAll();

    public void save(Pedido pedido);

    public Pedido findById(Long id);

    public void delete(Pedido pedido);
}
