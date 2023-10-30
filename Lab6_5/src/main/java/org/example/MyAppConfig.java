package org.example;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
@ComponentScan(basePackages = "org.example")

@Configuration
@PropertySources({
        @PropertySource("classpath:myapp.properties")
})
public class MyAppConfig {
}
