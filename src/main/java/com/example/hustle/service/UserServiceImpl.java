package com.example.hustle.service;

import com.example.hustle.document.User;
import com.example.hustle.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public User create(User user) {
        userRepository.save(user);
        return null;
    }

    @Override
    public User delete(String id) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findById(String id) {
        return null;
    }

    @Override
    public User update(User todo) {
        return null;
    }
}
