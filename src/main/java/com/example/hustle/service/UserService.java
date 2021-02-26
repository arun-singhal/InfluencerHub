package com.example.hustle.service;

import com.example.hustle.document.User;

import java.util.List;

public interface UserService {
    User create(User user);

    User delete(String id);

    List<User> findAll();

    User findById(String id);

    User update(User todo);
}
