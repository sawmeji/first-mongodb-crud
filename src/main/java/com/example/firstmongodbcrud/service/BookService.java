package com.example.firstmongodbcrud.service;

import com.example.firstmongodbcrud.dao.BookDao;
import com.example.firstmongodbcrud.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private BookDao bookDao;


    public Book getBookById(String id) {
        return bookDao.findById(id).orElseThrow(() -> new RuntimeException(id+" Not Found."));
    }

    public List<Book> getAllBook() {
        return bookDao.findAll();
    }

    public List<Book> getBookByAuthor(String author) {
        return bookDao.findByAuthor(author);
    }

    public Book addBook(Book book) {
        return bookDao.save(book);
    }

    public String deleteBook(String id) {
        bookDao.deleteById(id);
        return "Successfully Deleted!";
    }

    public Book updateBook(Book book) {
        return bookDao.save(book);
    }

    public List<Book> getBookByCategoryCategoryName(String category_name) {
        return bookDao.findBookByCategoryCategory_Name(category_name);
    }

    public List<Book> getBookByEditionPublished_Year(String published_year) {
        return bookDao.findBookByEditionPublished_Year(published_year);
    }
}
