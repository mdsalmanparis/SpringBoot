package com.salman.springbootCourse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hey Salman! Your Spring Boot app is running perfectly in the cloud.";
    }

    @GetMapping("/oops")
    public String handleError() {
        return "Hey! The page you're looking for is not available on your site.";
    }
}
