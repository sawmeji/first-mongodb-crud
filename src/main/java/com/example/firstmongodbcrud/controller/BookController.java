package com.example.firstmongodbcrud.controller;

import com.example.firstmongodbcrud.entity.Book;
import com.example.firstmongodbcrud.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/book/id/{id}")
    public Book getBookById(@PathVariable("id")String id){
        return bookService.getBookById(id);
    }

    @GetMapping("/book/all")
    public List<Book> getAllBook(){
        return bookService.getAllBook();
    }

    @GetMapping("/book/author/{author}")
    public List<Book> getBookByAuthor(@PathVariable("author")String author){
        return bookService.getBookByAuthor(author);
    }

    @PostMapping(value = "/book/add", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Book addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }

    @DeleteMapping("/book/delete/{id}")
    public String deleteBook(@PathVariable("id")String id){
        return bookService.deleteBook(id);
    }

    @PutMapping(value = "/book/update", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Book updateBook(@RequestBody Book book){
        return bookService.updateBook(book);
    }

    @GetMapping("/book/category/{category_name}")
    public List<Book> getBookByCategory(@PathVariable("category_name") String category_name){
        return bookService.getBookByCategoryCategoryName(category_name);
    }

    @GetMapping("/book/edition/{published_year}")
    public List<Book> getBookByPublishedYear(@PathVariable("published_year") String published_year){
        return bookService.getBookByEditionPublished_Year(published_year);
    }

}
