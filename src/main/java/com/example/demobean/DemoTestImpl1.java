package com.example.demobean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class DemoTestImpl1 implements DemoTest{
    @Override
    public void print() {
        System.out.println("print 1");
    }
}
