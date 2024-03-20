package com.fdmgroup.icode.library.books;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	
	@Autowired
    private BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}
	
	public List<Book> findAll(){
		List<Book> books = bookRepository.findAll();
		return books;
	}

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> searchByTitle(String title) {
        return bookRepository.findByTitle(title);
    }

    public List<Book> searchByAuthor(String author) {
        return bookRepository.findByAuthor(author);
    }

    public void deleteBookById(Long id) {
        bookRepository.deleteBookById(id);
    }

    public Book updateBookDescription(Long id, String description) {
        return bookRepository.updateDescription(id, description);
    }


	public Book searchByBookId(Long bookId) {
		Book book = bookRepository.searchByBookId(bookId);
		return book;
	}
}
