package com.example.pizzeria.config;
import com.example.pizzeria.model.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.Arrays;
import java.util.List;

@Configuration
public class BeansConfig {
    @Bean
    public Topping prosciutto() {
        return new Topping("Prosciutto", 1.50,80);
    }
    @Bean
    public Topping ananas() {
        return new Topping("Ananas", 1.00, 50);
    }
    @Bean
    public Topping salame() {
        return new Topping("Salame", 1.70,120);
    }
    @Bean
    public Pizza margherita() {
        return new Pizza("Margherita",List.of(),5.00,600);
    }
    @Bean
    public Pizza hawaiian() {
        return new Pizza("Hawaiian Pizza", Arrays.asList(prosciutto(),ananas()),5.00 + prosciutto().getPrice()+ananas().getPrice(),600+ prosciutto().getCalories()+ ananas().getCalories());
    }
    @Bean
    public Pizza diavola() {
        return new Pizza("Diavola", List.of(salame()),5.00+ salame().getPrice(),600+ salame().getCalories());
    }
    @Bean
    public Drink cocaCola() {
        return new Drink("Coca Cola", 2.50,140);
    }
    @Bean
    public Drink acqua(){
        return new Drink("Acqua Naturale", 1.00,0);
    }
    @Bean
    public Menu menu() {
        return new Menu(
                Arrays.asList(margherita(), hawaiian(),diavola()), Arrays.asList(cocaCola(),acqua())
        );
    }
}
