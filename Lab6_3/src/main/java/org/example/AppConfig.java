package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public TextWriter textWriter() {
        return new PlainTextWriter();
    }

    @Bean
    public TextEditor textEditor() {
        TextEditor editor = new TextEditor();
        editor.setTextWriter(textWriter());
        return editor;
    }
}

