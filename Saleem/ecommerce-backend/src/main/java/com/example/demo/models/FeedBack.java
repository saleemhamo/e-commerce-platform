package com.example.demo.models;

import com.example.demo.util.ApplicationConstants;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Optional;

@Entity
@Table(name = "feedbacks")
public class FeedBack {

    @Id
    @GeneratedValue
    private int id;

    private ApplicationConstants.FeedBackType feedBackType;

    private Customer customer;

    private String feedbackText;

    private Optional<Product> product;

    private Optional<Employee> employee;

    private Optional<Delivery> delivery;



}
