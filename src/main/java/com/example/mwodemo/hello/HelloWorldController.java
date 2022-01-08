package com.example.mwodemo.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {


    @GetMapping("/hello")
    public String hello() {
        return "Hello pipelines";
    }

    @GetMapping("/hello2")
    public String hello2() {
        return "Hello pipelines";
    }

}
