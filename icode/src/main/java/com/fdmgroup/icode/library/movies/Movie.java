package com.fdmgroup.icode.library.movies;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Movie {
	
	private Long movieId;
	private String title;
	private String director;
	private String description;
	private Genre genre;
	
	//violate SOLID
	private static Long nextId = 500000L;
	
	public Movie() {
		this.movieId = generateUniqueId();
		
	}
	

	public Movie(String title, String director, String description, Genre genre) {
		this();
		this.title = title;
		this.director = director;
		this.description = description;
		this.genre = genre;
	}



	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long id) {
		this.movieId = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	

	public Long generateUniqueId() {
		nextId +=2;
		return nextId;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}


	public Genre getGenre() {
		return this.genre;
	}


	@Override
	public String toString() {
		return "Movie [id=" + movieId + ", title=" + title + ", director=" + director + ", description=" + description
				+ ", getId()=" + getMovieId() + ", getTitle()=" + getTitle() + ", getDirector()=" + getDirector()
				+ ", getDescription()=" + getDescription() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	

}
