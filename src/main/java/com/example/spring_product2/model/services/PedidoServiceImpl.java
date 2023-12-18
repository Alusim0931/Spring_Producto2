package com.example.spring_product2.model.services;

import com.example.spring_product2.model.dao.IPedidoDAO;
import com.example.spring_product2.model.entities.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PedidoServiceImpl implements IPedidoService {

    @Autowired
    private IPedidoDAO pedidoDAO;

    @Override
    @Transactional(readOnly= true)
    public List<Pedido> findAll() {
        return (List<Pedido>) pedidoDAO.findAll();
    }

    @Override
    @Transactional
    public void save(Pedido pedido) {
        pedidoDAO.save(pedido);
    }

    @Override
    @Transactional
    public Pedido findById(Long id) {
        return pedidoDAO.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Pedido pedido) {
        pedidoDAO.delete(pedido);
    }
}
