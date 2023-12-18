package com.example.spring_product2.model.services;

import com.example.spring_product2.model.dao.IMenuDAO;
import com.example.spring_product2.model.entities.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MenuServiceImpl implements IMenuService{

    @Autowired
    private IMenuDAO menuDAO;

    @Override
    @Transactional(readOnly= true)
    public List<Menu> findAll() {
        return (List<Menu>) menuDAO.findAll();
    }

    @Override
    @Transactional
    public void save(Menu menu) {
        menuDAO.save(menu);
    }

    @Override
    @Transactional
    public Menu findById(Long id) {
        return menuDAO.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Menu menu) {
        menuDAO.delete(menu);
    }
}
