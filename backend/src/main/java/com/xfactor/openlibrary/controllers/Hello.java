package com.xfactor.openlibrary.controllers;

import java.util.HashMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class Hello {

    @GetMapping("/hello")
    public String hello(@RequestParam String name, @RequestParam float number, @RequestParam char ch, @RequestParam String all) {
        return "You just " + name + " full " + number +" "+ ch + all;
    }

    @GetMapping("/awe/{name1}/{number1}")    //directly give the variable value in path
    public String hola(@PathVariable String name1, @PathVariable float number1, @RequestParam String all1) {
        return "You are " + name1 + number1 + all1;
    }

    @GetMapping("/open/{name2}/{age}")      //directly pass the hash variable in the URL bar
    public HashMap<String, String> jam(@PathVariable String name2, @PathVariable int age){
        HashMap<String, String> readmap = new HashMap<>();
        readmap.put("name", name2);
        readmap.put("age", String.valueOf(age));
        return readmap;
    }

}
