package com.example.Myapp.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyappApplication {

	public static void main(String[] args) {
		/* This below code return the objects that run IOC container which is of type Application Context so we will create object and access the object present in IOC container*/
		ApplicationContext context=SpringApplication.run(MyappApplication.class, args);
        /* This is basically an example on dependency injection*/
		Dev obj=context.getBean(Dev.class);

		obj.Build();
	}

}
