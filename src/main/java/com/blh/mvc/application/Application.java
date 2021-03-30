package com.blh.mvc.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = { "com.blh.mvc.entity" })
@EnableJpaRepositories(basePackages = { "com.blh.mvc.repository" })
@ComponentScan(basePackages = {"com.blh.mvc.controller"})
public class Application {
      public static void main(String[] args) {
            SpringApplication.run(Application.class, args);
      }
}
