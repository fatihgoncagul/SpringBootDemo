/*
package com.example.springbootdemo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component // making this component, we make sure spring will handle this object
// spring creates this obj in container
//later when we call this getBean() method on main method, it is being injected
public class Alien {

    @Value("25")
    private int age;

    private Computer com;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    @Autowired
    @Qualifier("laptop")
    public void setCom(Computer com) {
        this.com = com;
    }

    public void  code(){
        com.compile();

    }

}
*/
