package com.example.pizzeria;
import com.example.pizzeria.model.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PizzeriaApplication {

	public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(PizzeriaApplication.class, args);
        Menu menu = ctx.getBean(Menu.class);

	}

}
