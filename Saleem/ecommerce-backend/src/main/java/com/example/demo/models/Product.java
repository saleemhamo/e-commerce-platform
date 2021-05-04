package com.example.demo.models;


import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue
    private int productId;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;

    private String name;

    private double price;

    private int rating;

    private List<FeedBack> feedBacks;


//    images

}


