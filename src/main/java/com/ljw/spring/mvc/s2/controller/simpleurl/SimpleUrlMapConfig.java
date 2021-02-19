package com.ljw.spring.mvc.s2.controller.simpleurl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;

import java.util.Properties;

@Configuration
public class SimpleUrlMapConfig {

    @Bean
    public SimpleUrlHandlerMapping adapterAreaController() {

        SimpleUrlHandlerMapping simpleUrlHandlerMapping = new SimpleUrlHandlerMapping();

        Properties properties = new Properties();
        properties.put("area/index", "areaController");//SimpleUrlHandlerMapping

        simpleUrlHandlerMapping.setMappings(properties);

        return  simpleUrlHandlerMapping;

    }

}
