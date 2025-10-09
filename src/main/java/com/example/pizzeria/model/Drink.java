package com.example.pizzeria.model;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Drink {
    private String name;
    private double price;
    private int calories;
    @Override
    public String toString(){
        return name + "(" + calories + "kcal) - €" + price;
    }
}
