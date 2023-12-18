package com.example.spring_product2.model.dao;

import com.example.spring_product2.model.entities.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioDAO extends CrudRepository<Usuario, Long> {
}
