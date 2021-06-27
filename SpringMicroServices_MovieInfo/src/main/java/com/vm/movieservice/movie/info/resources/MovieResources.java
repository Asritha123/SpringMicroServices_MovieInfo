package com.vm.movieservice.movie.info.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vm.movieservice.movie.info.model.Movie;



/**
 * this microservice returns the movie details of each movie id provided to it
 * @author Admin
 *
 */
@RestController
@RequestMapping("/movies")
public class MovieResources {
	
	@RequestMapping("/{movieId}")
	public Movie getMovieInfo(@PathVariable("movieId") String movieId) {
		return new Movie(movieId, "moviename1");
	}

}