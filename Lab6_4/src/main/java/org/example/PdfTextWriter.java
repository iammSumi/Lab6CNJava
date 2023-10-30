package org.example;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;

public class  PdfTextWriter implements TextWriter {

    public void write(String fileName, String text) {
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(fileName + ".pdf"));
            document.open();
            document.add(new Paragraph(text));
            document.close();
            System.out.println("Successfully saved file: " + fileName + ".pdf");
        } catch (Exception e) {
            System.out.println("Error writing file: " + fileName + ".pdf");
            e.printStackTrace();
        }
    }
}
