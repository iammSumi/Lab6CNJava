package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyAppConfig.class);

        MyDatabase database = context.getBean(MyDatabase.class);

        System.out.println("Username: " + database.getUsername());
        System.out.println("Password: " + database.getPassword());

        context.close();
    }
}
