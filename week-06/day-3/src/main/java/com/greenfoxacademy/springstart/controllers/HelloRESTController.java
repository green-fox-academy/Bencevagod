package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

    AtomicLong a = new AtomicLong(1);

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam String name) {
        return new Greeting(a.getAndIncrement(), "Hello, " + name + "!");
    }
}
