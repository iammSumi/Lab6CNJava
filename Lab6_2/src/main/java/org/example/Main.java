package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Product product1 = context.getBean("product1", Product.class);
        System.out.println(product1);

        Product product2 = context.getBean("product2", Product.class);
        System.out.println(product2);

        Product product3a = context.getBean("product3", Product.class);
        System.out.println(product3a);

        Product product3b = context.getBean("product3", Product.class);
        System.out.println(product3b);
    }
}