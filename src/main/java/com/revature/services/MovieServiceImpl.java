package com.revature.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.revature.daos.MovieDao;
import com.revature.models.Movie;

@Component
public class MovieServiceImpl implements MovieService {
	@Autowired
	private MovieDao movieDao;
	
	public Movie getMovieById(int id) {
		return movieDao.getMovieById(id);
	}
}
