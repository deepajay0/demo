package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/docker")
    public String getMessage(){
        return "first docker demo";
    }
    //changes in file
}
