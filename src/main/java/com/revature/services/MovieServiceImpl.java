package com.revature.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.revature.daos.MovieDao;
import com.revature.models.Movie;


/**
 * Autowiring
 * 	* Field Autowiring - Easy to read, but not always flexible
 *  * Setter Autowiring - Autowire over a setter field
 *  * Constructor Autowiring - Autowire dependencies through constructors
 *  * Interface Autowiring - (Not available in Spring)
 *  
 * @author Mitch
 *
 */
@Component
public class MovieServiceImpl implements MovieService {
	@Autowired
	private MovieDao movieDao;
	
	public Movie getMovieById(int id) {
		return movieDao.getMovieById(id);
	}
	
//	@Autowired
	public void setMovieDao(MovieDao movieDao) {
		System.out.println("Autowiring by setter");
		this.movieDao = movieDao;
	}
	
//	@Autowired - Spring will autowire with the constructor automatically even if you don't use
	// @Autowired, and there is no other constructor to utilize to initialize the bean
	public MovieServiceImpl(MovieDao movieDao) {
		System.out.println("Autowiring using constructor");
		this.movieDao = movieDao;
	}
	
	public MovieServiceImpl() {
		
	}
	
}
