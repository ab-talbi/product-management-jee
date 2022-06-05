package com.example.produit.service;

import com.example.produit.user.User;

public interface UserService {
    User saveUser(User u);
    User getUserById(Long id);
    User getUserByEmailAndPassword(String email, String passwd);
}
