package com.example.Spring.Boot.Starts.Parents;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class ParentService {
    @GetMapping(path="api/v1/parent")
    public List<Parent> allParents(){
        return List.of(new Parent(1L, "grazyna", "lasko"));
    }

}
