package com.example.springbootdemo;

import com.example.springbootdemo.model.Laptop;
import com.example.springbootdemo.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args); // İT ACTİVATES SPRİNG F. HAS A CONTAİNER SPRİNG BEANS.// we can acces container objects with this
        // spring is responsible for creating objects which are beans.
        System.out.println("Hello World");
        // we did create alien obj but we want spring to do it

        //Alien obj = new Alien();
       // obj.code();

        //so
/*        Alien obj = context.getBean(Alien.class); // we wrote this line but Alien obj = context.getBean(Alien.class);, IOC container will give it to us only if object is in the ioc container
        // well only doing this, does not tell spring to create objects for us we need to use annotations

        obj.code();

        Alien obj2 = context.getBean(Alien.class);
        obj2.code();
        System.out.println(obj2.getAge());*/
        // second obj2 also works but are we having the same object or the second obj2 we created?

        // we can get the bean with above method
        //what if that bean obj depended on something else
        // we need to mention that we are dependent to other object, so we need to autowire the laptop
        // we added laptop obj to alien class
        // then we added cpu to laptop object
        // used @Component and @Autowired annotations

        //now we try to build controller service and repository layers
        // we removed alien which was using computer interface

        LaptopService service = context.getBean(LaptopService.class);

        Laptop lap = context.getBean(Laptop.class);
        service.addLaptop(lap);


    }


}
/*
* ARCHITECTURE
*
* CLIENT - SERVER - DATABASE
*
* But Server will have Controller-Service-Repository Layers
* Controller's jobs is to except the request and send data back
* Service's job is to do some processing, sorting, logic etc.
* Service does not have data so it needs to connect to the database, with Data Acces Object or we can say Repository
* DAO or Repository layer is responsible for interacting with database, get the data, give it to the service, service will do processing
* and give it back to the controller
*
*
* */