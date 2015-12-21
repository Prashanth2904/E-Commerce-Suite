package com.ecomsuite;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * The main application class which configures also some beans before initialization.
 * 
 * @author Prashanth
 */
@SpringBootApplication
public class EcomSuiteApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcomSuiteApplication.class, args);
    }
    
    @Bean
    @ConfigurationProperties(prefix="datasource.ecomsuite")
    public DataSource getDataSource() {
        return DataSourceBuilder.create().build();
    }
}
