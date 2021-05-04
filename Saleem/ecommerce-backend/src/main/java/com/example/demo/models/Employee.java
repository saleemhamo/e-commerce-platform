package com.example.demo.models;

import com.example.demo.util.ApplicationConstants;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "employees")
public class Employee extends User {

    private ApplicationConstants.EmployeeRole employeeRole;

    int salary;

    List<FeedBack> feedBacks;



}
