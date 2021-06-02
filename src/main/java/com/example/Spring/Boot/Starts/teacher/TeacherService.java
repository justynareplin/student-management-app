package com.example.Spring.Boot.Starts.teacher;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherService {
    @GetMapping(path = "api/v1/teachers")
    public List<Teacher> getTeachers(){
        return List.of(
                new Teacher("Jan", "Kowalski", "dyrektor",55)
        );
    }

}
