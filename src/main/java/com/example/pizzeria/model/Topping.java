package com.example.pizzeria.model;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Topping {
    private String name;
    private double price;
    private int calories;
}
