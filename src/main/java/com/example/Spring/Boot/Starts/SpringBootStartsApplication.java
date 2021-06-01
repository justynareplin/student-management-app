package com.example.Spring.Boot.Starts;

import com.example.Spring.Boot.Starts.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
@RestController
public class SpringBootStartsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStartsApplication.class, args);
	}

}
