package com.example.pizzeria;

import com.example.pizzeria.model.Tavolo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TavoloTest {

    @Test
    void testCambioStatoTavolo() {
        Tavolo t = new Tavolo(3, 4, false);
        assertFalse(t.isOccupato());

        t.setOccupato(true);
        assertTrue(t.isOccupato());
    }
}
