package com.example.spring_webapp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")
public class HelloAndProvinceController {
    @GetMapping(path = "/ciao/{provincia}")
    public User user(
            @PathVariable String provincia,
            @RequestParam String nome) {
        return new User(nome, provincia);
    }
}