package com.fdmgroup.icode.library.books;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Book {
	
    private Long bookId;
    private String title;
    private String author;
    private String description;
    
	private static Long nextId = 200000L;
	
	
    public Book() {
		this.bookId = generateUniqueId();
    	
    }
    
	public Book(String title, String author, String description) {
		this();
		this.title = title;
		this.author = author;
		this.description = description;
	}


	public Long getBookId() {
		return bookId;
	}



	public void setId(Long id) {
		this.bookId = id;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}
	
    public Long generateUniqueId() {
    	nextId += 5; 
        return nextId;
    }



	@Override
	public String toString() {
		return "Book [id=" + bookId + ", title=" + title + ", author=" + author + ", description=" + description + "]";
	}
    
    

}
