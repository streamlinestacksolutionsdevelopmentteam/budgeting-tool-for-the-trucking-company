package com.trucking.expense_traking.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/***
 * Configuration class to define CORS (Cross-Origin Resource Sharing) settings for the application.
 * This allows the frontend application to communicate with the backend API.
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    /***
     * Adds CORS mappings to allow requests from specified origins.
     *
     * @param registry CORS registry to customize CORS configuration.
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")  //*** Allow all endpoints ***
                .allowedOrigins("http://localhost:3000")  //*** Allow requests from this origin ***
                .allowedMethods("GET", "POST", "PUT", "DELETE")  //*** Allow these HTTP methods ***
                .allowedHeaders("*")  //*** Allow all headers ***
                .allowCredentials(true);  //*** Allow credentials such as cookies to be sent ***
    }
}
