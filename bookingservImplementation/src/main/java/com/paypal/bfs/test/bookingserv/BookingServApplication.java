package com.paypal.bfs.test.bookingserv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;

@SpringBootApplication
@EnableJpaRepositories("com.paypal.bfs.*")
@ComponentScan(basePackages = { "com.paypal.bfs.*" })
@EntityScan("com.paypal.bfs.*")
public class BookingServApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookingServApplication.class, args);

    }

    @Bean
    @ConfigurationProperties(prefix = "local.datasource")
    public DataSource getDataSource() {
        return DataSourceBuilder.create().build();
    }
}