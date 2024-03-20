package com.fdmgroup.icode.library.music;

import org.springframework.stereotype.Component;

@Component
public class Record extends Music {

    private String title;
	private String artistName;
	private String genre;
	private String description;

            
    public Record() {
        super();
    }
    
    public Record(String title, String artistName, String genre, String description) {
        this();
        this.title = title;
        this.artistName = artistName;
        this.genre = genre; 
        this.description = description;     
    }

    @Override
    public String getType() {
        return "Record";
    }

    public String getTitle() {
        return title;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getGenre() {
        return genre;
    }

    public String getDescription() {
        return description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Record [title=" + title + ", artistName=" + artistName + ", genre=" + genre + ", description="
                + description + "]";
    }

    
    

    
}
