package com.example.hustle.document;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "customer")
@Getter
@Builder
@Setter
public class Customer {
    private List<Plan> plans;
    private String name;
    private String number;

}
