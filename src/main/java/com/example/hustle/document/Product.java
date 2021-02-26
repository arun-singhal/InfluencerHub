package com.example.hustle.document;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "product")
@Getter
@Builder
@Setter
public class Product {
    private String userId;
    private String username;
    private String name;
    private String description;
    private int price;
    private List<String> productImages;
}
