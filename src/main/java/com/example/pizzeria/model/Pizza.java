package com.example.pizzeria.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pizza {
    private String name;
    private List<Topping> toppings;
    private double price;
    private int calories;
    
    @Override
    public String toString() {
        return name + "("+ calories + " kcal) - €" + price;
    }
}
