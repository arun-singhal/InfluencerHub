package com.example.hustle.document;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "user")
@Getter
@Builder
@Setter
public class User {

    @Id
    private long id;
    private String username;
    private String name;
    private String email;
    private String password;
    private String profile_image;

}