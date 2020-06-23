package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.revature.services.MovieService;

/**
 * @Component is a type of Stereotype Annotation - Stereotype annotations are a category of 
 * annotations which indicate to Spring that the class annotated is a bean that it can manage.
 * @Component is the primary default stereotype annotation - more stereotype annotations are 
 * provided with Spring MVC (@Service, @Controller, @Repository)
 *
 */

public class AnnotationDrivenLauncher {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.revature");
		MovieService movieService = context.getBean(MovieService.class);
		System.out.println(movieService.getMovieById(1));
	}
}
