package com.example.Spring.Boot.Starts.Parents;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path= "api/v1/parent")
public class ParentController {
    private ParentService parentservice;

    @Autowired
    public ParentController(ParentService parentservice) {
        this.parentservice = parentservice;
    }
    @GetMapping
    public List<Parent> getParents(){
        return parentservice.getParents();
    }
}
