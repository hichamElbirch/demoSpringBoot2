package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectDemoApplication {

	public static void main(String[] args) {
	  SpringApplication.run(ProjectDemoApplication.class, args);
	}
//	    @Bean
//	    ApplicationRunner init(CarRepository repository) {
//			return args -> {
//
//	            Stream.of("Ferrari", "Jaguar", "Porsche", "Lamborghini", "Bugatti",
//
//	                      "AMC Gremlin", "Triumph Stag", "Ford Pinto", "Yugo GV").forEach(name -> {
//
//	                Car car = new Car();
//
//	                car.setName(name);
//
//	                repository.save(car);
//
//	            });
//
//	            repository.findAll().forEach(System.out::println);
//	    	
//	    };
//	    }
}
