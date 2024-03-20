package com.fdmgroup.icode.library.books;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/library/booksFeature")
public class BookController {

    @Autowired
    private BookService bookService;
    
    @Autowired
    private BookRepository bookRepository;

    public BookController(BookService bookService, BookRepository bookRepository) {
        super();
        this.bookService = bookService;
        this.bookRepository = bookRepository;
    }
    
    // Search by Book ID
    @GetMapping("/searchBookDetailsByIdForm")
    public String showSearchForm() {
        return "/library/booksFeature/searchBookDetailsById";
    }

    @GetMapping("/searchBookDetailsById")
    public String searchBookServiceByBookId(@RequestParam Long bookId, Model model) {
        Book book = bookService.searchByBookId(bookId);        
        if (book != null) {
            model.addAttribute("book", book);
        } else {
            model.addAttribute("errorMessage", "Book not found for ID: " + bookId);
        }
        return "/library/booksFeature/searchBookDetailsById";
    }

    // Create Book
    @GetMapping("/createBookForm")
    public String goToCreateBookForm(Model model) {
        model.addAttribute("book", new Book());
        return "/library/booksFeature/createBookForm";
    }

    @PostMapping("/createBookForm")
    public String addBook(Book book) {
        bookService.addBook(book);   
        return "redirect:/library/booksFeature/allBooks";
    }
    
    // Update Book Description
    @GetMapping("/editBookDescriptionForm")
    public String showEditBookDescriptionForm() {
        return "/library/booksFeature/editBookDescriptionById";
    }
    
    @GetMapping("/editBookDescriptionById")
    public String goToEditBookDescriptionById(@RequestParam Long bookId, Model model) {
        Book book = bookService.searchByBookId(bookId);
        model.addAttribute("book", book);
        return "/library/booksFeature/editBookDescriptionById";
    }

    @PostMapping("/editBookDescriptionById/{id}/updateBookDescription")
    public String postUpdateBookDescriptionById(@PathVariable Long id, @RequestParam String description, Model model) {
        Book book = bookService.searchByBookId(id);
        bookService.updateBookDescription(id, description);
        model.addAttribute("book", book);
        return "redirect:/library/booksFeature/allBooks";
    }

    // Delete Book
    @GetMapping("/deleteBookByIdForm")
    public String showDeleteBookByIdForm() {
        return "/library/booksFeature/deleteBookById";
    }

    @PostMapping("deleteBookById")
    public String deleteBookById(@RequestParam Long id, Model model) {
        Book book = bookService.searchByBookId(id);
        model.addAttribute("book", book);
        if(book != null){
            bookService.deleteBookById(id);
        } else {
            model.addAttribute("errorMessage", "Book not found for ID: " + id);
        }
        return "redirect:/library/booksFeature/allBooks";
    }

    // Search by Title
    @GetMapping("/searchByTitleForm")
    public String showSearchByTitleFormString () {
        return "/library/booksFeature/searchByTitle";
    }

    @GetMapping("/searchByTitle")
    public String searchByTitle(@RequestParam String title, Model model) {
        List<Book> booksByTitle = bookService.searchByTitle(title);
        if(booksByTitle != null){
            model.addAttribute("booksByTitle", booksByTitle);
        } else {
            model.addAttribute("errorMessage", "Title not found for title: " + title);
        }
        return "/library/booksFeature/searchByTitle";
    }

    // Search by Author
    @GetMapping("/searchByAuthorForm")
    public String showSearchByAuthorFormString () {
        return "/library/booksFeature/searchByAuthor";
    }

    @GetMapping("/searchByAuthor")
    public String searchByAuthor(@RequestParam String author, Model model) {
        List<Book> booksByAuthor = bookService.searchByAuthor(author);
        if(booksByAuthor != null){
            model.addAttribute("booksByAuthor", booksByAuthor);
        } else {
            model.addAttribute("errorMessage", "Author not found for author: " + author);
        }
        model.addAttribute("booksByAuthor", booksByAuthor);
        return "/library/booksFeature/searchByAuthor";
    }

    // All Books
    @GetMapping("/allBooks")
    public String goToAllBooks(Model model) {
        List<Book> allBooks = bookRepository.findAll();
        model.addAttribute("books", allBooks);
        return "/library/booksFeature/allBooks";
    }
}

