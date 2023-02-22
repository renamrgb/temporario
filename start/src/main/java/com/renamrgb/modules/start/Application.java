package com.renamrgb.modules.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.renamrgb.modules"})
@EntityScan(basePackages = {"com.renamrgb.modules.model"})
@EnableJpaRepositories(basePackages = "com.renamrgb.modules")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
