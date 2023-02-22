package com.example.firstmongodbcrud.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Book")
@Data
public class Book {
    @Id
    private String id;
    @JsonProperty(value = "name")
    private String name;
    @JsonProperty(value = "author")
    private String author;
    @JsonProperty(value = "category")
    private Category category;

    @JsonProperty(value = "edition")
    public Edition edition;

    public Book() {
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public Book(String id, String name, String author, Category category, Edition edition) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.category = category;
        this.edition = edition;
    }

/*    public void addEdition(Edition edition){
this.editions.add(edition);
    }*/
}
