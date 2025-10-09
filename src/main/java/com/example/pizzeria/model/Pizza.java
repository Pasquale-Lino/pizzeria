package com.example.pizzeria.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pizza extends Prodotto {
    private List<Topping> toppings;
    private int calories;

    public Pizza(String nome, List<Topping> toppings, double prezzo, int calories) {
        super(nome, prezzo);
        this.toppings = toppings;
        this.calories = calories;
    }

    @Override
    public String toString() {
        return getNome() + "(" + calories + " kcal) - €" + getPrezzo();
    }
}
