package com.example.Spring.Boot.Starts.Parents;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class ParentService {
    @GetMapping(path = "api/v2/parents")
        public List<Parent> getParents(){
        return List.of(new Parent(1, "Kamil", "Brzozowski", 33));
    }
}
