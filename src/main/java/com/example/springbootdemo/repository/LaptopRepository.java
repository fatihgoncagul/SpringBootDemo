package com.example.springbootdemo.repository;

import com.example.springbootdemo.model.Laptop;
import org.springframework.stereotype.Repository;

/*
* this is a class responsible to connect with database
* We can have all the CRUD operations here
* create read update delete
*
* */
@Repository
public class LaptopRepository {


    public  void save(Laptop lap){
        System.out.println("Saved in Database");
    }
}
