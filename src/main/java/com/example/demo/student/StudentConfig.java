package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner (StudentRepository repository) {
        return args -> {
            Student maxence = new Student(
                    "Maxence",
                    "maxence.allart@gmail.com",
                    LocalDate.of(1988, JULY, 5)
            );
            Student alex = new Student(
                    "Alex",
                    "alex.allart@gmail.com",
                    LocalDate.of(1986, MARCH, 21)
            );

            repository.saveAll(List.of(maxence,alex));
        };
    }
}
