package com.example.Employee.Service;

import com.example.Employee.Model.User;

public interface UserService {
    User addUser(User user);

    Boolean UserAuthentication(String email, String password);
}
