package com.example.demo.models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class User {

    @Id
    @GeneratedValue
    private int id;

    private static String username;

    private static String password;

    private static String name;


}
