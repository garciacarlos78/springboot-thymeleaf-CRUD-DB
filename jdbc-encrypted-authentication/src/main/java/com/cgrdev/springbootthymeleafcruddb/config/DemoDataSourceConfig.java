package com.cgrdev.springbootthymeleafcruddb.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.sql.DataSource;

// Configure Spring Data JPA
@Configuration
@EnableJpaRepositories(basePackages = {"${spring.data.jpa.repository.packages}"})
public class DemoDataSourceConfig {

    // Configure application DataSource
    @Primary
    @Bean
    @ConfigurationProperties(prefix="spring.datasource")
    public DataSource appDataSource() {
        return DataSourceBuilder.create().build();
    }

    // Configure entity manager factory. Tells Spring Data JPA
    // which packages to scan for JPA entities.
    // Defined in application.properties
    @Bean
    @ConfigurationProperties(prefix="spring.data.jpa.entity")
    public LocalContainerEntityManagerFactoryBean entityManagerFactory (EntityManagerFactoryBuilder builder, DataSource appDataSource) {
        return builder.dataSource(appDataSource).build();
    }

    // Configure Data Source for Security
    @Bean
    @ConfigurationProperties(prefix="security.datasource")
    public DataSource securityDataSource() {
        return DataSourceBuilder.create().build();
    }
}
