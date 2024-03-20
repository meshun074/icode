package com.fdmgroup.icode.library.data;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fdmgroup.icode.library.books.Book;
import com.fdmgroup.icode.library.donation.Donation;
import com.fdmgroup.icode.library.event.Event;
import com.fdmgroup.icode.library.locations.Location;
import com.fdmgroup.icode.library.movies.Genre;
import com.fdmgroup.icode.library.movies.Movie;
import com.fdmgroup.icode.library.music.Album;
import com.fdmgroup.icode.library.music.Music;
import com.fdmgroup.icode.library.music.Record;
import com.fdmgroup.icode.library.user.User;


@Configuration
public class Config {

	
	
	@Bean("allBooksList")
	public List<Book> setStarterBooks(){
		Book Book1 = new Book("I Love Java","Me","All about Java");
		Book Book2 = new Book("I Love Python", "You", "Let's learn about Python");
		Book Book3 = new Book("Spring In Action", "A person", "Wow all about Spring");
		Book Book4 = new Book("C#", "A genius", "The language of the stars");
		Book Book5 = new Book("Angular", "A maniac", "For people that like nesting folders");
		List<Book> starterBooks = new ArrayList<>(Arrays.asList(Book1, Book2, Book3, Book4, Book5));
		return starterBooks;
	}

	@Bean("starterDonationPrograms")
	public List<String> getStarterDonationPrograms(){
		List<String> ProgramsWithDonationNeeds = new ArrayList<>(Arrays.asList("General", "Story Time", "Computer Literacy", "Community Garden",
		 "After School Programs", "Summer Reading Program", "Adult Literacy", "Job Search Assistance", "ESL Classes", "Homework Help", "GED Education"));
		return ProgramsWithDonationNeeds;
	}
	
	@Bean("starterDonationList")
	public List<Donation> getStarterDonations(){
		List<String> ProgramsWithDonationNeeds = new ArrayList<>(Arrays.asList("General", "Story Time", "Computer Literacy", "Community Garden",
		 "After School Programs", "Summer Reading Program", "Adult Literacy", "Job Search Assistance", "ESL Classes", "Homework Help", "GED Education"));

		Donation Donatio1 = new Donation("Dorothy and Lewis B. Cullman", 200000000L,  ProgramsWithDonationNeeds.get(0));
		Donation Donation2 = new Donation("Celeste Bartos",10000000L, ProgramsWithDonationNeeds.get(1));
		Donation Donation3 = new Donation("Brooke Astor",5000000L, ProgramsWithDonationNeeds.get(2));
		Donation Donation4 = new Donation("Stephen A. Schwarzman",3000000L, ProgramsWithDonationNeeds.get(3));
		Donation Donation5 = new Donation("Richard Gilder",2000000L, ProgramsWithDonationNeeds.get(4));
		
		List<Donation> starterDonations = new ArrayList<>(Arrays.asList(Donatio1, Donation2, Donation3, Donation4, Donation5));
		return starterDonations;
	}
	
	
	@Bean("starterMoviesList")
	public List<Movie> getStarterMovies(){
	
		
	    Movie Movie1 = new Movie("Starlight Adventures", "John Smith", "A thrilling space odyssey to save the galaxy from an alien invasion", Genre.SCI_FI );
	    Movie Movie2 = new Movie("Secrets of the Enchanted Forest", "Emily Johnson", "A magical journey through a mystical forest uncovering ancient secrets", Genre.FANTASY);
	    Movie Movie3 = new Movie("The Time Traveler's Dilemma", "Michael Anderson", "A scientist's quest to fix time paradoxes and save the future", Genre.SCI_FI);
	    Movie Movie4 = new Movie("Lost in Wonderland", "Sarah Roberts", "Alice's modern-day adventure in a whimsical world filled with surprises", Genre.FANTASY);
	    Movie Movie5 = new Movie("The Mystery of Midnight Manor", "David Thompson", "A detective investigates eerie occurrences at an old haunted mansion", Genre.MYSTERY);
	    
	    List<Movie> starterMovies = new ArrayList<>(Arrays.asList(Movie1, Movie2, Movie3, Movie4, Movie5));
	    return starterMovies;
	}

	
	@Bean("starterEventsList")
	public List<Event> getStarterEvents(){
		List<Double> eventCosts = new ArrayList<>(Arrays.asList(0.00, 5.00, 10.00, 15.00, 50.00));
		List<Integer> eventCapacities = new ArrayList<>(Arrays.asList(15, 25, 50, 100, 150));
		Event event1 = new Event("Dracula Book Club", "Atlanta, GA", "Join us for a lively discussion on Dracula", eventCosts.get(0), eventCapacities.get(0));
		Event event2 = new Event("The Women Author talk", "Zoom", "Join us for a virtual meet and greet with the author", eventCosts.get(1), eventCapacities.get(4));
		Event event3 = new Event("Children's story time", "Washington DC", "Join us for a children's story time reading of If You Give A Mouse A Cookie", eventCosts.get(2), eventCapacities.get(2));
		Event event4 = new Event("Library Book Sale", "New York, NY", "Bring your old books and trade them for new treasures", eventCosts.get(0), eventCapacities.get(4));
		Event event5 = new Event("Oragami Workshop", "virtual", "Join us while we form 1000 cranes", eventCosts.get(3), eventCapacities.get(2));
		
		List<Event> starterEvents = new ArrayList<>(Arrays.asList(event1, event2, event3, event4, event5));
		return starterEvents;	
	}
	
	@Bean("starterLocationsList")
	public List<Location> getStarterLocations(){
		Location location1 = new Location("Harmony Library", "23 Main Street, Cityville, ABC", "555-123-4567");
		Location location2 = new Location("Riverside Library", "456 Elm Ave, Townsville, XYZ", "555-987-6543");
		Location location3 = new Location("Oakwood Library", "789 Oak Lane, Villagetown, LMN", "555-567-8901");
		Location location4 = new Location("Sunset Library", "321 Sunset Boulevard, Beach City, DEF", "555-234-5678");
		Location location5 = new Location("Maple Library", "654 Maple Street, Forestville, GHI", "555-234-5678");
		List<Location> starterLocations = new ArrayList<>(Arrays.asList(location1, location2, location3, location4, location5));
		return starterLocations;	
	}
	
	@Bean("starterMusicList")
	public List<Music> getStarterMusic(){
		Music album1 = new Album("Sunset Serenade", "Melody Masters", "Pop", "A soothing collection of melodic tunes perfect for unwinding after a long day");
		Music album2 = new Album("Electric Dreams", "Synthwave Sensation", "Electronic", "Dive into a futuristic world with pulsating beats and retro-futuristic sounds");
		Music album3 = new Album("Midnight Jazz", "Smooth Groove Quartet", "Jazz", "Experience the essence of jazz under the moonlight with soulful melodies and captivating rhythms");
		Music album4 = new Album("Wildfire Rhythms", "Beat Blaze Band", "Rock", "Feel the heat of energetic rock anthems that ignite the spirit and set the stage on fire");
		Music album5 = new Album("Ocean Whispers", "Seaside Symphony", "Ambient", "Immerse yourself in tranquil sounds inspired by the ocean's gentle whispers and calming waves");

		Music album6 = new Record("Sunset Serenade", "Melody Masters", "Pop", "A soothing collection of melodic tunes perfect for unwinding after a long day");
		Music album7 = new Record("Electric Dreams", "Synthwave Sensation", "Electronic", "Dive into a futuristic world with pulsating beats and retro-futuristic sounds");
		Music album8 = new Record("Midnight Jazz", "Smooth Groove Quartet", "Jazz", "Experience the essence of jazz under the moonlight with soulful melodies and captivating rhythms");
		Music album9 = new Record("Wildfire Rhythms", "Beat Blaze Band", "Rock", "Feel the heat of energetic rock anthems that ignite the spirit and set the stage on fire");
		Music album10 = new Record("Ocean Whispers", "Seaside Symphony", "Ambient", "Immerse yourself in tranquil sounds inspired by the ocean's gentle whispers and calming waves");

		List<Music> starterMusicList = new ArrayList<>(Arrays.asList(album1, album2, album3, album4, album5, album6, album7, album8, album9, album10));

	    return starterMusicList;
	}

	@Bean("starterUserList")
	public List<User> getStarterUsers(){
		User user1 = new User("John", "Doe", "M","12340", "john.doe@example.com");
		User user2 = new User("Jane", "Smith", "F", "12340", "jane.smith@example.com");
		User user3 = new User("Michael", "Johnson", "M","12340", "michael.johnson@example.com");
		User user4 = new User("Emily", "Davis", "F","12340", "emily.davis@example.com");
		User user5 = new User("David", "Wilson", "M", "12340", "david.wilson@example.com");

		List<User> starterUsers = new ArrayList<>(Arrays.asList(user1, user2, user3, user4, user5));	
		return starterUsers;
	}

	
	



}
