package com.revature.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.revature.models.Actor;
import com.revature.models.Movie;

@Configuration
public class ConfigurationClass {
	
	@Bean()
	public Actor getActor() {
		System.out.println("Getting actor");
		return new Actor(1, "Bradd Pitt");
	}
	
	@Bean
	public Movie getMovie() {
		Movie movie =  new Movie(1, "Fight Club", "action/drama");
		
		// Spring replaces the direct call to getActor with a bean retrieval 
		movie.setStarringActor(getActor());
		return movie;
	}
	
}
