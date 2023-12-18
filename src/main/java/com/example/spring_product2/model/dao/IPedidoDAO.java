package com.example.spring_product2.model.dao;

import com.example.spring_product2.model.entities.Pedido;
import org.springframework.data.repository.CrudRepository;

public interface IPedidoDAO extends CrudRepository<Pedido, Long> {
}