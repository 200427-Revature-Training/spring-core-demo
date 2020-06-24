package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.models.Actor;
import com.revature.models.Movie;

/**
 * ApplicationContext is known as the IoC container (or DI container).
 * It represents the top level context for Spring within our Java application.
 * In the Spring framework, Inversion of Control is accomplished through dependency
 * injection. (DI is the mechanism for accomplishing IoC).
 * 
 * ApplicationContext is built on a previous DI container called the "BeanFactory". The 
 * ApplicationContext applies additional functionality to the BeanFactory, for instance
 * 	1. Messaging service
 *  2. Tools for i18n (internationalization)
 *  3. Automatic BeanPostProcessor registration
 *  4. Automatic BeanFactoryPostProcessor registration
 * 
 * IoC - Inversion of Control
 * DI - Dependency Injection
 * 
 * Primary ways of configuring ApplicationContext
 * 1) XML configuration
 * 2) Configuration Class
 * 3) Annotation-Driven Configuration
 * 
 * By default singleton beans initialize eagerly and prototype initialize lazily.
 */
public class XMLLauncher {
	public static void main(String[] args) {
		// Create an instance of Spring's ApplicationContext
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		
		System.out.println("Application Context ready");
		
		Movie movie = (Movie) applicationContext.getBean(Movie.class);
		System.out.println(movie);
		
		Movie nextMovie = (Movie) applicationContext.getBean("groundhog-day");
		System.out.println(nextMovie);
		
		System.out.println(movie == nextMovie);
		
		Actor actor = applicationContext.getBean(Actor.class);
		System.out.println(actor);
	}	
}
