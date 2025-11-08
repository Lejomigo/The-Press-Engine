package com.software.TPE;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class pruebaImpl {

    @GetMapping
    public String helloWorld(){
        return "";
    }
}
