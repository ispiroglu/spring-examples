package com.ispiroglu.spring.mvc.basicControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String printHelloWorld(){
        return "hello_world";
    }

}