package com.example.pizzeria.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PizzeriaConfig {

    @Value("${coperto.costo}")
    private double costoCoperto;

    public double getCostoCoperto() {
        return costoCoperto;
    }
}
