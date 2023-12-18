package com.example.spring_product2.model.dao;

import com.example.spring_product2.model.entities.Producto;
import org.springframework.data.repository.CrudRepository;

public interface IProductoDAO extends CrudRepository<Producto, Long> {
}
