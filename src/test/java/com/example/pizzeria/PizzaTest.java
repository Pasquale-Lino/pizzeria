package com.example.pizzeria;

import com.example.pizzeria.model.Pizza;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class PizzaTest {

    @Test
    void testCreazionePizza() {
        Pizza margherita = new Pizza("Margherita", List.of(), 5.0, 600);

        assertEquals("Margherita", margherita.getNome());
        assertEquals(5.0, margherita.getPrezzo());
        assertEquals(600, margherita.getCalories());
        assertTrue(margherita.getToppings().isEmpty());
    }
}
