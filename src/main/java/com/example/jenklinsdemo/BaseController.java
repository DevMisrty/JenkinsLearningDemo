package com.example.jenklinsdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/hello/{name}")
    public String sayHelloName(@PathVariable String name){
        return "Hello " +name;
    }

    @GetMapping("/{name}")
    public String sayName(@PathVariable String name){
        return name;
    }
}
