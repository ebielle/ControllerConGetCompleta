package com.example.spring_webapp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")
public class HelloAndProvinceController {
    @GetMapping(path = "/ciao/{provincia}")
    public String ciao(
            @PathVariable String provincia,
            @RequestParam String nome) {
        return "Ciao " + nome + ", com'è il tempo in " + provincia + "?";
    }
}