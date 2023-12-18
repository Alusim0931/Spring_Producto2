package com.example.spring_product2.model.services;

import com.example.spring_product2.model.entities.Usuario;

import java.util.List;
public interface IUsuarioService {
    public List<Usuario> findAll();

    public void save(Usuario usuario);

    public Usuario findById(Long id);

    public void delete(Usuario usuario);
}
