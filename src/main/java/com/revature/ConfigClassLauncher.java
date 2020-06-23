package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.revature.config.ConfigurationClass;
import com.revature.models.Actor;
import com.revature.models.Movie;

/**
 * Another way to configure Spring is to provide Configuration classes.
 * 
 * Configuration classes are classes annotated with @Configuration and can define
 * a variety of configuration details for Spring.  Among these options we can define 
 * methods which can be used to create beans - these methods should be annotated with @Bean.
 * @author Mitch
 *
 */
public class ConfigClassLauncher {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
		Actor actor = context.getBean(Actor.class);
		System.out.println(actor);
		Movie movie = context.getBean(Movie.class);
		System.out.println(movie);
		System.out.println(actor == movie.getStarringActor());
	}
}
