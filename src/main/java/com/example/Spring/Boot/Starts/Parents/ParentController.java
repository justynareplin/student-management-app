package com.example.Spring.Boot.Starts.Parents;

import com.example.Spring.Boot.Starts.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/parent")
public class ParentController {
    private final ParentService parentService;

    @Autowired
    public ParentController(ParentService parentService){ this.parentService =parentService;}
    @GetMapping
    public List<Parent> returnAll(){return parentService.allParents();}



}
