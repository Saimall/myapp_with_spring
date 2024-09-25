package com.example.Myapp.myapp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements  Computer{

    public void Compile(){
        System.out.println("Complieing with 404 bugs slower");
    }
}
