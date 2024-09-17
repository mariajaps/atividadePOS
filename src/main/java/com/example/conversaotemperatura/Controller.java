package com.example.conversaotemperatura;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/celsiusParaFahrenheit")
    public double celsiusParaFahrenheit(@RequestParam("grau") double grau) {
        return (grau * 9 / 5) + 32;
    }

    @GetMapping("/fahrenheitParaCelsius")
    public double fahrenheitParaCelsius(@RequestParam("grau") double grau) {
        return (grau - 32) * 5 / 9;
    }
}