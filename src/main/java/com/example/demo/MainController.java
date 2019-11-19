package com.example.demo;

import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileReader;

@RestController
public class MainController {
    private final MyService service;

    public MainController(MyService service) {
        this.service = service;
    }

    @GetMapping("/hello")
    public String hello(){
        return service.FileReader();
    }

}
