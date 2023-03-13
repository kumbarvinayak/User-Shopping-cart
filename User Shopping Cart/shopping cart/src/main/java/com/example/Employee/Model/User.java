package com.example.Employee.Model;

import lombok.*;

import javax.persistence.*;

@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "item")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer id;
    @Column(name = "User_name")
    String name;
    @Column(name ="User_email")
    String email;
   @Column(name = "User_phone_no")
    Integer phone_no;
   @Column(name = "User_password")
    String password;
}