package com.example.spring_product2.model.entity;

import jakarta.persistence.*;
 @Entity
    @Table(name="menu")
    public class Menu {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Long id;

        @Column(name = "name")
        private String name;

        @Column(name = "price")
        private float price;

        public void setId(Long id) {
            this.id = id;
        }

        public Long getId() {
            return id;
        }

        public void setName(String name){
            this.name = name;
        }

        public String getName(){
            return name;
        }

        public void setPrice(Float price){
            this.price = price;
        }

        public float getPrice(){
            return price;
        }
    }
