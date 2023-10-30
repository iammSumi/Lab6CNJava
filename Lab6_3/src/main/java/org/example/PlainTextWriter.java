package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class PlainTextWriter implements TextWriter{
    public void write(String fileName, String text) {
        try {
            if (text == null) {
                text = "";
            }
            FileWriter writer = new FileWriter(fileName + ".txt");
            writer.write(text);
            writer.close();
            System.out.println("Successfully saved file: " + fileName + ".txt");
        } catch (IOException e) {
            System.out.println("Error writing file: " + fileName + ".txt");
            e.printStackTrace();
        }
    }
}
