package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean
    public Product product1() {
        Product product = new Product();
        product.setId(1);
        product.setName("Product 1");
        product.setPrice(10.99);
        product.setDescription("Alo alo 1234");
        return product;
    }

    @Bean
    public Product product2() {
        Product product = new Product();
        product.setId(2);
        product.setName("Product 2");
        product.setPrice(5.99);
        product.setDescription("Another product");
        return product;
    }

    @Bean
    @Scope("prototype")
    public Product product3() {
        Product product = new Product();
        product.setId(3);
        product.setName("Product 3");
        product.setPrice(8.99);
        product.setDescription("Yet another product");
        return product;
    }
}
