package com.example.pizzeria;

import com.example.pizzeria.config.PizzeriaConfig;
import com.example.pizzeria.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PizzeriaRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(PizzeriaRunner.class);
    private final PizzeriaConfig config;
    private final Menu menu;

    public PizzeriaRunner(PizzeriaConfig config, Menu menu) {
        this.config = config;
        this.menu = menu;
    }

    @Override
    public void run(String... args) {
        logger.info("=== Benvenuti alla Pizzeria! ===");
        menu.printMenu();

        Tavolo tavolo1 = new Tavolo(5, 4, true);
        Ordine ordine1 = new Ordine(1, tavolo1, 2, config.getCostoCoperto());

        ordine1.aggiungiElemento(menu.getPizzas().get(0)); // ad es. Margherita
        ordine1.aggiungiElemento(menu.getDrinks().get(0)); // ad es. Cola

        logger.info("Nuovo ordine creato:\n{}", ordine1);
    }
}
