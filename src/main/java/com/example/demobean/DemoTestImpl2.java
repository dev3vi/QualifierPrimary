package com.example.demobean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DemoTestImpl2 implements DemoTest{
    @Override
    public void print() {
        System.out.println("print 2");
    }
}
