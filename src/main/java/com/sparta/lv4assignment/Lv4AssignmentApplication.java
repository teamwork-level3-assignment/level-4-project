package com.sparta.lv4assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Lv4AssignmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lv4AssignmentApplication.class, args);
    }

}
