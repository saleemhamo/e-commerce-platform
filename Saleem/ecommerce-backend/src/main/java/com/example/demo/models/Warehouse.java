package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table
public class Warehouse {

    @Id
    @GeneratedValue
    private int warehouseId;

    private String location;

    private List<Product> products;

    private List<Employee> employees;
}
