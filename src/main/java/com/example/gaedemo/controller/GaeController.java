package com.example.gaedemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GaeController {

    @GetMapping("/dance")
    public String getDanceDetails(){
        return "Dance type is Kathakali";
    }

}
