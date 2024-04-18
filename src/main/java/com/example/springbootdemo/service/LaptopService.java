package com.example.springbootdemo.service;

import com.example.springbootdemo.model.Laptop;
import com.example.springbootdemo.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    private LaptopRepository repo;

    public void addLaptop(Laptop lap) {
        System.out.println("addLaptop method is called");
        repo.save(lap);

    }

    public boolean isGoodFroProg(Laptop lap) {
        return true;

    }
}
