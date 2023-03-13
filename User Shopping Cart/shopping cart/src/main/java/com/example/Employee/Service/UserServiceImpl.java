package com.example.Employee.Service;

import com.example.Employee.Model.User;
import com.example.Employee.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepo userRepo;

    @Override
    public User addUser(User user) {

        return userRepo.save(user);
    }

    @Override
    public Boolean UserAuthentication(String email, String password) {
        User u = userRepo.findByemail(email);
        return u.getPassword().equals(password);
    }

}

