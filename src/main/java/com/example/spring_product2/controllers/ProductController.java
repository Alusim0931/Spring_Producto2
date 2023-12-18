package com.example.spring_product2.controllers;

import com.example.spring_product2.model.entities.Producto;
import com.example.spring_product2.model.services.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/productos")
public class ProductController {

    @Autowired
    private IProductoService productoService;

    @GetMapping("/list")
    public String listProductos(Model model) {
        List<Producto> productos = productoService.findAll();
        model.addAttribute("productos", productos);
        return "list_producto";
    }

    @GetMapping("/showFormForAddProducto")
    public String showFormForAdd(Model model) {
        Producto producto = new Producto();
        model.addAttribute("producto", producto);
        return "form_producto";
    }

    @PostMapping("/save")
    public String saveProducto(@ModelAttribute("producto") Producto producto) {
        productoService.save(producto);
        return "redirect:/productos/list";
    }

    @GetMapping("/showFormForUpdateProducto")
    public String showFormForUpdate(@RequestParam("productoId") Long id, Model model) {
        Producto producto = productoService.findById(id);
        model.addAttribute("producto", producto);
        return "form_producto";
    }

    @GetMapping("/delete")
    public String deleteProducto(@RequestParam("productoId") Long id) {
        Producto producto = productoService.findById(id);
        productoService.delete(producto);
        return "redirect:/productos/list";
    }
}