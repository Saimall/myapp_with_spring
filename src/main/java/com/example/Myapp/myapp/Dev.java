package com.example.Myapp.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired
    @Qualifier("desktop")
    Computer com;

    public void Build(){
       com.Compile();
        System.out.println("Heeloo I am Building some stuff!!");
    }
}
