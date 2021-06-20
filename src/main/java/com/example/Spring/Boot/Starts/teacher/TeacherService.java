package com.example.Spring.Boot.Starts.teacher;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class TeacherService {
    @GetMapping(path="api/v1/student")
    public List<Teacher> getTeachers(){
        return List.of(new Teacher (1l, "Anna", "Nowak","matematyka"));
    }
}
