package com.vjreddy.lombok.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vjreddy.lombok.entity.House;

@SpringBootApplication
public class LombokDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LombokDemoApplication.class, args);
		House hObj=new House();
		hObj.setHHeight(10);
		
		System.out.println(hObj.getHHeight());
		System.out.println("Greetings");
	}

}
