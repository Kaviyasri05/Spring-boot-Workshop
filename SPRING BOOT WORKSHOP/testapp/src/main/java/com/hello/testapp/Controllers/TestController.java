package com.hello.testapp.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class TestController {
    @GetMapping("/hello")
        public String helloworld(){
            return "Hello World !";
        }

    
}
