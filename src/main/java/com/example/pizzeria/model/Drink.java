package com.example.pizzeria.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Drink extends Prodotto {
    private int calories;

    public Drink(String nome, double prezzo, int calories) {
        super(nome, prezzo);
        this.calories = calories;
    }

    @Override
    public String toString(){
        return getNome() + "(" + calories + "kcal) - €" + getPrezzo();
    }
}
