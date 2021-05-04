package com.example.demo.models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

class Delivery {

    @Id
    @GeneratedValue
    private int deliveryId;
}