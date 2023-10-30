package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class TextEditor {
    @Autowired
    private TextWriter textWriter;
    private String text;
    public void setTextWriter(TextWriter textWriter) {
        this.textWriter = textWriter;
    }
    public void input(String fileName) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text to save in file '" + fileName + "':");
        text = scanner.nextLine();
        textWriter.write(fileName, text);
    }
    public void save(String fileName) {
        if (text != null) {
            textWriter.write(fileName, text);
        } else {
            System.out.println("No text to save.");
        }
    }
}
