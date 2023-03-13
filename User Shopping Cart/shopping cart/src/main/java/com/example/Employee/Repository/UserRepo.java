package com.example.Employee.Repository;

import com.example.Employee.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {


    com.example.Employee.Model.User findByemail(String email);
}
