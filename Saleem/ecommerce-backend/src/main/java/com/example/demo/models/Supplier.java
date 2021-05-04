package com.example.demo.models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Supplier {

    @Id
    @GeneratedValue
    private int supplierId;

    private String contact;


}
