package com.example.pizzeria;

import com.example.pizzeria.model.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class OrdineTest {

    @Test
    void testCalcoloTotaleOrdine() {
        Tavolo tavolo = new Tavolo(1, 4, true);
        Ordine ordine = new Ordine(1, tavolo, 2, 2.5);

        Pizza margherita = new Pizza("Margherita", List.of(), 5.0, 600);
        Drink cola = new Drink("Coca Cola", 2.5, 140);

        ordine.aggiungiElemento(margherita);
        ordine.aggiungiElemento(cola);

        double totaleAtteso = 5.0 + 2.5 + (2 * 2.5); // prodotti + coperti
        assertEquals(totaleAtteso, ordine.getTotale(), 0.001);
    }
}
