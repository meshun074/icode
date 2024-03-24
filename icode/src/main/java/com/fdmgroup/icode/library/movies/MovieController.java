package com.fdmgroup.icode.library.movies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("/library/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @Autowired
    private MovieRepository movieRepo;

    public MovieController(MovieService movieService, MovieRepository movieRepo) {
        super();
        this.movieService = movieService;
        this.movieRepo = movieRepo;
    }



@GetMapping("/allMovies")
public String goToAllMovies(Model model) {
		List<Movie> allMovies = movieRepo.findAll();
		model.addAttribute("allMovies", allMovies);
		return "/library/movies/allMovies";
}
	
@GetMapping("/createMovieForm")
public String goToCreateMoviesForm(Model model) {
        model.addAttribute("movie", new Movie());
		return "/library/movies/createMovie";
}

@PostMapping("/createMovie")
public String postCreateMovie(Movie movie) {
    movieService.addMovie(movie);
    return "redirect:/library/movies/allMovies";
}

@GetMapping("/updateMovieDescriptionForm")
public String goToUpdateMovieDescriptionByIdForm() {
    return "/library/movies/updateMovieDescriptionById";
}

@GetMapping("/searchMovieDescription")
public String getMovieById(@RequestParam Long movieId, Model model) {
    Movie movie = movieService.searchMovieById(movieId);
    model.addAttribute("movie", movie);
    return "/library/movies/updateMovieDescriptionById";
}

    
@PostMapping("/{movieId}/updateMovieDescription")
public String postMethodName(@PathVariable Long movieId, @RequestParam String description, Model model) {
    Movie movie = movieService.searchMovieById(movieId);
    movieService.updateMovieDescription(movieId, description);
    model.addAttribute("movie", movie);
    return "redirect:/library/movies/allMovies";
}

@GetMapping("/searchMoviesByDirectorForm")
public String goToSearchMoviesByDirector() {
    return "/library/movies/searchMoviesByDirector";
}

@GetMapping("/searchMoviesByDirector")
public String getMoviesByDirector(@RequestParam String director, Model model) {
    List<Movie> movies = movieService.searchMoviesByDirector(director);

    if(movies.isEmpty()) {
        model.addAttribute("errorMessage", "No movies found for director: " + director);
    } else {
        model.addAttribute("movies", movies);
    }
    return "/library/movies/searchMoviesByDirector";
}

@GetMapping("/searchMoviesByTitleForm")
public String goToSearchMoviesByTitle() {
    return "/library/movies/searchMoviesByTitle";
}

@GetMapping("/searchMoviesByTitle")
public String getMoviesByTitle(@RequestParam String title, Model model) {
    List<Movie> movies = movieService.searchMoviesByTitle(title);
    if(movies.isEmpty()) {
        model.addAttribute("errorMessage", "No movies found for title: " + title);
    } else {
        model.addAttribute("movies", movies);
    }

    return "/library/movies/searchMoviesByTitle";
}

@GetMapping("/searchMoviesByGenreForm")
public String goToSearchMoviesByGenre() {
    return "/library/movies/searchMoviesByGenre";
}

@GetMapping("/searchMoviesByGenre")
public String getMoviesByGenre(@RequestParam Genre genre, Model model) {
    List<Movie> movies = movieService.searchMoviesByGenre(genre);
    if(movies.isEmpty()) {
        model.addAttribute("errorMessage", "No movies found for genre: " + genre);
    } else {
        model.addAttribute("movies", movies);
    }
    return "/library/movies/searchMoviesByGenre";
}

@GetMapping("/deleteMovieByIdForm")
public String showDeleteMovieByIdForm() {
    return "/library/movies/deleteMoviesById";
}

@PostMapping("/deleteMovieById")
public String deleteMovieById(@RequestParam("movieId") Long movieId, Model model) {
    Movie movie = movieService.searchMovieById(movieId);
    model.addAttribute("movie", movie);
    if(movie != null){
        movieService.deleteMovieById(movieId);
    } else {
        model.addAttribute("errorMessage", "Movie not found for ID: " + movieId);
    }
    return "redirect:/library/movies/allMovies";
}




}

