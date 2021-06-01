package com.example.Spring.Boot.Starts.student;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;

@Component
public class StudentService {
    @GetMapping(path= "api/v1/student")
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Mariam",
                        21,
                        LocalDate.of(2000,02,22),
                        "ustyniak@gmail.com"
                )
        );
    }
}
