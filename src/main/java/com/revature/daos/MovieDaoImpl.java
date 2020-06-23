package com.revature.daos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.revature.models.Movie;

@Component
public class MovieDaoImpl implements MovieDao {

	
	@Autowired
	Movie movie;
	
	@Override
	public Movie getMovieById(int id) {
		return movie;
	}

}
