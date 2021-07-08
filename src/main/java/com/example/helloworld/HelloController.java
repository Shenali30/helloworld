package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String helloMessage(){
        //sample end point
        return "Hello World";
    }

    @GetMapping("/name")
    public String getName(){
        return "Anderson";
    }

    @GetMapping("/myhello")
    public String customHello(@RequestParam("name") String name){
        return "Hello " + name;

    }
}
