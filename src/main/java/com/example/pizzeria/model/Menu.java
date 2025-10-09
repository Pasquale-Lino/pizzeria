package com.example.pizzeria.model;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Menu {
    private List<Pizza> pizzas;
    private List<Drink> drinks;

    public void printMenu() {
        System.out.println("*** MENU PIZZERIA ***");
        System.out.println("\n---- Pizze ----");
        pizzas.forEach(p-> System.out.println(p));
        System.out.println("\n---- Bevande ----");
        drinks.forEach(d -> System.out.println(d) );
    }
}
