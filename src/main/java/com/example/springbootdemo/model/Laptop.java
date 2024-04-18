package com.example.springbootdemo.model;

import org.springframework.stereotype.Component;

@Component

public class Laptop implements Computer {

//    @Autowired
//    CPU cpu;


    public void compile(){


        System.out.println("Compiling in laptop");
    }
}
