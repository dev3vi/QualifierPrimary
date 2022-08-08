package com.example.demobean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoBeanApplication implements CommandLineRunner {

    @Autowired
    private DemoTest demoTest;

    @Autowired
    @Qualifier("demoTestImpl1")
    private DemoTest demoTest2;
    public static void main(String[] args) {
        SpringApplication.run(DemoBeanApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        demoTest.print();
        demoTest2.print();
    }
}
