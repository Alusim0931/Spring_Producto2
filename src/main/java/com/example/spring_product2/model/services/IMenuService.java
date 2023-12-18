package com.example.spring_product2.model.services;

import com.example.spring_product2.model.entities.Menu;

import java.util.List;

public interface IMenuService {
    public List<Menu> findAll();

    public void save(Menu menu);

    public Menu findById(Long id);

    public void delete(Menu menu);
}
