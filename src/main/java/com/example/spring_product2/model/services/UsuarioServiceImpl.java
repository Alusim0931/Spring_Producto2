package com.example.spring_product2.model.services;

import com.example.spring_product2.model.dao.IUsuarioDAO;
import com.example.spring_product2.model.entities.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

    @Autowired
    private IUsuarioDAO usuarioDAO;

    @Override
    @Transactional(readOnly= true)
    public List<Usuario> findAll() {
        return (List<Usuario>) usuarioDAO.findAll();
    }

    @Override
    @Transactional
    public void save(Usuario usuario) {
        usuarioDAO.save(usuario);
    }

    @Override
    @Transactional
    public Usuario findById(Long id) {
        return usuarioDAO.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Usuario usuario) {
        usuarioDAO.delete(usuario);
    }

}
