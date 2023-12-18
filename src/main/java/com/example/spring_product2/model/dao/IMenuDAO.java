package com.example.spring_product2.model.dao;

import com.example.spring_product2.model.entities.Menu;
import org.springframework.data.repository.CrudRepository;

public interface IMenuDAO extends CrudRepository<Menu, Long> {
}