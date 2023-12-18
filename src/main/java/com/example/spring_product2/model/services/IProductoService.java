package com.example.spring_product2.model.services;

import com.example.spring_product2.model.entities.Producto;

import java.util.List;

public interface IProductoService {
    public List<Producto> findAll();

    public void save(Producto producto);

    public Producto findById(Long id);

    public void delete(Producto producto);
}
