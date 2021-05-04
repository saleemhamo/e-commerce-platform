package com.example.demo.models;


import com.example.demo.util.ApplicationConstants;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "customers")
public class Customer extends User {

    @Id
    @GeneratedValue
    private int customerId;

    private Date dateOfBirth;

    private String address;

    private ApplicationConstants.Gender gender;

    private int rating;

    private List<PaymentAccount> paymentAccounts;



}
