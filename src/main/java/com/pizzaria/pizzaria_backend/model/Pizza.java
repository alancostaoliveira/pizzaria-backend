package com.pizzaria.pizzaria_backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_pizzas")
@Getter @Setter
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome; // Ex: "Explosão de Pepperoni"
    private String imagemUrl; // Ex: "images/pizza_item_1.jpg"
    private Double precoAtual; // Ex: 55.99
    private Double precoAnterior; // Ex: 60.99 (o valor riscado no seu CSS)
    
    @Column(columnDefinition = "TEXT")
    private String descricao;
}