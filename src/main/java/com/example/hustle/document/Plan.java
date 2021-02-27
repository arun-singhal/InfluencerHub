package com.example.hustle.document;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "plan")
@Getter
@Builder
@Setter
public class Plan {
    private String userId;
    private String userName;
    private String planId;
    private String name;
    private String description;
    private List<String> includes;
    private int fee;
}
