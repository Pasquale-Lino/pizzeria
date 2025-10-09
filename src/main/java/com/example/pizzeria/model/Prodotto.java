package com.example.pizzeria.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor // 👉 questo genera il costruttore vuoto
public abstract class Prodotto {
    private String nome;
    private double prezzo;
}

