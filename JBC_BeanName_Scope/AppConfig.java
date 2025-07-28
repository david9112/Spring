package org.example.config;

import org.example.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

//    @Bean(name={"desk","desktop","com"})
    @Bean
    @Scope(value = "prototype")
    public Desktop desktop(){
        return new Desktop();
    }
}
