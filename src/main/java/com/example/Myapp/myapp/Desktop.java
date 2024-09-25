package com.example.Myapp.myapp;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer{


    public void Compile(){
        System.out.println("Complied with 404 bugs with faster");
    }



}
