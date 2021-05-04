package com.example.demo.models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class PaymentAccount {

    @Id
    @GeneratedValue
    private int paymentAccountId;
}
