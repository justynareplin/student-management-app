package com.example.Spring.Boot.Starts.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
              Student mariam;
            mariam = new Student(
                   "mariam",

                   LocalDate.of(2000, Month.AUGUST, 4),
                   "popo@gmail.com"
          );
            Student alex = new Student(
                    "alex",
                    LocalDate.of(1990, Month.APRIL, 11),
                    "kotek@gmail.com"
            );
            repository.saveAll(
                      List.of(mariam, alex)
              );
        };
    }
}
