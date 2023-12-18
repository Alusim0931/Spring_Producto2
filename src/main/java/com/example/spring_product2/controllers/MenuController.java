package com.example.spring_product2.controllers;

import com.example.spring_product2.model.entities.Menu;
import com.example.spring_product2.model.services.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/menus")
public class MenuController {

    @Autowired
    private IMenuService menuService;

    @GetMapping("/list")
    public String listMenus(Model model) {
        List<Menu> menus = menuService.findAll();
        model.addAttribute("menus", menus);
        return "list_menu";
    }

    @GetMapping("/showFormForAddMenu")
    public String showFormForAdd(Model model) {
        Menu menu = new Menu();
        model.addAttribute("menu", menu);
        return "form_menu";
    }

    @PostMapping("/save")
    public String saveMenu(@ModelAttribute("menu") Menu menu) {
        menuService.save(menu);
        return "redirect:/menus/list";
    }

    @GetMapping("/showFormForUpdateMenu")
    public String showFormForUpdate(@RequestParam("menuId") Long id, Model model) {
        Menu menu = menuService.findById(id);
        model.addAttribute("menu", menu);
        return "form_menu";
    }

    @GetMapping("/delete")
    public String deleteMenu(@RequestParam("menuId") Long id) {
        Menu menu = menuService.findById(id);
        menuService.delete(menu);
        return "redirect:/menus/list";
    }
}