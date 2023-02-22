package com.example.firstmongodbcrud.dao;

import com.example.firstmongodbcrud.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface BookDao extends MongoRepository<Book, String> {
    List<Book> findByAuthor(String author);


   /* @Query("""
select b.* from book b inner join ca
""")*/
   @Query("{ category : { category_name : ?0 } }")
    List<Book> findBookByCategoryCategory_Name(String category_name);

    @Query(value = "{ 'edition.published_year' : ?0 }")
    List<Book> findBookByEditionPublished_Year(String published_year);

}
