package com.example.restfullServices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template="Hello, %s!";
    private static final AtomicLong counter=new AtomicLong();
@GetMapping("/greetings")
    public Greetings greetings(@RequestParam(value = "name",defaultValue = "world")String name){
        return new Greetings(counter.incrementAndGet(),String.format(template,name));
    }
}
