package io.javabrains.springbootstater.courseapi.hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHi() {
        return "hello world";
    }
    
}
