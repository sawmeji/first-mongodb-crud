package com.example.firstmongodbcrud.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Category {
    @JsonProperty(value = "category_name")
    private String category_name;
}
