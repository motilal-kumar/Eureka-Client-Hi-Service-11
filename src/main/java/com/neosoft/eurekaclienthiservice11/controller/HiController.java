package com.neosoft.eurekaclienthiservice11.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class HiController {

    @GetMapping(value="/hi/{name}")
    public String sayHi(@PathVariable("name")  String name){
        String message = "Hi " +name+ ", How are you??";
        return message;
    }


}
