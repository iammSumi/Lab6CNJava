package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        context.register(AppConfig.class);
//        context.refresh();
        TextEditor textEditor = context.getBean(TextEditor.class);
        textEditor.input("text1");
        textEditor.save("text2");

        TextWriter writer = new PdfTextWriter();
        String fileName = "myFile";
        String text = "Hello, world!";
        writer.write(fileName, text);


//        context.close();
    }
}
