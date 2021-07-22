package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student vijay = new Student(
                    "Vijay Singh",
                    "vijay@gmail.com",
                    LocalDate.of(1995, Month.JANUARY, 1));
            Student ajay = new Student(
                    "Ajay Singh",
                    "ajay@gmail.com",
                    LocalDate.of(1993, Month.JANUARY, 1));

            repository.save(vijay);
            repository.save(ajay);
        };
    }
}
