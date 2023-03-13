package com.example.Employee.Controller;

import com.example.Employee.Model.User;
import com.example.Employee.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/users")
    public ResponseEntity<Object> createItem(@RequestBody User user){
        return new ResponseEntity<>(userService.addUser(user), HttpStatus.CREATED);
    }

    @GetMapping("show/{email}/{password}")
    public ResponseEntity<Object> userAuthentication(@PathVariable("email") String email , @PathVariable("password") String password)
    {
        Boolean result = userService.UserAuthentication(email , password);
        if(result){
            return new ResponseEntity<>("Login Success full",HttpStatus.ACCEPTED);
        }else return new ResponseEntity<>("Login UnSuccess full",HttpStatus.ACCEPTED);

    }
}
