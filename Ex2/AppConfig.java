package com.example.cau2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean
    @Scope("prototype")
    public Product firstProduct() {
        Product p = new Product();
        p.setId("P01");
        p.setName("Fridge");
        p.setDescription("Cool");
        return p;
    }

    @Bean
    @Scope("prototype")
    public Product secondProduct() {
        return new Product("P02", "Air conditioner", "2nd generation");
    }

    @Bean
    public Product thirdProduct() {
        return new Product("P03", "Fan MU", "inside the cave");
    }
}
