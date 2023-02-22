package com.example.firstmongodbcrud.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Edition {

    @JsonProperty(value = "edition_name")
    private String edition_name;
    @JsonProperty(value = "published_year")
    private String published_year;
    @JsonProperty(value = "quantity")
    private int quantity;
}
