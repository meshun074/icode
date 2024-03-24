package com.fdmgroup.icode.library.movies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class MovieService {
	
	@Autowired
    private MovieRepository movieRepository;
	
	public MovieService(MovieRepository movieRepository) {
		super();
		this.movieRepository = movieRepository;
	}
	
	public List<Movie> findAll(){
		return movieRepository.findAll();
	}

    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }
    
	public Movie searchMovieById(Long id) {
        Movie movie = movieRepository.searchMovieById(id);
		return movie;
	}
	
    public Movie updateMovieDescription(Long id, String description) {
        return movieRepository.updateMovieDescription(id, description);
    }


    public List<Movie> searchMoviesByDirector(String director) {
        List<Movie> movies = movieRepository.searchByDirector(director);
        return movies;
    }

    public List<Movie> searchMoviesByTitle(String title) {
        List<Movie> movies = movieRepository.searchByTitle(title);
        return movies;
 
    }

    public List<Movie> searchMoviesByGenre(Genre genre) {
        List<Movie> movies = movieRepository.searchByGenre(genre);
        return movies;
    }

    public void deleteMovieById(Long movieId) {
        movieRepository.deleteMovieById(movieId);
    }





}
